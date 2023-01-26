create database toy;
create table toy.userinfo(
    id bigint auto_increment primary key ,
    address varchar(20),
    main_career varchar(20),
    sub_career varchar(20)
);


create table toy.users(
    id bigint auto_increment primary key ,
    info_id bigint unique ,
    foreign key(info_id) references toy.userinfo(id),
    user_id varchar(20) unique ,
    user_name varchar(20),
    user_password varchar(20),
    age int,
    created_at date,
    updated_at date
)
