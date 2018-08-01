select * from TASKS;

alter table TASKS add column TASK_STARTDATE datetime;

-- to store Details of user 
CREATE TABLE USER_DETAILS (
	ID int NOT NULL AUTO_INCREMENT,
    USERID varchar(100) NOT NULL UNIQUE,
    FIRST_NAME varchar(100),
    LAST_NAME varchar(100),
    EMAILID varchar(100),
    PASSWORD varchar(100),
    ENABLED varchar(10),
    DESIGNATION varchar(100),
	ORGANIZATION varchar(100),
    DOB date,
    ADDRESS varchar(255),
    AGE int,
    PRIMARY KEY (ID)
);


-- To store user hieracrhy e.g. developer - > Lead -> Manager Or Student -> Teacher -> Principal
-- It will used to Show different data access / availability levels e.g For teacher it will show all student related data as per relation mentioned in this table....
CREATE TABLE USER_HIERARCHY (
	ID int NOT NULL AUTO_INCREMENT,
    USERID varchar(100) NOT NULL,
	PARENT_USERID varchar(100),
    PARENT_USERID_RELATION varchar(100),
    ENABLED varchar(10),
    PRIMARY KEY (ID),
    FOREIGN KEY(USERID) REFERENCES USER_DETAILS(USERID)
);
 -- insert into USER_HIERARCHY(USERID,PARENT_USERID,PARENT_USERID_RELATION,ENABLED) values ('RohitSawant','CdacAdmin','Manager','Y');

-- To manage access groups e.g Admin group to provide all access .. these entries can also be used to show different data in graphs reports etc

CREATE TABLE ACCESS_GROUPS(
	ID int NOT NULL AUTO_INCREMENT,
    GROUP_NAME varchar(100) not null unique ,
	GROUP_DESC varchar(255),
    ENABLED varchar(10),
    PRIMARY KEY (ID)
);

drop table USER_ACCESS_GROUPS;
 -- insert into ACCESS_GROUPS(GROUP_NAME,GROUP_DESC,ENABLED) values('Admin','ForAllAccess','Y');

-- To provide mapping between user and groups e.g developer can i access to admingroup 
CREATE TABLE USER_ACCESS_GROUPS (
	ID int NOT NULL AUTO_INCREMENT,
    USERID varchar(100) ,
	GROUPID varchar(100) ,
    ENABLED varchar(10),
    PRIMARY KEY (ID),
	FOREIGN KEY(GROUPID) REFERENCES ACCESS_GROUPS(GROUP_NAME),
	FOREIGN KEY(USERID) REFERENCES USER_DETAILS(USERID)
);

-- insert into USER_ACCESS_GROUPS (USERID,GROUPID,ENABLED)values ('RohitSawant','Admin','Y');

-- To maintain dropdowns those will be used in pages e.g. task type , class name , subject list etc. 
CREATE TABLE APP_DROPDOWN (
	ID int NOT NULL AUTO_INCREMENT,
    DROPDOWN_NAME varchar(100) ,
	DROPDOWN_KEY varchar(100) ,
	DROPDOWN_VALUE varchar(100),
	ENABLED varchar(10),
	PRIMARY KEY (ID)
);

select * from APP_DROPDOWN;


insert into APP_DROPDOWN (DROPDOWN_NAME,DROPDOWN_KEY,DROPDOWN_VALUE,ENABLED) values('TaskType','Meeting','Meeting','Y');

insert into APP_DROPDOWN (DROPDOWN_NAME,DROPDOWN_KEY,DROPDOWN_VALUE,ENABLED) values('TaskType','Assignment','Assignment','Y');

insert into APP_DROPDOWN (DROPDOWN_NAME,DROPDOWN_KEY,DROPDOWN_VALUE,ENABLED) values('TaskType','Development','Development','Y');


commit;

-- To store Task data .. there will be more columns in this table .. will add as we go...
CREATE TABLE TASKS (
	ID int NOT NULL AUTO_INCREMENT,
    TASKNAME varchar(100) ,
	TASKTYPE varchar(100) ,
    TASKDESC varchar(255) ,
    TASK_CREATEDATE datetime,
    TASK_UPDATEDATE datetime,
    TASK_ENDDATE datetime,
	TASK_CLOSEDDATE datetime,
	OWNER_USERID varchar(100),
    OWNER_GROUPID varchar(100),
	ENABLED varchar(10),
    PRIMARY KEY(ID)
);


-- Same as Task data but to store old activities related to task
--  e.g one assignment task is for 10 days but daily you can track progess by filling task form .. like notes everyday..
-- there will be one entry in TASKS table but muliple old entries in TASKS_ACTIVITY Table related to tasks
CREATE TABLE TASKS_ACTIVITY (
	ID int NOT NULL AUTO_INCREMENT,
    TASKID int,
 	NOTES varchar(100) ,
    TASKDESC varchar(255) ,
    TASK_CREATEDATE datetime,
    TASK_UPDATEDATE datetime,
    TASK_ENDDATE datetime,
	TASK_CLOSEDDATE datetime,
	OWNER_USERID varchar(100),
    OWNER_GROUPID varchar(100),
	ENABLED varchar(10),
	PRIMARY KEY(ID),
    FOREIGN KEY(TASKID) REFERENCES TASKS(ID)
);
