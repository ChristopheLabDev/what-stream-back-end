CREATE TABLE roles(
	id SERIAL PRIMARY KEY,
	name varchar (30) NOT NULL
	
	);
CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	username varchar (60) NOT NULL,
	password varchar (60) NOT NULL,
	roles_id INTEGER,
	CONSTRAINT fk_roles_id
    	FOREIGN KEY (roles_id)
    	REFERENCES roles(id)
	);