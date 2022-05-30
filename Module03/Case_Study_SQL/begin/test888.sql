drop database if exists test888;
CREATE DATABASE test888;
use test888;

CREATE table khoa(
 id_khoa int PRIMARY KEY AUTO_INCREMENT,
 ten_khoa varchar(50)   
);

CREATE TABLE sinhvien(
  masv int PRIMARY KEY AUTO_INCREMENT,
  hoten  varchar(50),
  gtinh bit, 
  id_khoa int,
    FOREIGN KEY(id_khoa) REFERENCES khoa(id_khoa) on       DELETE CASCADE on UPDATE CASCADE
   
);

create table taikhoang(
id int primary key auto_increment,
username varchar(50),
password  varchar(50)
);


