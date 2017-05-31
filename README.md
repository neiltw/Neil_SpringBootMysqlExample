# spring-boot-mysql-example
spring boot connect mysql and use CrudRepository or create EntityManager 

#Table

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
