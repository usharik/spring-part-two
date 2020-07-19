alter table `products` drop FOREIGN KEY `FKa3a4mpsfdf4d2y6r8ra3sc8mv`;
GO

alter table `products` drop FOREIGN KEY `FKog2rp4qthbtt2lfyhfo32lsw9`;
GO

alter table `products_pictures` drop FOREIGN KEY `FKh3amnci4cl7xcl1al140xw79e`;
GO

drop table `products`;
GO

alter table `brands` drop key `UC_BRANDSNAME_COL`;
GO

drop table  `brands`;
GO

alter table `categories` drop key `UC_CATEGORIESNAME_COL`;
GO

drop table  `categories`;
GO

-- сначала нужно удалить внешний ключ
alter table `pictures` drop FOREIGN KEY `FKe9cv52k04xoy6cj8xy308gnw3`;
GO

-- потом уникальность, которую это внешний ключ использовал
alter table `pictures` drop key `UK_ehsu2tyinopypjox1ijxt3g3c`;
GO

alter table `products_pictures` drop FOREIGN KEY `FKloucf8ggy74nmdej2jmvttvi4`;
GO

drop table `pictures`;
GO

drop table `products_pictures`;
GO

drop table `pictures_data`;
GO