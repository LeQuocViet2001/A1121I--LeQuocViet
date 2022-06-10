UPDATE `cg_furama`.`employee` SET `employee_id` = '2', `username` = 'b' WHERE (`employee_id` = '1');

UPDATE `cg_furama`.`employee` SET `employee_id` = '2', `username` = 'b' WHERE (`employee_id` = '1');

INSERT INTO `cg_furama`.`employee` (`employee_id`, `employee_name`, `employee_birthday`, `employee_id_card`, `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('1', '2', '2021-12-12', 'ew', '3', '3', '2', '2', '2', '2', '2', 'a');

INSERT INTO `cg_furama`.`customer` (`customer_id`, `customer_type_id`, `customer_name`, `customer_birthday`, `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_address`) 
VALUES ('2', '2', '1', '2021-04-23', b'1', b'1', b'1', b'1', 'er');

INSERT INTO `cg_furama`.`customer` (`customer_id`, `customer_type_id`, `customer_name`, `customer_birthday`, `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_address`) 
VALUES ('3', '1', '123', '12', '12', '12', '12', '1', '1');

delimiter //
create procedure add_user( in usernameI varchar(255), in passwordI varchar(255), in roleI int  )
begin
		insert into user(username, password) values( usernameI, passwordI  );
		insert into user_role(role_id, username) values( roleI, usernameI  );
end
// delimiter ;

call add_user('2','d',2);

select * from customer where customer_type_id like '%1%'  and customer_name like '%1%' and customer_birthday like '%%';

drop trigger if exists delete_add;
delimiter //
create trigger delete_add
before delete
on employee for each row
begin
   delete from user where username = old.username;
end
// delimiter ;


drop procedure if exists insert_Detail;
delimiter //
create procedure insert_Detail( in contract_id_in int, in attach_service_id_in int, in quantity_in int)
begin
	  DECLARE updatecount INT;
      set updatecount = (select count(*) from  contract_detail where contract_id = contract_id_in and attach_service_id = attach_service_id_in);
      if(updatecount  > 0 )
		then
        delete from  contract_detail where contract_id = contract_id_in and attach_service_id = attach_service_id_in;
	  end if;
      insert into contract_detail(contract_id, attach_service_id, quantity) values(contract_id_in,attach_service_id_in,quantity_in   );

end
// delimiter ;

drop trigger if exists insert_Detail_Attach;
delimiter //
create trigger insert_Detail_Attach
before insert
on contract_detail for each row
begin
    DECLARE updatecount INT;
      set updatecount = (select count(*) from  contract_detail where contract_id = new.contract_id and attach_service_id = new.attach_service_id);

    if(updatecount  > 0 )
    then
		delete from  contract_detail where contract_id = new.contract_id and attach_service_id = new.attach_service_id;
    end if;
end  
// delimiter ;


 -- // //////////////////////-- 
 INSERT INTO `cg_furama`.`division` (`division_id`, `division_name`) VALUES ('1', 'Quản lý');
INSERT INTO `cg_furama`.`division` (`division_id`, `division_name`) VALUES ('2', 'Phục vụ');
INSERT INTO `cg_furama`.`division` (`division_id`, `division_name`) VALUES ('3', 'Hành Chính');
INSERT INTO `cg_furama`.`division` (`division_id`, `division_name`) VALUES ('Sale – Marketing', '4');
INSERT INTO `cg_furama`.`positions` (`position_id`, `position_name`) VALUES ('1', 'giám đốc.');
INSERT INTO `cg_furama`.`positions` (`position_id`, `position_name`) VALUES ('2', 'quản lý, ');
INSERT INTO `cg_furama`.`positions` (`position_id`, `position_name`) VALUES ('3', 'giám sát, ');
INSERT INTO `cg_furama`.`positions` (`position_id`, `position_name`) VALUES ('4', 'chuyên viên, ');
INSERT INTO `cg_furama`.`positions` (`position_id`, `position_name`) VALUES ('5', 'phục vụ');
INSERT INTO `cg_furama`.`positions` (`position_id`, `position_name`) VALUES ('6', 'Lễ tân');
INSERT INTO `cg_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('1', 'sau đại học');
INSERT INTO `cg_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('2', 'Đại học');
INSERT INTO `cg_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('3', 'Cao đẳng');
INSERT INTO `cg_furama`.`education_degree` (`education_degree_id`, `education_degree_name`) VALUES ('4', 'Trung cấp');
INSERT INTO `cg_furama`.`role` (`role_id`, `role_name`) VALUES ('1', 'Nhân Viên');
INSERT INTO `cg_furama`.`role` (`role_id`, `role_name`) VALUES ('2', 'Quản Lí');
INSERT INTO `cg_furama`.`role` (`role_id`, `role_name`) VALUES ('3', 'Giám Đốc');
INSERT INTO `cg_furama`.`user` (`username`, `password`) VALUES ('a', 'a');
INSERT INTO `cg_furama`.`user` (`username`, `password`) VALUES ('b', 'b');
INSERT INTO `cg_furama`.`user` (`username`, `password`) VALUES ('c', 'c');
INSERT INTO `cg_furama`.`user` (`username`, `password`) VALUES ('d', 'd');

INSERT INTO `cg_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('1', 'diamond');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('2', 'platimun');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('3', 'gold');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('4', 'sliver');


-- ///
INSERT INTO `cg_furama`.`employee` (`employee_name`, `employee_birthday`, `employee_id_card`, `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ( 'A', '2012-12-2', '12', '12', '123', '1', '1', '1', '1', '1', 'a');
INSERT INTO `cg_furama`.`employee` (`employee_name`, `employee_birthday`, `employee_id_card`, `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('A', '2012-12-2', '12', '12', '123', '1', '1', '1', '1', '1', 'b');
INSERT INTO `cg_furama`.`employee` (`employee_name`, `employee_birthday`, `employee_id_card`, `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, `position_id`, `education_degree_id`, `division_id`, `username`) VALUES ('A', '2012-12-2', '12', '12', '123', '1', '1', '1', '1', '1', 'c');

INSERT INTO `cg_furama`.`user_role` (`role_id`, `username`) VALUES ('1', 'a');
INSERT INTO `cg_furama`.`user_role` (`role_id`, `username`) VALUES ('2', 'b');
INSERT INTO `cg_furama`.`user_role` (`role_id`, `username`) VALUES ('3', 'c');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('1', 'Diamond');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_id`, `customer_type_name`) VALUES ('2', 'Platinium');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_name`) VALUES ('Gold');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_name`) VALUES ('Silver');
INSERT INTO `cg_furama`.`customer_type` (`customer_type_name`) VALUES ('Member');


INSERT INTO `cg_furama`.`service_type` (`service_type_name`) VALUES ('Villa');
INSERT INTO `cg_furama`.`service_type` (`service_type_name`) VALUES ('House');
INSERT INTO `cg_furama`.`service_type` (`service_type_name`) VALUES ('Room');

INSERT INTO `cg_furama`.`attach_service` (`attach_service_id`, `attach_service_name`, `attach_service_cost`, `attach_service_unit`, `attach_service_status`) VALUES ('1', 'massage', '1222', 'wer', 'wer');
INSERT INTO `cg_furama`.`attach_service` (`attach_service_id`, `attach_service_name`, `attach_service_cost`, `attach_service_unit`, `attach_service_status`) VALUES ('2', 'karaoke', '3234', 'werer', '234ewrw');
INSERT INTO `cg_furama`.`attach_service` (`attach_service_id`, `attach_service_name`, `attach_service_cost`, `attach_service_unit`) VALUES ('3', 'thức ăn', '32', 'asdas');
INSERT INTO `cg_furama`.`attach_service` (`attach_service_id`, `attach_service_name`, `attach_service_cost`, `attach_service_unit`) VALUES ('4', 'nước uống', '234', 'wer');
INSERT INTO `cg_furama`.`attach_service` (`attach_service_id`, `attach_service_name`, `attach_service_cost`, `attach_service_unit`) VALUES ('5', 'thuê xe di ', '4534534', 'sdas');

INSERT INTO `cg_furama`.`rent_type` (`rent_type_id`, `rent_type_id_name`, `rent_type_cost`) VALUES ('1', 'Ngay', '223');
INSERT INTO `cg_furama`.`rent_type` (`rent_type_id`, `rent_type_id_name`, `rent_type_cost`) VALUES ('2', 'Thang', '123123');
INSERT INTO `cg_furama`.`rent_type` (`rent_type_id`, `rent_type_id_name`, `rent_type_cost`) VALUES ('3', 'nam', '123123213');



