-- Categories
insert into categories values (1,'2023-08-05','2023-08-05','streamline:shopping-catergories-shirt-clothing-t-shirt-men-top','Одяг');
insert into categories values (2,'2023-08-05','2023-08-05','fluent:sport-soccer-20-filled','Спорт');
insert into categories values (3,'2023-08-05','2023-08-05','streamline:shopping-catergories-sofa-decoration-furniture-interior-design-couch-sofa-decorate','Меблі');
insert into categories values (4,'2023-08-05','2023-08-05','mdi:laptop','Техніка');
insert into categories values (5,'2023-08-05','2023-08-05','ph:books-light','Книжки');
insert into categories values (6,'2023-08-05','2023-08-05','solar:cosmetic-linear','Косметика');
insert into categories values (7,'2023-08-05','2023-08-05','radix-icons:home','Все для дому');
insert into categories values (8,'2023-08-05','2023-08-05','ph:paw-print-light','Зоотовари');

-- Subcategories
insert into subcategories values (1,'2023-08-05','2023-08-05', 'material-symbols:woman', 'Для жінок',1);
insert into subcategories values (2,'2023-08-05','2023-08-05', 'ic:round-man', 'Для чоловіків', 1);
insert into subcategories values (3,'2023-08-05','2023-08-05', 'bx:child', 'Для дітей', 1);
insert into subcategories values (4,'2023-08-05','2023-08-05', 'streamline:travel-hotel-dumbell-sports-weights-dumbbell-sport-fitness', 'Спортивний інвентар', 2);
insert into subcategories values (5,'2023-08-05','2023-08-05', 'material-symbols:medication-outline', 'Спортивне харчування', 2);
insert into subcategories values (6,'2023-08-05','2023-08-05', 'solar:chair-linear', 'Стільці',3);
insert into subcategories values (7,'2023-08-05','2023-08-05', 'solar:sofa-linear', 'Дивани',3);
insert into subcategories values (8,'2023-08-05','2023-08-05', 'mdi:laptop', 'Комп''ютери',4);
insert into subcategories values (9,'2023-08-05','2023-08-05', 'gridicons:phone', 'Телефони', 4);
insert into subcategories values (10,'2023-08-05','2023-08-05', 'game-icons:feather', 'Художня література',5);
insert into subcategories values (11,'2023-08-05','2023-08-05', 'material-symbols:science-outline', 'Наукова література', 5);
insert into subcategories values (12,'2023-08-05','2023-08-05', 'icon-park-outline:cosmetic-brush', 'Декоративна косметика', 6);
insert into subcategories values (13,'2023-08-05','2023-08-05', 'solar:perfume-outline', 'Парфумерія', 6);
insert into subcategories values (14,'2023-08-05','2023-08-05', 'icon-park-outline:foundation-makeup', 'Догляд за тілом', 6);
insert into subcategories values (15,'2023-08-05','2023-08-05', 'material-symbols:face-3-outline', 'Догляд за обличчям', 6);
insert into subcategories values (16,'2023-08-05','2023-08-05', 'icon-park-outline:hair-dryer', 'Догляд за волоссям', 6);
insert into subcategories values (17,'2023-08-05','2023-08-05', 'fluent-emoji-high-contrast:fork-and-knife-with-plate', 'Посуд', 7);
insert into subcategories values (18,'2023-08-05','2023-08-05', 'icon-park-outline:spa-candle', 'Декор', 7);
insert into subcategories values (19,'2023-08-05','2023-08-05', 'Card/lucide:dog', 'Товари для собак', 8);
insert into subcategories values (20,'2023-08-05','2023-08-05', 'Card/solar:cat-linear', 'Товари для кішок', 8);
insert into subcategories values (21,'2023-08-05','2023-08-05', 'Card/icon-park-outline:rabbit', 'Товари для гризунів', 8);

