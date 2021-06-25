create database paymentapp_db;

--bank details--
create table bank_details( bank_id SMALLSERIAL primary key, 
				  bank_name varchar(50) unique not null check (bank_name <> ''),
				  account_no_length int not null);