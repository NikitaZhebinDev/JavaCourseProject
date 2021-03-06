DROP TABLE IF EXISTS PUBLISHER;

CREATE TABLE PUBLISHER (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(250) UNIQUE NOT NULL,
  email VARCHAR(250) NOT NULL,
  CONSTRAINT PUB_PRIMARY_KEY PRIMARY KEY (id)
);

DROP TABLE IF EXISTS PRODUCT;

CREATE TABLE PRODUCT (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(250) UNIQUE NOT NULL,
  pub_name VARCHAR(250) NOT NULL,
  version VARCHAR(250) NOT NULL,
  CONSTRAINT PRODUCT_PRIMARY_KEY PRIMARY KEY (id),
  CONSTRAINT PRODUCT_FOREIGN_KEY FOREIGN KEY (pub_name) REFERENCES PUBLISHER (name)
);

-----------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS COUNTRY;

CREATE TABLE COUNTRY (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(250) UNIQUE NOT NULL,
  CONSTRAINT COUNTRY_PRIMARY_KEY PRIMARY KEY (id)
);

DROP TABLE IF EXISTS CAR;

CREATE TABLE CAR (
  id INT AUTO_INCREMENT NOT NULL,
  company_name VARCHAR(250) UNIQUE NOT NULL,
  country_name VARCHAR(250) NOT NULL,
  CONSTRAINT CAR_PRIMARY_KEY PRIMARY KEY (id),
  CONSTRAINT CAR_FOREIGN_KEY FOREIGN KEY (country_name) REFERENCES COUNTRY (name)
);

-----------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(250) NOT NULL,
  phone_number VARCHAR(250) NOT NULL,
  CONSTRAINT USERS_PRIMARY_KEY PRIMARY KEY (id)
);

DROP TABLE IF EXISTS PROJECTS;

CREATE TABLE PROJECTS (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(250) NOT NULL,
  user_id INT NOT NULL,
  version VARCHAR(250) NOT NULL,
  CONSTRAINT PROJECTS_PRIMARY_KEY PRIMARY KEY (id),
  CONSTRAINT PROJECTS_FOREIGN_KEY FOREIGN KEY (user_id) REFERENCES USERS (id)
);