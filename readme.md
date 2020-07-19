A Simple JBoss EAP Hello World App 
===================

Tools
-------------------
* Programming Language - Java 8
* Library - Spring MVC 4
* Database - MySQL

Concept 
-------------------
A simple app to be deployed to JBoss EAP, utilizing JBoss connection pool thru JNDI and also calling a string parameter from JNDI with `@Value`.  

How to Build
------------------

```
mvn clean install
```

Database Structure
------------------

```
create dabatase db_test;
create table db_test.t_user
(
	id varchar(48) not null
		primary key,
	username varchar(100) not null,
	passwd varchar(300) not null,
	constraint t_user_username_uindex
		unique (username)
);
```