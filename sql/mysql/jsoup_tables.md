```txt

-------------------------
-- Create authors table
-------------------------
CREATE TABLE authors
(
  auth_id      char(10)  NOT NULL ,
  auth_name    char(50)  NOT NULL ,
  auth_address char(50)  NULL ,
  auth_city    char(50)  NULL ,
  auth_dynasty  char(20) NULL ,
  auth_desc   char(255) NULL,
  auth_num_works  char(30) NULL,
  auth_original_url  char(120) NULL

);


-------------------------
-- Create source table
-------------------------
CREATE TABLE source
(
  sour_id      integer   NOT NULL ,
  auth_name    char(50)  NOT NULL ,
  sour_url     char(150)  NULL ,
  article_name    char(50)  NULL
);

-------------------------
-- Create article table
-------------------------
CREATE TABLE article
(
  article_id      integer   NOT NULL ,
  auth_name    char(50)  NOT NULL ,
  article_text     TEXT  NULL ,
  translation    TEXT  NULL,
  creationBackground   TEXT  NULL,
  appreciation  TEXT  NULL,
  dynasty char(10)  NOT NULL
);





----------------------
-- Define primary keys
----------------------
ALTER TABLE authors ADD PRIMARY KEY (auth_id);
ALTER TABLE source ADD PRIMARY KEY (sour_id);
--sour_id默认值为1
alter table source modify sour_id integer default '1';
--sour_id自动增长
alter table source modify sour_id integer auto_increment;

ALTER TABLE article ADD PRIMARY KEY (article_id);
--article_id默认值为1
alter table article modify article_id integer default '1';
--article_id自动增长
alter table article modify article_id integer auto_increment;
```
