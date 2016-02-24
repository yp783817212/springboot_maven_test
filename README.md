spring集成mysql数据库，运行项目前，请确保数据库连接正常，否则启动会报错
运行方式：
	①eclipse运行WebApplication.java
	  浏览器输入127.0.0.1:8080/user/1就可以看到数据库id为1的用户信息
	②直接将target目录下的test-test-0.0.1.jar拷贝到自己的目录中
	  控制台进入目录，输入java -jar test-test-0.0.1.jar（此方法请确保数据库信息和配置文件的信息是一致的,此jar包为编译好的jar包）
数据库结构:
	1、create database test;
	2、show databases;
	3、use test;
	4、show tables;
	5、create table users
	(
		id INT NOT NULL AUTO_INCREMENT,
	 	name VARCHAR(100) NOT NULL,
	 	code VARCHAR(40) NOT NULL,
	 	create_date DATE,
	 	PRIMARY KEY ( id )
	 );
	6、insert into users(name,code,create_date) values("test","01",now());
	7、select * from users;

下一步会集成mybatis和redis

