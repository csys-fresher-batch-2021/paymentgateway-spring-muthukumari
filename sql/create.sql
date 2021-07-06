create database paymentapp_db;

--bank details--
create table bank_details( bank_id SMALLSERIAL primary key, 
				  bank_name varchar(50) unique not null check (bank_name <> ''),
				  account_no_length int not null);
				  
--customer registration details--
create table customer_registration_details(customer_id serial primary key,
								mobile_no bigint not null , 
								first_name varchar(50) not null, 
								last_name varchar(50) not null,
								email_id varchar(60) not null unique, 
								user_name varchar(10) not null unique,
								password varchar(50) not null,
								registered_date date not null,
								check(user_name<>'' AND email_id<>'' AND 
								password<>'' AND mobile_no <= 9999999999 AND 
								mobile_no >= 1000000000) ); 
								