insert into todo(ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
values
(10001,'rosa','Learn MySQL Database Basic', CURRENT_DATE, true),
(10002,'rosa','Learn Advanced MySQL Database', CURRENT_DATE, false),
(10003,'rosa','Practice AI LLM project', CURRENT_DATE, false),
(10004,'max','Learn basic Cantonese food cooking', CURRENT_DATE, false),
(10005,'max','Get a certificate of Baking Chief', CURRENT_DATE, false),
(10006,'max','Get a certificate of Chinese Food Chief', CURRENT_DATE, false);


insert into "user"(ID, NAME, BIRTH_DATE)
values
(10000,'celia', CURRENT_DATE),
(10001,'rosa', CURRENT_DATE),
(10002,'max', CURRENT_DATE);