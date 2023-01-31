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
);

create table toy.pet(
    id bigint auto_increment primary key ,
    sex varchar(20),
    name varchar(20),
    species varchar(20),
    category varchar(20),
    user_id bigint ,
    foreign key(user_id) references toy.users(id)
)
