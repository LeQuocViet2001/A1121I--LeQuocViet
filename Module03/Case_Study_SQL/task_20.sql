use case_study;

-- task 20
select ma_nhan_vien as id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from nhan_vien
union 
select ma_khach_hang as  id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi from khach_hang;

-- task 21
  --   //  Hai chau ??????// //
  
drop view  v_nhanvien;
create view v_nhanvien as
select * from nhan_vien where ma_nhan_vien in
( select distinct ma_nhan_vien from hop_dong 
where ngay_lam_hop_dong = "2022-12-12" )     
 and INSTR(`dia_chi`, "Yên Bái") > 0;

-- task 22
set sql_safe_updates = 0;
update nhan_vien set dia_chi = "Liên Chiểu"
 where ma_nhan_vien in ( 
select ma_nhan_vien from  v_nhanvien
);
set sql_safe_updates =1;

-- task 23
delimiter //
create procedure sp_xoa_khach_han (in mkh int)
begin
   delete from  khach_hang where ma_khach_hang = mkh;
end
// delimiter ;

-- task 24
drop procedure  IF EXISTS   sp_them_moi_hop_dong ;
delimiter //
create procedure sp_them_moi_hop_dong  ( Ingay_lam_hop_dong datetime , Ingay_ket_thuc datetime ,
                                        Itien_dat_coc double , Ima_nhan_vien int(11) , Ima_khach_hang int(11) , Ima_dich_vu int(11))
begin
  insert into hop_dong ( ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu )
  VALUES   ( Ingay_lam_hop_dong  , Ingay_ket_thuc  ,
			 Itien_dat_coc  , Ima_nhan_vien  , Ima_khach_hang  , Ima_dich_vu );
end
// delimiter ;
call sp_them_moi_hop_dong("2012-12-12", "2021-12-12",32,1,1,3 );


-- task 25    -- xoa hop dong se luu vao trong bang  Cout_hop_dong_25

create table Cout_hop_dong_25(
 so_luong int
);

drop trigger if exists  tr_xoa_hop_dong;
delimiter //
create trigger tr_xoa_hop_dong 
after delete 
on hop_dong for each row  
begin 
declare n int;
set n = ( select count(*) from hop_dong );
 set sql_safe_updates = 0 ;
      delete from  Cout_hop_dong_25;
      set sql_safe_updates = 1 ;
	  insert into  Cout_hop_dong_25  value(n) ;	  
end
// delimiter ;

-- task 26
drop trigger if exists  tr_cap_nhat_hop_dong  ; 
delimiter //
create trigger tr_cap_nhat_hop_dong 
before update
on hop_dong for each row
begin
	if datediff( new.ngay_ket_thuc, old.ngay_lam_hop_dong ) < 3 
	then  
       	SIGNAL SQLSTATE '45000' 
            SET MESSAGE_TEXT = "Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày";
    end if;
end
// delimiter ;
set sql_safe_updates = 0;
update  hop_dong set ngay_ket_thuc = "2021-05-25" where ma_hop_dong =13;  
set sql_safe_updates = 1;

-- task 27  a
delimiter //
create function func_dem_dich_vu () 
returns int  
deterministic
begin
   declare t int;
   set t =  ( select count(*) from  dich_vu where ma_dich_vu in (
  select h.ma_dich_vu  from dich_vu dv right join hop_dong h  
  on h.ma_dich_vu =  dv.ma_dich_vu
  group by h.ma_dich_vu having sum(chi_phi_thue) > 2000000  )   );
  
  return t;
end
 // delimiter ;
select func_dem_dich_vu() ;


 -- task 27 b


with tmp as (
 select ma_nhan_vien, ( datediff(ngay_ket_thuc, ngay_lam_hop_dong) ) as nM from hop_dong   
)
select ma_nhan_vien, Max(nM) from tmp group by   ma_nhan_vien  ;

drop function if exists func_tinh_thoi_gian_hop_dong;
delimiter //
create function func_tinh_thoi_gian_hop_dong ( id int )
returns int
deterministic
begin
   declare maxDate int;
   set maxDate = 0;
   if    id in  ( select distinct ma_khach_hang from hop_dong)   
   then
        set maxDate = ( 
          select   max( datediff(ngay_ket_thuc, ngay_lam_hop_dong) )  as nM 
		from hop_dong  where ma_khach_hang = id   );
   end if;
   return maxDate;
end
// delimiter ;
select func_tinh_thoi_gian_hop_dong(4);   

-- task 28
delimiter //
create procedure  sp_xoa_dich_vu_va_hd_room()
begin
set sql_safe_updates = 0;
delete from dich_vu where ma_dich_vu in (
select distinct  hd.ma_dich_vu  from hop_dong hd left join dich_vu dv 
on hd.ma_dich_vu = dv.ma_dich_vu
left join loai_dich_vu l on l.ma_loai_dich_vu = dv.ma_loai_dich_vu
where l.ten_loai_dich_vu = "Room"
and   year( hd.ngay_lam_hop_dong) >= 2015 and year(  hd.ngay_ket_thuc )  <=2019
);
set sql_safe_updates = 1;
end
// delimiter ;  

call sp_xoa_dich_vu_va_hd_room();