--product
-- category 1
insert into product values(1,'2022-07-15','2023-08-05', 'La-la-la', true, 'Чорна сукня', 2000.00, 12345678, 34, 'Gucci', 1);
insert into product values(2,'2022-08-05','2023-08-05', 'La-la-la', true, 'Червона сукня', 1500.00, 12345671, 24, 'Armani', 1);
insert into product values(3,'2022-06-13','2023-08-05', 'La-la-la', false, 'Біла сукня', 1800.00, 12345672, 14, 'Valentino', 1);
insert into product values(4,'2022-08-07','2023-08-05', 'La-la-la', true, 'Чорна спідниця', 1000.00, 12345673, 32, 'Gucci', 1);
insert into product values(5,'2022-05-12','2023-08-05', 'La-la-la', true, 'Червона спідниця', 800.00, 12345674, 56, 'Armani', 1);
insert into product values(6,'2022-04-02','2023-08-05', 'La-la-la', false, 'Біла спідниця', 1200.00, 12345675, 2, 'Valentino', 1);
insert into product values(7,'2022-08-02','2023-08-05', 'La-la-la', true, 'Біла куртка', 2200.00, 12345678, 37, 'Vetements', 2);
insert into product values(8,'2022-11-05','2023-08-05', 'La-la-la', true, 'Чорна куртка', 2200.00, 12345668, 22, 'Versace', 2);
insert into product values(9,'2022-05-11','2023-08-05', 'La-la-la', false, 'Біла футболка', 700.00, 12345658, 56, 'Valentino', 2);
insert into product values(10,'2022-12-23','2023-08-05', 'La-la-la', true, 'Футболка Морті', 6000.00, 12345648, 11, 'Rick&Morty', 2);
insert into product values(11,'2022-08-22','2023-08-05', 'La-la-la', true, 'Чорна  футболка', 400.00, 12345638, 5, 'Valentino', 2);
insert into product values(12,'2022-08-07','2023-08-05', 'La-la-la', true, 'Вишиванка', 3200.00, 12345628, 11, 'M-tac', 2);
insert into product values(13,'2022-04-05','2023-08-05', 'La-la-la', false, 'Білі шкарпетки', 100.00, 12345618, 78, 'H&M', 3);
insert into product values(14,'2022-08-08','2023-08-05', 'La-la-la', true, 'Комбінізон зимній', 2100.00, 12345608, 14, 'GAP', 3);
insert into product values(15,'2022-02-05','2023-08-05', 'La-la-la', true, 'Джоггери', 700.00, 12345518, 4, 'GAP', 3);
insert into product values(16,'2022-01-09','2023-08-05', 'La-la-la', true, 'В''язана шапочка *Звірятко*', 300.00, 12345418, 23, 'H&M', 3);
insert into product values(17,'2022-08-21','2023-08-05', 'La-la-la', false, 'Футболка *Райдуга*', 500.00, 12345318, 25, 'H&M', 3);
insert into product values(18,'2022-08-05','2023-08-05', 'La-la-la', true, 'Костюм *Слона*', 5000.00, 12345218, 1, 'РУЧНА РОБОТА', 3);

-- category 2
insert into product values(19,'2022-07-22','2023-08-05', 'La-la-la', true, 'М''яч футбольний', 1200.00, 12335618, 34, 'Nike', 4);
insert into product values(20,'2022-06-05','2023-08-05', 'La-la-la', true, 'М''яч волейбольний', 800.00, 12325618, 56, 'Nike', 4);
insert into product values(21,'2022-08-13','2023-08-05', 'La-la-la', false, 'Шахи', 1000.00, 12315618, 12, 'ThinkFun', 4);
insert into product values(22,'2022-07-12','2023-08-05', 'La-la-la', true, 'Протеїн', 2000.00, 12305618, 120, 'Pure whey', 5);
insert into product values(23,'2022-06-09','2023-08-05', 'La-la-la', true, 'Креатин', 2300.00, 12324618, 88, 'Vansiton', 5);
insert into product values(24,'2022-07-08','2023-08-05', 'La-la-la', true, 'Вітаміни', 1200.00, 12325618, 240, 'Now Foods', 5);

-- category 3
insert into product values(25,'2022-11-11','2023-08-05', 'La-la-la', true, 'Стул Froset', 1200.00, 12341218, 23, 'IKEA', 6);
insert into product values(26,'2022-04-06','2023-08-05', 'La-la-la', false, 'Стул Yngvar', 7200.00, 12341318, 25, 'IKEA', 6);
insert into product values(27,'2022-10-05','2023-08-05', 'La-la-la', true, 'Стул Jonstrup', 2800.00, 12341418, 46, 'JYSK', 6);
insert into product values(28,'2022-12-04','2023-08-05', 'La-la-la', false, 'Диван Parup', 20800.00, 12341518, 6, 'IKEA', 7);
insert into product values(29,'2022-04-09','2023-08-05', 'La-la-la', true, 'Диван Vimle', 40800.00, 12341618, 2, 'IKEA', 7);
insert into product values(30,'2022-05-26','2023-08-05', 'La-la-la', true, 'Диван Poseidon', 14800.00, 12341718, 6, 'Sofino', 7);

