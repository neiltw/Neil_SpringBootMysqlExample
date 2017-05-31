# spring-boot-mysql-example
spring boot connect mysql and use CrudRepository or create EntityManager 

	used library
	1.Spring Boot 1.5.2.RELEASE
	2.Spring 4.3.8.RELEASE
	3.Maven 3
	4.Java 8
	5.Mysql
	6.Tomcat Embed

#Table schema

	Game 
	CREATE TABLE springboot.Game (
		id INT NOT NULL,
		name VARCHAR(45),
		description VARCHAR(255),
		CONSTRAINT `PRIMARY` PRIMARY KEY (id)
	) ;


Member

	CREATE TABLE springboot.`member` (
		id INT NOT NULL,
		name VARCHAR(45),
		description VARCHAR(45),
		CONSTRAINT `PRIMARY` PRIMARY KEY (id)
	) ;

### how to run Springboot framework

	$ spring-boot:run
