CREATE DATABASE if not exists `my_database1`;

-- DROP DATABASE `my_database1`;

CREATE TABLE `my_database1`.`student` (
	`id` INT NOT NULL,
	`name` 	VARCHAR(50) NULL,
    `age` INT NULL,
    `country` VARCHAR(50) NULL,
    primary key(`id`)

);

