drop DATABASE if EXISTS test;
CREATE DATABASE test;
use test;

CREATE TABLE role(
role_id int PRIMARY KEY AUTO_INCREMENT,
chucvu varchar(50)
);

CREATE TABLE test123(
     id int PRIMARY KEY AUTO_INCREMENT,
     role_id int,
    username varchar(50),
    password  varchar(50),
    firstname  varchar(50),
    lastname  varchar(50),
    FOREIGN KEY(role_id) REFERENCES role(role_id) ON DELETE CASCADE ON UPDATE CASCADE

);