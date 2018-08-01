CREATE TABLE TRAVEL (
    ID INT PRIMARY KEY,
    NAME VARCHAR (100),
    PLACE_TO VARCHAR(20),
    PLACE_FROM VARCHAR(20),
    DATE_OF_START DATE,
    DATE_OF_END DATE,
    DESCRIPTION VARCHAR (2000)
);

create table marker (
    marker_id int primary key,
    lat varchar(20),
    lng varchar(20)
);