-- category 4
insert into product values(31,'2022-04-07','2023-08-05', 'La-la-la', true, 'Комп''ютер Overlord P99v71Win', 490029.00, 12341818, 2, 'ARTLINE', 8);
insert into product values(32,'2022-07-22','2023-08-05', 'La-la-la', true, 'Комп''ютер Gaming by ASUS TUF v119', 109999.00, 15341818, 7, 'ARTLINE', 8);
insert into product values(33,'2022-11-18','2023-08-05', 'La-la-la', false, 'Комп''ютер Gaming (X43v31)', 25599.00, 14341818, 14, 'ARTLINE', 8);
insert into product values(34,'2022-05-25','2023-08-05', 'La-la-la', true, 'Мобільний телефон Galaxy Flip 5', 46999.00, 22341818, 32, 'Samsung', 9);
insert into product values(35,'2022-02-19','2023-08-05', 'La-la-la', false, 'Мобільний телефон iPhone 14 Pro Max', 54999.00, 32341818, 22, 'Apple', 9);
insert into product values(36,'2022-08-01','2023-08-05', 'La-la-la', true, 'Мобільний телефон 105 TA-1203', 585.00, 42341818, 128, 'Nokia', 9);

-- category 5
insert into product values(37,'2022-11-28','2023-08-05', 'La-la-la', true, '1984', 285.00, 42345818, 48, 'Джорж Оруелл', 10);
insert into product values(38,'2022-07-14','2023-08-05', 'La-la-la', false, '451 за Фаренгейтом', 325.00, 42345918, 42, 'Рей Бредбері', 10);
insert into product values(39,'2022-04-29','2023-08-05', 'La-la-la', true, 'Який чудесний новий світ', 185.00, 42345819, 38, 'Олдос Гакслі', 10);
insert into product values(40,'2022-12-09','2023-08-05', 'La-la-la', true, 'Філософія Java', 485.00, 42345819, 48, 'Брюс Еккель', 11);
insert into product values(41,'2022-03-05','2023-08-05', 'La-la-la', false, 'Чистий код', 585.00, 42345820, 13, 'Роберт Мартін', 11);
insert into product values(42,'2022-03-15','2023-08-05', 'La-la-la', true, 'Таємниці JavaScript ніндзя', 785.00, 42345821, 2, 'Джон Робертс', 11);

-- category 6
insert into product values(43,'2022-09-15','2023-08-05', 'La-la-la', true, 'Туш для вій L''Obscur', 2585.00, 42345921, 38, 'Gucci', 12);
insert into product values(44,'2022-03-22','2023-08-05', 'La-la-la', false, 'Блиск для губ Addict Lip Maximizer', 1800.00, 42346021, 67, 'Dior', 12);
insert into product values(45,'2022-04-05','2023-08-05', 'La-la-la', true, 'Помада Colour Elixir Soft', 450.00, 42346121, 78, 'Max Factor', 12);
insert into product values(46,'2022-05-05','2023-08-05', 'La-la-la', true, 'Парфумована вода J''Adore', 3350.00, 42446121, 134, 'Dior', 13);
insert into product values(47,'2022-07-24','2023-08-05', 'La-la-la', false, 'Парфумована вода Sauvage', 7750.00, 52446121, 26, 'Dior', 13);
insert into product values(48,'2022-04-05','2023-08-05', 'La-la-la', true, 'Парфумована вода Addict', 3250.00, 42466121, 174, 'Dior', 13);
insert into product values(49,'2022-03-11','2023-08-05', 'La-la-la', true, 'Крем для рук Skin Naturals', 325.00, 42467221, 374, 'Garnier', 14);
insert into product values(50,'2022-04-27','2023-08-05', 'La-la-la', false, 'Зволожуюче молочко для тіла Intensive 7 Days ', 625.00, 42467521, 171, 'Garnier', 14);
insert into product values(51,'2022-08-05','2023-08-05', 'La-la-la', true, 'Зволожуючий крем гель Body Superfood', 225.00, 42467321, 374, 'Garnier', 14);
insert into product values(52,'2022-05-29','2023-08-05', 'La-la-la', true, 'Очищуючий гель Skin Naturals', 165.00, 42468321, 124, 'Garnier', 15);
insert into product values(53,'2022-04-05','2023-08-05', 'La-la-la', false, 'Денний крем Revitalift', 665.00, 42466721, 113, 'L''Oreal Paris', 15);
insert into product values(54,'2022-07-27','2023-08-05', 'La-la-la', true, 'Тонік Skin Naturals', 125.00, 42348321, 88, 'Garnier', 15);
insert into product values(55,'2022-12-13','2023-08-05', 'La-la-la', false, 'Шампунь Elseve', 143.00, 46348321, 234, 'L''Oreal Paris', 16);
insert into product values(56,'2022-04-17','2023-08-05', 'La-la-la', true, 'Маска для волосся Fructis Super Food', 225.00, 47348321, 118, 'Garnier', 16);
insert into product values(57,'2022-11-19','2023-08-05', 'La-la-la', true, 'Бальзам-ополаскувач Fructis', 88.00, 45348321, 56, 'Garnier', 16);

