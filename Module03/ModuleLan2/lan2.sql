
drop database  if exists lan2;
create database lan2;
use lan2;

create table danh_muc( 
id_muc int primary key  auto_increment,
ten_muc varchar(50)
);

create table san_pham(
    id int primary key  auto_increment,
    ten varchar(50),
    so_luong int,
    gia int,
    mau_sac varchar(50),
    mo_ta  varchar(50),
    id_muc int,
    foreign key(id_muc) references danh_muc(id_muc)
    );


INSERT INTO `lan2`.`danh_muc` (`id_muc`, `ten_muc`) VALUES ('1', 'Phone');
INSERT INTO `lan2`.`danh_muc` (`id_muc`, `ten_muc`) VALUES ('2', 'Televition');
INSERT INTO `lan2`.`danh_muc` (`id_muc`, `ten_muc`) VALUES ('3', 'Tablet');

INSERT INTO `lan2`.`san_pham` (`id`, `ten`, `so_luong`, `gia`, `mau_sac`, `mo_ta`, `id_muc`) VALUES ('1', 'das', '1', '123', 'red', 'sdfa', '1');
INSERT INTO `lan2`.`san_pham` (`id`, `ten`, `so_luong`, `gia`, `mau_sac`, `mo_ta`, `id_muc`) VALUES ('2', 'we', '3', '23423', 'blue', 'dsfs', '2');

