create database if not exists `ss02_qlban_hang`;
use `ss02_qlban_hang`;


INSERT INTO `ss02_qlban_hang`.`customer` (`cid`, `cname`, `cage`) VALUES ('1', 'Minh Quan', '10');
INSERT INTO `ss02_qlban_hang`.`customer` (`cid`, `cname`, `cage`) VALUES ('2', 'Ngoc Oanh', '20');
INSERT INTO `ss02_qlban_hang`.`customer` (`cid`, `cname`, `cage`) VALUES ('3', 'Hong Ha', '50');
select * from customer;

INSERT INTO `ss02_qlban_hang`.`order` (`oid`, `cid`, `odate`) VALUES ('1', '1', '2006-3-21');
INSERT INTO `ss02_qlban_hang`.`order` (`oid`, `cid`, `odate`) VALUES ('2', '2', '2006-3-23');
INSERT INTO `ss02_qlban_hang`.`order` (`oid`, `cid`, `odate`) VALUES ('3', '1', '2006-3-16');
select * from `order`;


INSERT INTO `ss02_qlban_hang`.`product` (`pid`, `pname`, `pprice`) VALUES ('1', 'May Giat', '3');
INSERT INTO `ss02_qlban_hang`.`product` (`pid`, `pname`, `pprice`) VALUES ('2', 'Tu Lanh', '5');
INSERT INTO `ss02_qlban_hang`.`product` (`pid`, `pname`, `pprice`) VALUES ('3', 'Dieu Hoa', '7');
INSERT INTO `ss02_qlban_hang`.`product` (`pid`, `pname`, `pprice`) VALUES ('4', 'Quat', '1');
INSERT INTO `ss02_qlban_hang`.`product` (`pid`, `pname`, `pprice`) VALUES ('5', 'Bep Dien', '2');

INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('1', '1', '3');
INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('1', '3', '7');
INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('1', '4', '2');
INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('2', '1', '1');
INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('3', '1', '8');
INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('2', '5', '4');
INSERT INTO `ss02_qlban_hang`.`order_detail` (`oid`, `pid`, `odqty`) VALUES ('2', '3', '3');



select oid,odate, ototal_price from `order`;




select customer.cid, customer.cname, pname from order_detail 
join product on product.pid = order_detail.pid
right join `order` on order_detail.oid = `order`.oid
left join customer on `order`.cid = customer.cid;



select customer.cid, customer.cname, pname from order_detail 
join product on product.pid = order_detail.pid
right join `order` on order_detail.oid = `order`.oid
left join customer on `order`.cid = customer.cid;


select * from order_detail 
join product on product.pid = order_detail.pid
right join `order` on order_detail.oid = `order`.oid
left join customer on `order`.cid = customer.cid;


select * from customer 
where  cid not in 
(select cid from `order` join order_detail on  pid = pid ); 


select `order`.oid, oDate, (odQTY * pPrice )  as oTotal_Price    from Order_Detail
right join product on product.pid = Order_Detail.pid
right join `order` on order_detail.oid =`order`.oid
group by `order`.oid;


select * from product;
select * from order_detail;
