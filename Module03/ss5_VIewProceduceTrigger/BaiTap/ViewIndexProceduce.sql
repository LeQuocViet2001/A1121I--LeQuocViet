create database ss05_Products;
use ss05_Products;

create table products(
 id int primary key auto_increment,
 productCode  varchar(50),
productName  varchar(50),
productPrice double,
productAmount int ,
productDescription varchar(50),
productStatus   boolean
);

insert into products value
(1,"A", "Name A", 32, 3, "mt A", true),
(2,"B", "Name B", 2, 5, "mt b", false),
(3,"C", "Name C", 2, 9, "mt c", true),
(4,"D", "Name D", 7,5, "mt d", false),
(5,"F", "Name F", 2, 7, "mt f", true),
(6,"E", "Name E", 2, 4, "mt e", false);
	

select * from products;
--  Tao chi muc

--  view
create view info as
select productCode, productName, productPrice, productStatus
from products; 

select * from info;
insert into info value("N","name N", 23, 4);
 update info set productName = 'ten N' where productPrice =32;
 drop view info ;
 
-- store proceduce
delimiter //
create procedure get_All()
begin
select * from products;
end
// delimiter ; 
call get_All();


delimiter //
create procedure add_new(  
productCode  varchar(50),
productName  varchar(50),
productPrice double,
productAmount int ,
productDescription varchar(50),
productStatus   boolean)
begin
   insert into products(productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus)
value (productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus);
end
// delimiter ;

call add_new("T","nsmr t", 434 , 2 ,"mt T", true);


-- proceduce sua sp theo id
delimiter //
create procedure suaSp( in inid int,
productCode  varchar(50),
productName  varchar(50),
productPrice double,
productAmount int ,
productDescription varchar(50),
productStatus   boolean )
begin 
 set sql_safe_updates = 0; 
 update products set
 productCode =productCode,
productName  = productName,
productPrice =productPrice,
productAmount =productAmount,
productDescription =productDescription,
productStatus =productStatus
where   id = inid;
 set sql_safe_updates = 1;
end
// delimiter ;

call suaSp(1,"A", "Name ASA", 32, 3, "mt A", true);

select * from products;


-- Xoa theo id
delimiter //
create procedure xoa(in id int)
begin 
delete from products where id = id;
end
// delimiter ;
 call xoa(2);