-- category 7
insert into product values(58,'2022-07-25','2023-08-05', 'La-la-la', true, 'Кастрюля Masterpiece', 32000.00, 45311321, 5, 'Zepter', 17);
insert into product values(59,'2022-11-09','2023-08-05', 'La-la-la', false, 'Чайник Kettle ss Induction', 1500.00, 45321321, 43, 'Tefal', 17);
insert into product values(60,'2022-04-22','2023-08-05', 'La-la-la', true, 'Нож шеф-повара Fresh Kitchen', 400.00, 45322321, 15, 'Tefal', 17);
insert into product values(61,'2022-12-06','2023-08-05', 'La-la-la', true, 'Ваза для квітів', 300.00, 45322221, 25, 'Bohemia', 18);
insert into product values(62,'2022-06-08','2023-08-05', 'La-la-la', false, 'Шкатулка для прикрас', 12100.00, 45325521, 5, 'Rothenschild', 18);
insert into product values(63,'2022-08-23','2023-08-05', 'La-la-la', true, 'Підсвічник Олень', 9700.00, 45326721, 3, 'Lefard', 18);

-- category 8
insert into product values(64,'2022-08-05','2023-08-05', 'La-la-la', true, 'Сухой корм PRO PLAN для собак', 1100.00, 45326721, 113, 'Purina', 19);
insert into product values(65,'2022-01-19','2023-08-05', 'La-la-la', false, 'Ошийник з повідком', 600.00, 45326721, 173, 'Acropolis ', 19);
insert into product values(66,'2022-09-15','2023-08-05', 'La-la-la', true, 'Іграшка для собак', 400.00, 45326721, 113, ' Trixie', 19);
insert into product values(67,'2022-02-28','2023-08-05', 'La-la-la', false, 'Сухой корм PRO PLAN для кішок', 1100.00, 45326721, 113, 'Purina', 20);
insert into product values(68,'2022-07-17','2023-08-05', 'La-la-la', true, 'Гігієнічний наповнювач', 300.00, 45326721, 222, 'Inodorina', 20);
insert into product values(69,'2022-04-18','2023-08-05', 'La-la-la', true, 'Когтеточка для кішок Сloud', 690.00, 45326721, 113, 'Say Meow', 20);
insert into product values(70,'2022-11-22','2023-08-05', 'La-la-la', true, 'Корм для кроликов  Karmeo', 390.00, 45654721, 83, 'Vitapol', 21);
insert into product values(71,'2022-05-08','2023-08-05', 'La-la-la', true, 'Клетка для грызунов Люкс', 790.00, 45384721, 83, 'Лорі Вилла', 21);
insert into product values(72,'2022-02-24','2023-08-05', 'La-la-la', true, 'Прогулянкова куля для гризунів Runner Small', 200.00, 45373621, 83, 'Savic', 21);

