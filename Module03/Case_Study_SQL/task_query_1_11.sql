
use case_study;

-- task 2

select * from nhan_vien;
select * from nhan_vien where (ho_ten like 'K%'
                           or ho_ten like 'T%'
                           or ho_ten like 'H%' ) and  char_length(ho_ten) < 15 ;
                       -- REGEXP_LIKE(ho_ten, '^T|^H|^K') ;  -- where regexp_like (something,'^bla|foo|^batz') 
					    -- select ho_ten ,length(ho_ten) from nhan_vien; 

-- TASK 3
select * from khach_hang  where 
( dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng Trị') 
and 
( TIMESTAMPDIFF(YEAR, ngay_sinh, CURDATE()) between 18 and 50 ) ;

-- Task 4
select * from hop_dong;

select khach_hang.ma_khach_hang, ho_ten , count(hop_dong.ma_khach_hang) AS so_lan_dat from  khach_hang  
left join hop_dong  on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang   where ma_loai_khach = 1 
  group by khach_hang.ma_khach_hang order by so_lan_dat ;
-- select khach_hang.ma_khach_hang, ho_ten , count(hop_dong.ma_khach_hang) AS so_lan_dat from  khach_hang  
-- left join hop_dong  on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang     group by khach_hang.ma_khach_hang;  
                        
                        
-- TASK 5
  

create view khachhang_loaikhach as
select khach_hang.*, ten_loai_khach from khach_hang inner join 
loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach;
        

create view hopdong_chitiet_full as
	select  hd.*, k.*, ct.so_luong 
    from   hop_dong  hd 
    left join hop_dong_chi_tiet ct on hd.ma_hop_dong = ct.ma_hop_dong
    left join dich_vu_di_kem k on k.ma_dich_vu_di_kem = ct.ma_dich_vu_di_kem  order by ma_khach_hang ;

create view dichvu_detail as 
   select  dv.*, k.ten_kieu_thue, l.ten_loai_dich_vu from dich_vu as dv  
   left join loai_dich_vu as l on dv.ma_loai_dich_vu = l.ma_loai_dich_vu 
   left join kieu_thue k on k.ma_kieu_thue = dv.ma_kieu_thue;
    
 select  kl.ma_khach_hang , ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, 
  sum(   ifnull(h.so_luong,0) * ifnull( h.gia, 0 )) +   ifnull(chi_phi_thue,0) as tong_tien 
 from ( khachhang_loaikhach kl 
left join hopdong_chitiet_full h on h.ma_khach_hang = kl.ma_khach_hang    )
left join dich_vu  dv on dv.ma_dich_vu =  h.ma_dich_vu   group by  ma_hop_dong , kl.ma_khach_hang   order by ma_khach_hang;

-- TASK 6
select ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu  from dich_vu
left join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
 where ma_dich_vu not in (
select ma_dich_vu from hop_dong hd  where  month( ngay_lam_hop_dong ) <= 3   group by ma_dich_vu );

-- Task 7

select ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da,   chi_phi_thue, ten_loai_dich_vu  from dich_vu
left join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
 where    
  ma_dich_vu not in (
select ma_dich_vu from hop_dong hd  where  year( ngay_lam_hop_dong ) = 2021
  group by ma_dich_vu ) and 
  ma_dich_vu in (
select ma_dich_vu from hop_dong hd  where  year( ngay_lam_hop_dong ) = 2020
  group by ma_dich_vu );
  
-- task 8
-- C1
select  ho_ten  from khach_hang group by ho_ten having count(ho_ten) > 1; 

-- C2
with not_name as (
select ma_khach_hang  from khach_hang group by ho_ten )
select ho_ten  from khach_hang  where ma_khach_hang 
not  in  
( select ma_khach_hang  from not_name  ) ;


-- C3

select ho_ten from khach_hang where ho_ten not in
 (select  ho_ten from khach_hang group by ho_ten having count(ho_ten) =1 ) 
 group by ho_ten;
 
 
-- task 9

select  month(h.ngay_lam_hop_dong) as "thang" ,  count(ma_khach_hang) as "so_luong_dat" from hop_dong h
  where year(h.ngay_lam_hop_dong)  = 2021 group by month(h.ngay_lam_hop_dong);
  
  -- Task 10
  select * from  hopdong_chitiet_full;
  
  select ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, sum(  ifnull( so_luong ,0 ) )  as so_luong_dich_vu_di_kem 
  from hopdong_chitiet_full group by  ma_hop_dong order by ma_hop_dong ;
  
  
  
  
  -- task 11
  select k.ma_dich_vu_di_kem, k.ten_dich_vu_di_kem from hop_dong h left join hop_dong_chi_tiet  d on h.ma_hop_dong = d.ma_hop_dong
  left join dich_vu_di_kem k on k.ma_dich_vu_di_kem = d.ma_dich_vu_di_kem
  where h.ma_khach_hang in
  (
  select ma_khach_hang from khach_hang k left join loai_khach l
  on l.ma_loai_khach = k.ma_loai_khach 
  where l.ten_loai_khach = "Diamond" and  ( dia_chi like "%Vinh" or dia_chi like "%Quảng Ngãi")
  );
  