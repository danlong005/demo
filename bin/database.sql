create database demo;

create table employees (
  id bigint generated always as identity primary key,
  first_name varchar(255),
  last_name varchar(255),
  hired_at timestamp,
  salary numeric(15,2),
  date_of_birth date,
  created_at timestamp, 
  updated_at timestamp
);
