create database `ss_01`;
use `ss_01`;

create table `ss_01`.`class`(
	`id` int not null auto_increment,
    `name` varchar(50),
    primary key(id)
    
);

insert into class(name) value("A"),("B"),("C");
-- Xoa het bang
truncate class;

alter table class add khoa varchar(50);
alter table class drop khoa;
alter table class add khoa varchar(50);
select * from `ss_01`.`class`;


create table teacher(
	id int not null auto_increment,
    name varchar(50),
    age int,
    country varchar(50),
    primary key(id)
    );
    
    
insert into teacher(name,age,country) value("viet",2,"A"),("Hoang",4,"B"),("Cho",4,"B");
truncate teacher;
delete from teacher where id =2;

SET SQL_SAFE_UPDATES=0;
update teacher set name = "Hoang cho" where `name` = "Hoang";
SET SQL_SAFE_UPDATES=1;

select * from teacher;



    