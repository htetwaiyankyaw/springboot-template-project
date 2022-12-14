CREATE DATABASE `spring-rest`;

CREATE TABLE USER (
  USER_ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  USERNAME VARCHAR(30) UNIQUE NOT NULL,
  PASSWORD VARCHAR(255) NOT NULL,
  UNIQUE KEY (USERNAME),
  PRIMARY KEY (USER_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE ROLES (
  ROLE_ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  ROLE VARCHAR(45) NOT NULL,
  PRIMARY KEY (ROLE_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE USER_ROLES (
  USER_ID BIGINT(20) NOT NULL,
  ROLE_ID BIGINT(20) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;


CREATE TABLE EMPLOYEE (
  EMPLOYEE_ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(65) NOT NULL,
  DOB DATETIME DEFAULT NULL,
  GENDER VARCHAR(10) NOT NULL,
  MOBILE VARCHAR(65) DEFAULT NULL,
  EMAIL VARCHAR(60) DEFAULT NULL,
  CREATED_DATE DATETIME NOT NULL,
  UPDATED_DATE DATETIME DEFAULT NULL,
  PRIMARY KEY (EMPLOYEE_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

INSERT INTO USER (USER_ID, USERNAME, PASSWORD) VALUES (1, 'admin', '$2a$12$hs9.Rq8kNKS8RoQTfwThGeO.XQ6L.mda2nPwQUf0nnokiZkrj18iK');
INSERT INTO USER (USER_ID, USERNAME, PASSWORD) VALUES (2, 'user', '$2a$12$Pz7/5Wn0R62EeUPLAKHzfOi9.RxMfu87C8Vo.HifdcIncXEGHntWS');

INSERT INTO ROLES (ROLE_ID, ROLE) VALUES (1, 'ADMIN');
INSERT INTO ROLES (ROLE_ID, ROLE) VALUES (2, 'USER');

INSERT INTO USER_ROLES (USER_ID, ROLE_ID) VALUES(1, 1);
INSERT INTO USER_ROLES (USER_ID, ROLE_ID) VALUES(2, 2);

INSERT INTO EMPLOYEE (NAME, DOB, GENDER, MOBILE, EMAIL, CREATED_DATE) VALUES ("David", '1986-12-02', 'MALE', '09420000773', 'daivd@gmail.com', now());
INSERT INTO EMPLOYEE (NAME, DOB, GENDER, MOBILE, EMAIL, CREATED_DATE) VALUES ("Mike", '1990-10-25', 'MALE', '0942568971', 'mike@gmail.com', now());
INSERT INTO EMPLOYEE (NAME, DOB, GENDER, MOBILE, EMAIL, CREATED_DATE) VALUES ("Htet Wai Yan Kyaw", '1991-12-15', 'MALE', '0942025023', 'hwyk@gmail.com', now());