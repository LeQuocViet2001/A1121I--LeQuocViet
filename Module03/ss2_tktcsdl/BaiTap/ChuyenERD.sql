create database `ss02_ERD`;
use `ss02_ERD`;

create table phieu_xuat(
	so_px int primary key auto_increment,
    ngay_xuats date 
);

create table phieu_nhap(
	so_pn int primary key auto_increment,
    ngay_nhap date
    );
    
create table nha_cc(
	ma_ncc  int primary key auto_increment,
    ten varchar(50),
    dia_chi varchar(50),
    sdt int
    );
    
create table don_dh(
	so_dh int primary key auto_increment,
    ngay_dh date,
    ma_ncc int,
    foreign key(ma_ncc) references nha_cc(ma_ncc)
    
);

create table vat_tu(
	ma_vtu int primary key auto_increment,
    ten_vtu varchar(50)
);

create table chi_tiet_phieu_xuat(
	so_px int,
    ma_vtu int,
    dg_xuat float,
    sl_xuat int,
    primary key(so_px, ma_vtu),
    foreign key(so_px)references phieu_xuat(so_px),
	foreign key(ma_vtu)references vat_tu(ma_vtu)
);

create table chi_tiet_phieu_nhap(
	so_pn int,
    ma_vtu int,
    dg_nhap float,
    sl_nhap int,
    primary key(so_pn, ma_vtu),
    foreign key(so_pn)references phieu_nhap(so_pn),
	foreign key(ma_vtu)references vat_tu(ma_vtu)
);

create table chi_tiet_don_hang(
	ma_vtu int,
    so_dh int,
    primary key(so_dh,ma_vtu)
    );





    
