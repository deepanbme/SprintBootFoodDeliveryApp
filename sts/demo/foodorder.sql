create database springboot;

create table food(
id int,
foodname varchar(50),
price double
);

insert into food values(1, "Dosa", 10);
insert into food values(2, "Idly", 5);

create table foodquantity(
id int,
foodname varchar(50),
quantity int
);

insert into foodquantity values(1, "Dosa", 10);
insert into foodquantity values(2, "Idly", 10);

create table orderdetails(
orderid int,
foodname varchar(50),
quantity int
);
