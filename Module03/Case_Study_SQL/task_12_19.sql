use case_study;
-- task 12
select * from hopdong_chitiet_full;

 select 
         f.ma_hop_dong, nv.ho_ten as "Ten nhan vien", kh.ho_ten as "Ten khach Hang",  kh.so_dien_thoai, dv.ma_dich_vu ,dv.ten_dich_vu, 
  sum(f.so_luong) as so_luong_dich_vu_di_kem   from  hopdong_chitiet_full f 
 left join dich_vu dv  on f.ma_dich_vu = dv.ma_dich_vu 
 left join nhan_vien  nv on f.ma_nhan_vien = nv.ma_nhan_vien
  left join khach_hang kh  on kh.ma_khach_hang = f.ma_khach_hang
  where year(ngay_lam_hop_dong) =2020  and month( ngay_lam_hop_dong ) >= 10 
      and dv.ma_dich_vu not in (
     select ma_dich_vu from hop_dong g 
     where year(ngay_lam_hop_dong) = 2021 and month( ngay_lam_hop_dong ) <= 6  
  )
 group by f.ma_hop_dong;  
 
 -- TASK 13
 
with tmp as 
(

SELECT    ma_dich_vu_di_kem, sum(so_luong) as "sl"  
	  FROM hopdong_chitiet_full
      GROUP BY ma_dich_vu_di_kem
) 
select *  from tmp where tmp.sl =  ( select max(sl) from tmp)  ;

-- TASK 14
select ma_hop_dong, ten_dich_vu_di_kem, ten_dich_vu_di_kem, 
  count(ma_dich_vu_di_kem) as so_lan_su_dung
from hopdong_chitiet_full    group by  ma_dich_vu_di_kem having so_lan_su_dung = 1   ;
      
--  TASK 15

create view nhanvien_full as
select nv.*, t.ten_trinh_do , v.ten_vi_tri, b.ten_bo_phan  from nhan_vien nv
left join trinh_do  t on  nv.ma_trinh_do = t.ma_trinh_do
left join vi_tri v on v.ma_vi_tri = nv.ma_vi_tri
left join bo_phan b on b.ma_bo_phan = nv.ma_bo_phan;


select n.ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi , count( d.ma_hop_dong ) as "so_luong_hd"
from  hop_dong d
left join nhanvien_full n on n.ma_nhan_vien = d.ma_nhan_vien
 group by n.ma_nhan_vien having so_luong_hd <= 3;

-- task 16

select n.ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi , count( d.ma_hop_dong ) as "so_luong_hd"
from  nhanvien_full n 
left join  hop_dong d on n.ma_nhan_vien = d.ma_nhan_vien
where  "so_luong_hd" = 0
 group by n.ma_nhan_vien;
 
set sql_safe_updates = 0;
  delete from nhan_vien where nhan_vien.ma_nhan_vien not in
 (
 select DISTINCT  ma_nhan_vien from hop_dong where year( ngay_lam_hop_dong ) between 2019  and 2021 
 );
  set sql_safe_updates = 1;
  
  -- Task 17
create view khachhang_tiem as
select  kl.ma_khach_hang , kl.ma_loai_khach  ,kl.ten_loai_khach, ho_ten, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, 
  sum(   ifnull(h.so_luong,0) * ifnull( h.gia, 0 )  )   +   ifnull(chi_phi_thue,0)    as tong_tien 
from  khachhang_loaikhach kl 
left join hopdong_chitiet_full h on h.ma_khach_hang = kl.ma_khach_hang    
left join dich_vu  dv on dv.ma_dich_vu =  h.ma_dich_vu  
left join loai_khach lk on lk.ma_loai_khach = kl.ma_loai_khach  
 group by  kl.ma_khach_hang order by  kl.ma_khach_hang; 

select * from  khachhang_tiem;

set sql_safe_updates = 0;
update  khach_hang u set u.ma_loai_khach = 1  where ma_khach_hang  in ( 
select tmp.ma_khach_hang from  khachhang_tiem tmp  where year(ngay_lam_hop_dong) =2021 and  tmp.ma_loai_khach = 2   )  ;   
set sql_safe_updates = 1; 


-- task 18


ALTER TABLE hop_dong
DROP FOREIGN KEY hop_dong_ibfk_2;

ALTER TABLE hop_dong_chi_tiet
DROP FOREIGN KEY hop_dong_chi_tiet_ibfk_1;



ALTER TABLE hop_dong 
ADD CONSTRAINT hop_dong_ibfk_2
  FOREIGN KEY (ma_khach_hang)
  REFERENCES khach_hang (ma_khach_hang)
  ON DELETE CASCADE  
  ON UPDATE CASCADE;
  
ALTER TABLE hop_dong_chi_tiet
DROP FOREIGN KEY hop_dong_chi_tiet_ibfk_1;

ALTER TABLE hop_dong_chi_tiet 
ADD CONSTRAINT hop_dong_chi_tiet_ibfk_1
 foreign key(ma_hop_dong)
 references hop_dong(ma_hop_dong)
  ON DELETE CASCADE  
  ON UPDATE CASCADE;  

set sql_safe_updates = 0;
delete from khach_hang where ma_khach_hang in (
select  ma_khach_hang from hop_dong where year(ngay_lam_hop_dong)  < 2021  );
set sql_safe_updates = 1;

-- Task 19

set sql_safe_updates = 0;

update dich_vu_di_kem set gia =  gia * 2 where ma_dich_vu_di_kem in  (
select a.ma_dich_vu_di_kem from (
select h.ma_dich_vu_di_kem, sum(so_luong) as so_lan from hop_dong_chi_tiet h
left join dich_vu_di_kem  k on k.ma_dich_vu_di_kem =  h.ma_dich_vu_di_kem 
where h.ma_hop_dong 
in (select  ma_hop_dong from hop_dong where  year(ngay_lam_hop_dong) = 2020)
group by h.ma_dich_vu_di_kem having so_lan >=10  ) as a   
);
set sql_safe_updates = 1;