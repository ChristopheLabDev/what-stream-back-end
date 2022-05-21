/*sudo psql -h localhost -p 5432 -U postgres
--\i database.ddl.sql
--\i schema.ddl.sql
\i data.dml.sql*/


DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS directors;
DROP TABLE IF EXISTS actors;
DROP TABLE IF EXISTS artists;
DROP TABLE IF EXISTS content;
DROP TABLE IF EXISTS kinds;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS roles;

CREATE TABLE roles(
	id SERIAL PRIMARY KEY,
	name varchar (30) NOT NULL
	);

CREATE TABLE categories(
	id SERIAL PRIMARY KEY,
	name varchar (30) NOT NULL
 	);
 
 CREATE TABLE kinds(
	id SERIAL PRIMARY KEY,
	name varchar (70) NOT NULL
 	);
 	
 		CREATE TABLE content(
	id SERIAL PRIMARY KEY,
	name varchar (70) NOT NULL,
	description varchar (255) NOT NULL,
	author varchar (70) NOT NULL,
	picturelink varchar (255),
	releasedate date,
	duration integer NOT NULL,
	rate integer
	);
	
	 CREATE TABLE artists(
	id SERIAL PRIMARY KEY,
	firstname varchar (100) NOT NULL,
	lastname varchar (100) NOT NULL
 	);
 	
 CREATE TABLE actors(
 	artist_id INTEGER NOT NULL,
 	content_id INTEGER NOT NULL,
	CONSTRAINT fk_artist_id
    	FOREIGN KEY (artist_id)
    	REFERENCES artists(id),
    CONSTRAINT fk_content_id
    	FOREIGN KEY (content_id)
    	REFERENCES content(id)
 	);
 	
 	CREATE TABLE directors(
 	artist_id INTEGER NOT NULL,
 	content_id INTEGER NOT NULL,
	CONSTRAINT fk_artist_id
    	FOREIGN KEY (artist_id)
    	REFERENCES artists(id),
    CONSTRAINT fk_content_id
    	FOREIGN KEY (content_id)
    	REFERENCES content(id)
 	);
	
CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	pseudo varchar (70) NOT NULL,
	username varchar (255) NOT NULL,
	password varchar (255) NOT NULL,
	roles_id INTEGER,
	CONSTRAINT fk_roles_id
    	FOREIGN KEY (roles_id)
    	REFERENCES roles(id)
	);
	

