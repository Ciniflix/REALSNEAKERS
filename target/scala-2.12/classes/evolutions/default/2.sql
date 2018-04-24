# --- Sample dataset

# --- !Ups

DELETE FROM PRODUCT;
DELETE FROM CATEGORY;
DELETE FROM USER;

insert into category (id,name) values ( 1,'Mens' );
insert into category (id,name) values ( 2,'Womens' );
insert into category (id,name) values ( 3,'Kids' );
insert into category (id,name) values ( 4,'Unisex' );


insert into product (id,category_id,name,description,stock,price) values ( 1,4,'Vans','Black and white old skool trainers',25,72.00 );
insert into product (id,category_id,name,description,stock,price) values ( 2,4,'Converse','All star all white mono Ox',32,75.00 );
insert into product (id,category_id,name,description,stock,price) values ( 3,1,'Nike','All White VapourMax',20,180.00 );
insert into product (id,category_id,name,description,stock,price) values ( 4,2,'Adidias','Pink n-5923 modelled after vintage running shoes',12,56.95 );
insert into product (id,category_id,name,description,stock,price) values ( 5,3,'Nike','White air force 1 youth trainers',28,63.00 );
insert into product (id,category_id,name,description,stock,price) values ( 6,3,'New Balance','Black & Red 247 junior trainers',33,44.00 );
insert into product (id,category_id,name,description,stock,price) values ( 7,1,'Vans','Old SKoool black fabric with flame overlays ',10,74.00 );
insert into product (id,category_id,name,description,stock,price) values ( 8,1,'Nike SB','Burgundy check solarsoft trainers',14,60.00 );
insert into product (id,category_id,name,description,stock,price) values ( 9,2,'Reebok','Dark grey classic leather tonal nbk trainers',22,55.95 );
insert into product (id,category_id,name,description,stock,price) values ( 10,4,'Adidas','White Stan Smith with black stripes ',34,100.00 );
insert into product (id,category_id,name,description,stock,price) values ( 11,3,'Puma','Suede Heart Jewel girls Trainers',1,60.00 );
insert into product (id,category_id,name,description,stock,price) values ( 12,2,'Nike','Khaki air max 270 boy youth trainers',32,106.00 );

insert into user (email,name,password,role) values ( 'admin@products.com', 'Ethan Admin', 'password', 'admin' );
insert into user (email,name,password,role) values ( 'manager@products.com', 'Eoin Manager', 'password', 'manager' );
insert into user (email,name,password,role) values ( 'customer@products.com', 'Reece Customer', 'password', 'customer' );




