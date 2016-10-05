drop table Admin11 cascade CONSTRAINTS;
drop table User11 cascade CONSTRAINTS;
drop table Article11 cascade CONSTRAINTS;
drop table image11 cascade CONSTRAINTS;
create table Admin11
(
admin_ID varchar2(50),
admin_password varchar2(50) NOT NULL,

CONSTRAINT admin_ID_pk PRIMARY KEY(admin_ID)
);

create table User11
(
user_number number,
user_ID varchar2(50) UNIQUE,
user_password varchar2(50) NOT NULL,
user_name varchar2(50) NOT NULL,
user_cellPhone varchar2(50) NOT NULL,

CONSTRAINT user_number_pk PRIMARY KEY(user_number)
);

create table article11
(
article_number number CONSTRAINT Article11_article_number_pk PRIMARY KEY,
article_title varchar2(100) NOT NULL,
article_content varchar2(800) NOT NUll,
article_writer varchar2(50) NOT NULL,
article_writeDate date NOT NULL,
article_readCount number NOT NULL,
user_number number NOT NULL CONSTRAINT Article11_user_number_fk REFERENCES User11(user_number)

);

create table image11
(
image_number number CONSTRAINT image11_image_number_pk PRIMARY KEY,
image_title varchar2(100) NOT NULL,
image_content varchar2(800) NOT NUll,
image_writer varchar2(50) NOT NULL,
image_writeDate date NOT NULL,
image_readCount number NOT NULL,
user_number number NOT NULL CONSTRAINT image11_user_number_fk REFERENCES User11(user_number)

);

