use learningjavaweb;

CREATE TABLE role (
	id bigint NOT NULL PRIMARY KEY auto_increment,
    name varchar(255) NOT NULL,
    code varchar(255) NOT NULL,
    createddate timestamp NULL,
    modifieddate timestamp NULL,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

CREATE TABLE user (
	id bigint NOT NULL PRIMARY KEY auto_increment,
    name varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    fullname varchar(255) NULL,
    status int not null,
    roleid bigint NOT NULL,
    createddate timestamp NULL,
    modifieddate timestamp NULL,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

ALTER table user add constraint fk_user_role foreign key (roleid) references role(id);

CREATE TABLE news (
	id bigint NOT NULL PRIMARY KEY auto_increment,
    titile varchar(255) NULL,
    content varchar(255) NULL,
    thumbnail varchar(255) NULL,
    shortdescription text NULL,
    categoryid bigint not null,
    createddate timestamp NULL,
    modifieddate timestamp NULL,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

CREATE TABLE category (
	id bigint NOT NULL PRIMARY KEY auto_increment,
    name varchar(255) NOT NULL,
    code varchar(255) NOT NULL,
    createddate timestamp NULL,
    modifieddate timestamp NULL,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

ALTER table news add constraint fk_news_category foreign key (categoryid) references category(id);

CREATE TABLE comment (
	id bigint NOT NULL PRIMARY KEY auto_increment,
    content text NOT NULL,
    user_id bigint not null,
    news_id bigint not null,
    createddate timestamp NULL,
    modifieddate timestamp NULL,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);

ALTER table comment add constraint fk_comment_user foreign key (user_id) references user(id);
ALTER table comment add constraint fk_comment_news foreign key (news_id) references news(id);