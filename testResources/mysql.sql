use jbtests;


DROP TABLE IF EXISTS footab;
create table footab(
      username varchar(50) PRIMARY KEY NOT NULL ,
      age int(11) not null,
      enabled boolean not null);


 insert into footab values('irina',46,true);
 insert into footab values('vera',20,true);
 insert into footab values('andrey',46,true);
 insert into footab values('boromir',1,false);
