create schema PersonsSales;

create table PersonsSales.person
(
    phone_number int primary key ,
    password varchar (50) not null,
    user_role varchar (50) not null default 'DEFAULT',
    first_name varchar (100),
    last_name varchar (100),
    user_raiting varchar (50) not null ,
    email varchar (100) not null ,
    registration_date timestamp default now() not null
);

create table PersonsSales.product
(
  product_id serial primary key,
  author_id int not null ,
  order_date timestamp default now() not null ,
  order_name varchar (250) not null ,
  price int not null ,
  order_category varchar (250),
  order_description varchar (3000),
  order_rating varchar (50) default 'DEFAULT',
  CONSTRAINT fk_product_to_person FOREIGN KEY (author_id) REFERENCES PersonsSales.person (phone_number)
);

create table PersonsSales.message
(
    message_id serial primary key ,
    message_date timestamp default now() not null ,
    sender_id int not null ,
    reciever_id  int not null ,
    text varchar (1000) not null,
    CONSTRAINT fk_message_to_author FOREIGN KEY (sender_id) REFERENCES PersonsSales.person (phone_number),
    CONSTRAINT fk_message_to_reciever FOREIGN KEY (reciever_id) REFERENCES PersonsSales.person (phone_number)
);

create table PersonsSales.comment
(
  comment_id serial primary key ,
  product_id int not null ,
  comment_date timestamp default now() not null ,
  author int not null ,
  text varchar(500) not null,
  CONSTRAINT fk_comment_to_product FOREIGN KEY (product_id) REFERENCES PersonsSales.product (product_id),
  CONSTRAINT fk_comment_to_author FOREIGN KEY (author) REFERENCES PersonsSales.person (phone_number)
);