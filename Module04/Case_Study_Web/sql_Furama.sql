drop database if exists cg_furama;
create database  cg_furama;
use cg_furama;

create table positions(
position_id int primary key auto_increment,
position_name varchar(50)
);

create table education_degree(
education_degree_id int primary key auto_increment,
education_degree_name varchar(50)
);

create table division(
division_id int primary key auto_increment,
division_name varchar(50)
);


create table attach_service(
attach_service_id int primary key auto_increment,
attach_service_name varchar(50),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(50)
);

create table rent_type(
rent_type_id int primary key auto_increment,
rent_type_id_name varchar(50),
rent_type_cost double
);

create table service_type(
service_type_id int primary key auto_increment,
service_type_name varchar(50)
);

create table customer_type(
customer_type_id int primary key auto_increment,
customer_type_name varchar(50)
);

create table service(
service_id int primary key auto_increment,
service_name varchar(50),
service_area int,
service_cost double,
service_max_people int,
rent_type_id int,
service_type_id int,
standard_room varchar(50),
description_other_convenience varchar(50),
pool_area double,
number_of_floors int,
foreign key(rent_type_id) references rent_type(rent_type_id)  on delete cascade on update cascade,
foreign key(service_type_id) references service_type(service_type_id)  on delete cascade on update cascade
);

create table customer(
customer_id int primary key auto_increment,
customer_type_id int,
customer_name varchar(50),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(50),
customer_phone varchar(50),
customer_email varchar(50),
customer_address varchar(50),
foreign key(customer_type_id) references customer_type(customer_type_id)  on delete cascade on update cascade
);

create table `user`( 
username varchar(255) primary key,
password varchar(255)
);

create table `role`( 
role_id int primary key,
role_name varchar(255)
);

create table user_role(
role_id int,
username  varchar(50),
primary key( role_id,username), 
foreign key(role_id) references `role`(role_id)  on delete cascade on update cascade,
foreign key(username) references `user`(username )  on delete cascade on update cascade
);


create table employee(
employee_id int primary key auto_increment,
employee_name varchar(50),
employee_birthday date,
employee_id_card  varchar(50),
employee_salary double,
employee_phone varchar(50),
employee_email varchar(50),
employee_address varchar(50),
position_id int,
education_degree_id int,
division_id int,
username varchar(255),
foreign key(position_id) references positions(position_id)   
    on delete cascade on update cascade,
foreign key(education_degree_id) references education_degree(education_degree_id)   
    on delete cascade on update cascade,
foreign key(division_id) references division(division_id)   
    on delete cascade on update cascade,
foreign key(username) references `user`(username)   
    on delete cascade on update cascade
);


create table contract( 
contract_id int primary key auto_increment,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id int,
customer_id int,
service_id int,
foreign key(employee_id) references employee(employee_id)   
    on delete cascade on update cascade,
foreign key(customer_id) references customer(customer_id)   
    on delete cascade on update cascade,
foreign key(service_id) references service(service_id)   
    on delete cascade on update cascade
);

create table contract_detail(
contract_detail_id int primary key auto_increment,
contract_id  int,
attach_service_id int,
quantity int,
foreign key(attach_service_id) references attach_service(attach_service_id)   
    on delete cascade on update cascade,
foreign key(contract_id) references contract(contract_id)   
    on delete cascade on update cascade

);





