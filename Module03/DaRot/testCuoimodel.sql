

drop database  if exists endmodule;

create database endmodule;
use endmodule;

create table sach(
ma_sach int primary key  auto_increment,
ten_sach varchar(50),
tac_gia varchar(50),
mo_ta  varchar(50),
so_luong int
);

create table hoc_sinh( 
ma_hs int primary key  auto_increment,
ten_hs varchar(50),
lop varchar(50)
);

create table the_muon_sach(
ma_muon_sach varchar(50) primary key,
ma_sach int,
ma_hs int,
trang_thau bit,
ngay_muon date,
ngay_tra date,
foreign key(ma_sach) references sach(ma_sach) on delete cascade on update cascade,
foreign key(ma_hs) references hoc_sinh(ma_hs) on delete cascade on update cascade
);

INSERT INTO `endmodule`.`hoc_sinh` (`ma_hs`, `ten_hs`, `lop`) VALUES ('1', 'An', 'A');
INSERT INTO `endmodule`.`hoc_sinh` (`ma_hs`, `ten_hs`, `lop`) VALUES ('2', 'Viet', 'B');
INSERT INTO `endmodule`.`hoc_sinh` (`ma_hs`, `ten_hs`, `lop`) VALUES ('3', 'AS', 'A');

INSERT INTO `endmodule`.`sach` (`ma_sach`, `ten_sach`, `tac_gia`, `mo_ta`, `so_luong`) VALUES ('1', 'ABC', 'dasda', 'ada', '1');
INSERT INTO `endmodule`.`sach` (`ma_sach`, `ten_sach`, `tac_gia`, `mo_ta`, `so_luong`) VALUES ('2', 'dsad', 'dsad', 'sad', '2');



drop trigger if exists muon_sach;
delimiter //
create trigger muon_sach
before insert
on library_card for each row
begin
    DECLARE updatecount INT;
      set updatecount = (select quantity from  book  where id = new.id );
	update book  set quantity = (updatecount - 1 ) where id   = new.id;
end  
// delimiter ;


drop procedure if exists tra_sach;
delimiter //
create procedure tra_sach(in ma_muon_sach_in varchar(50), in ma_sach_in int )
begin
		set sql_safe_updates = 0;
        UPDATE `the_muon_sach` SET `trang_thau` = 0  WHERE (`ma_muon_sach` = ma_muon_sach_in );
        UPDATE `endmodule`.`sach` SET `so_luong` = (`so_luong` + 1)  WHERE (`ma_sach` = ma_sach_in );
        set sql_safe_updates = 1;
end
// delimiter ;



call tra_sach( 'A' ,4);
SELECT * FROM endmodule.sach;


alter table the_muon_sach add column status bit default 1 ;