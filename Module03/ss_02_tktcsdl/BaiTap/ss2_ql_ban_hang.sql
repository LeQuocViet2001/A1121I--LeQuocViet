create database if not exists `ss02_qlban_hang`;
use `ss02_qlban_hang`;

create table customer(
	cid int primary key auto_increment,
    cname varchar(50),
    cage int
    );
    
create table product(
	pid int primary key auto_increment,
    pname varchar(50),
    pprice float
    );   
create table `order` (
	oid int primary key auto_increment,
    cid int,
    odate date,
    ototal_price float,
    foreign key( cid)  references customer(cid)
    );
    
 
create table order_detail(
	oid int,
    pid int,
    odqty varchar(50),
    primary key(oid,pid),
    foreign key(oid) references `order`(oid),
    foreign key(pid) references product(pid)
);