--images
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F111111_1111.png?alt=media&token=9983146d-1b2a-4779-9bf8-99164c0f98f2' ,1 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F222222_2222.png?alt=media&token=a3924c9b-fefa-4c37-9fb4-6b51c04b0919',2 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F333333_3333.png?alt=media&token=81061b41-d8b5-48dd-a440-916dadf0b308' ,3 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F444444_4444.png?alt=media&token=1708df30-16b8-4a80-ab16-f8ad0b708452' ,4 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F555555_5555.png?alt=media&token=f9801497-dc13-4aa7-ab8a-f2629acbe35f' ,5 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F666666_6666.png?alt=media&token=07fb13b6-a962-4b79-86c3-82e0ec4c166e',6 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F777777_7777.png?alt=media&token=6fa267bd-6ddb-41fc-86bb-6748e7832162',7 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F888888_8888.png?alt=media&token=64b68331-7827-40f9-adf9-ebb20a2ffe39',8 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F999999_9999.png?alt=media&token=12040bcc-61c9-49cd-ada1-014d0eaa0deb' ,9 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F101010_1010.png?alt=media&token=ec459b50-e026-4ff2-90f0-ce1b387a8e8d',10 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F111111_1111.png?alt=media&token=9983146d-1b2a-4779-9bf8-99164c0f98f2' ,11 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F121212_1212.png?alt=media&token=8e561180-3c34-46ad-8e3d-2a08d4c1d930' ,12 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F131313_1313.png?alt=media&token=7e7b6445-58b8-4aaf-b55e-32435e2301dd' ,13 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F141414_1414.png?alt=media&token=b960beb3-6f3e-4af6-b45b-b11ac3e0e67e' ,14 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F151515_1515.png?alt=media&token=40a2899b-0222-45a9-ba3a-f962298c7a33',15 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F161616_1616.png?alt=media&token=912a2e58-36e7-47a4-a38a-1fc1b9042026',16 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F171717_1717.png?alt=media&token=34cca375-880c-44fe-bac1-aae34dc8475a' ,17 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F181818_1818.png?alt=media&token=13feed2b-47d1-48ec-bc88-90280714076a',18 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F191919_1919.png?alt=media&token=2f7f366f-af4c-40af-b04b-33a7eda59a73' ,19 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F202020_2020.png?alt=media&token=5e8baac0-6dd4-4b58-8004-a8876f85152e',20 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F212121_2121.png?alt=media&token=2c24fa9a-b95d-4f8f-bebe-8adf69d87932',21 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F2222_222222.png?alt=media&token=2ab4f83c-99bf-49f6-9037-166d85d87055',22 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F232323_2323.png?alt=media&token=e8f6c035-5da8-439f-98ff-066b52dc2b66',23 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F242424_2424.png?alt=media&token=d7cc27fd-27cd-432b-b64e-534a3e0b763e' ,24 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F252525_2525.png?alt=media&token=dc1c120a-6e1b-4005-9568-5075d0c89caf',25 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F262626_2626.png?alt=media&token=1f322c90-5131-46eb-ab24-1588989123d1' ,26);
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F272727_2727.png?alt=media&token=7b56f20c-e11b-42e2-97d3-c6cd809f4f08',27 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F282828_2828.png?alt=media&token=58815459-88a2-4773-aed8-cc72a97796cc' ,28 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F292929_2929.png?alt=media&token=b2c9d83e-3de8-4be7-919e-431dce68d6f1' ,29 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F303030_3030.png?alt=media&token=022cea4f-6893-41d7-a4d9-e82cbd5a97e5' ,30 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F313131_3131.png?alt=media&token=9bded135-cb7d-4115-85f2-4fe47abfaa13',31 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F323232_3232.png?alt=media&token=c2b78188-640d-46b0-aae2-2fc2f81bccf1' ,32 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F3333_333333.png?alt=media&token=042425b7-9d07-4d74-b79d-e6578d0a74bb',33 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F343434_3434.png?alt=media&token=b29cf592-8497-485d-99f8-76bcf1fa833a',34 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F353535_3535.png?alt=media&token=9a8629dd-46f7-4734-aa11-0c60b0c7c925' ,35 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F363636_3636.png?alt=media&token=804ea85f-c165-45dd-afba-e05526958881',36 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F373737_37.png?alt=media&token=9b4bed2a-9d29-4408-a985-c74a1a025138',37 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F383838_3838.png?alt=media&token=d0077e76-94b0-4046-9059-b62a20bc2b4c',38 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F393939_3939.png?alt=media&token=e572d304-f9c9-47b1-80cd-6dbd9fe666ec' ,39 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F404040_4040.png?alt=media&token=9a0c3bef-bd16-4cdd-88d7-fb56fd3880b9' ,40 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F414141_4141.png?alt=media&token=bd8aca61-5dbf-4dc3-8ef0-115419360514' ,41 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F424242_4242.png?alt=media&token=bd331175-1733-4856-b3d6-427d0bfffe34',42 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F434343_4343.png?alt=media&token=3dc604a4-6822-4094-96b8-15858e50fc35',43 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F4444_444444.png?alt=media&token=72a91d52-5c04-4997-bd05-4e904f4320a4' ,44 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F454545_4545.png?alt=media&token=e8410432-4202-4677-a6d1-d053f9b6f3d3' ,45 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F464646_4646.png?alt=media&token=81de7623-6597-4c76-9745-56814055b63e' ,46 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F474747_4747.png?alt=media&token=ad35def2-9630-425e-9065-b1bfcc234e7f',47 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F484848_4848.png?alt=media&token=7c594e6d-8d45-404a-8061-98350c5e7f14',48 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F494949_4949.png?alt=media&token=c947b463-17b0-48b2-8675-ea721921a8a6',49);
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F505050_5050.png?alt=media&token=b8f567c7-e274-4a42-bd87-d5195b82c86c' ,50 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F515151_5151.png?alt=media&token=e3e24f3c-e8b4-49f7-a863-0a9adde5718a',51 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F525252_5252.png?alt=media&token=a9e452ed-4acb-4afc-ba5c-8ccc316a78a6',52 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F535353.png?alt=media&token=8d99bffa-2c8e-48d0-964e-e2da31f6bd27' ,53 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F545454_5454.png?alt=media&token=fe2e42c0-af07-447a-a094-775007f411b4' ,54 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F5555_555555.png?alt=media&token=7d361829-d22f-4b50-bf73-9870cae543e2' ,55 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F565656_5656.png?alt=media&token=55fc4043-07a0-4f87-b1f3-1a065afbfb7a' ,56 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F575757_5757.png?alt=media&token=a0bc5261-7007-4cea-a797-ea0a61b158db',57 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F585858_5858.png?alt=media&token=158fa152-b95b-4d6f-aa15-b416ef085c4e',58 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F595959_5959.png?alt=media&token=c8f7fe71-f3c6-49d3-af5d-6fdf39118fc8' ,59 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F606060_6060.png?alt=media&token=0c313c32-6531-43b4-b386-9c33848e7731' ,60 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F616161_6161.png?alt=media&token=e77d2770-a352-46d4-a162-eea7ea9c6790' ,61 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F626262_6262.png?alt=media&token=5c6cadeb-4de2-4219-b4a0-a1f5871cf2bb',62 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F636363_6363.png?alt=media&token=2b055b9c-b05e-432a-b913-ee949f5a0f3a',63 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F646464_6464.png?alt=media&token=34a8753c-3a6b-41eb-813c-4f8eeb1b6754' ,64 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F656565_6565.png?alt=media&token=2d2aafef-69ba-4b4a-bf7d-c1f307cde2d9',65 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F6666_666666.png?alt=media&token=877a7f6b-97dd-43f0-95aa-c958dac8f62f' ,66 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F676767_6767.png?alt=media&token=92a4cadd-6410-48cc-802c-846bd7a84813',67);
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F686868_6868.png?alt=media&token=6ee30643-037d-45de-b3de-10235950f351' ,68 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F696969_6969.png?alt=media&token=4c8020ca-b761-4b10-b951-b8f2ab745983',69 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F707070_7070.png?alt=media&token=4f0c4007-5439-430f-827e-7527ea950a1f' ,70 );
insert into images values (default,'2022-02-24','2023-08-05', 'https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F717171_7171.png?alt=media&token=0060cce6-6ff2-461f-8f53-e20a58b894f0',71 );
insert into images values (default,'2022-02-24','2023-08-05','https://firebasestorage.googleapis.com/v0/b/megastore-10684.appspot.com/o/image_megastore%2F727272_7272.png?alt=media&token=8ee07295-bd8d-4046-89c0-fadd05fd6ede' ,72 );
















