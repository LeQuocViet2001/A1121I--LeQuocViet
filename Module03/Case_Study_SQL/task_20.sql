
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


-- task 25
select count(*) from hop_dong;


delimiter //
create trigger tr_xoa_hop_dong
after delete
on hop_dong for each row  
begin
      SET global general_log = 0;
      SIGNAL SQLSTATE '01000';
end
// delimiter ;




drop trigger if exists  add_row;
delimiter //
create trigger add_row 
after insert 
on trinh_do for each row  
begin 
    
	  select count(ma_trinh_do) from trinh_do  ;
    
end
// delimiter ;