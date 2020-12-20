INSERT INTO CURRENCY (country_name, currency) VALUES
  ('Беларусь', 'BYN'),
  ('Россия', 'RUS'),
  ('Франция', 'EUR'),
  ('Германия', 'EUR'),
  ('Япония', 'JPY'),
  ('США', 'USD'),
  ('Казахстан', 'KZT');

INSERT INTO COMPANY (name, staff_number) VALUES
  ('1C', 1000),
  ('Евроопт', 1400),
  ('Xiaomi', 2000),
  ('Аливария', 800),
  ('СШ 1', 1800),
  ('Минскзеленстрой', 2100),
  ('Интеграл', 3500),
  ('Яндекс такси', 5000);

INSERT INTO CODEX (job_position, link) VALUES
  ('Программист', 'https://club.shelek.ru/viewart.php?id=277'),
  ('Бухгалтер', 'https://www.ifac.org/system/files/downloads/Russian_2008_IAASB_HB_List_of_Key_Terms.pdf'),
  ('Продавец', 'https://staff.wikireading.ru/8119'),
  ('Директор', 'https://kodeksy-by.com/kodeks_ob_obrazovanii_rb/26.htm'),
  ('Учитель', 'https://pedsovet.org/images/stories/users/72/codex.pdf'),
  ('Начальник цеха', 'http://www.dikta.by/knigi-dlya-skachivaniya1/otvetyi-na-pravovyie-voprosyi/prava-i-obyazannosti-nachalnika-ceha-i-mastera.html'),
  ('Уборщик', 'https://hrhelpline.ru/bank-dolzhnostnyh-instruktsij/vspomogatelnyj-personal/dolzhnostnaya-instruktsiya-uborshhitsy/'),
  ('Водитель', 'https://nashikolesa.ru/avtosovety/kodeks-etiki-voditelya-taksi');

INSERT INTO EMPLOYEE (company_name, name, job_position) VALUES
  ('1C', 'Владимир', 'Программист'),
  ('Евроопт', 'Никита', 'Бухгалтер'),
  ('Xiaomi', 'Кирилл', 'Продавец'),
  ('Аливария', 'Дмитрий', 'Директор'),
  ('СШ 1', 'Светлана', 'Учитель'),
  ('Минскзеленстрой', 'Сергей', 'Начальник цеха'),
  ('Интеграл', 'Антон', 'Уборщик'),
  ('Яндекс такси', 'Анна', 'Водитель');

INSERT INTO PAYMENT (employee_id, country_name, payment) VALUES
  (1, 'США', 800),
  (2, 'Беларусь', 500),
  (3, 'Япония', 3100),
  (4, 'Россия', 25000),
  (5, 'Казахстан', 4000),
  (6, 'Беларусь', 1000),
  (7, 'Беларусь', 300),
  (8, 'Россия', 17000);



INSERT INTO USER_DATA (username, password, active) VALUES
  ('dima', 'dima', true),
  ('admin', 'admin', true),
  ('andrew', 'andrew', true);

INSERT INTO USER_ROLE (user_id, roles) VALUES
  (1, 'ADMIN'),
  (2, 'ADMIN'),
  (3, 'USER');

