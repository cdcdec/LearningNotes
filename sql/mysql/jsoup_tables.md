```txt

-------------------------
-- Create Customers table
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


----------------------
-- Define primary keys
----------------------
ALTER TABLE authors ADD PRIMARY KEY (auth_id);
```
