INSERT INTO PUBLISHER (name, email) VALUES
  ('Google', 'google@gmail.com'),
  ('Yandex', 'email@email.com'),
  ('Microsoft', 'mic@mic.com');

INSERT INTO PRODUCT (name, pub_name, version) VALUES
  ('Google Translator', 'Google', '1.1.03'),
  ('Google Mail', 'Google', '10.1'),
  ('Yandex Translator', 'Yandex', '5.2.1'),
  ('Yandex Mail', 'Yandex', '3.2.1'),
  ('XBox Game Pass', 'Microsoft', '7.8.0'),
  ('Windows 10', 'Microsoft', '1.0.0');


-----------------------------------------------------------------------------------------------


INSERT INTO COUNTRY (name) VALUES
  ('Germany'),
  ('Japan'),
  ('France'),
  ('USA'),
  ('South Korea'),
  ('Italy');

INSERT INTO CAR (company_name, country_name) VALUES
  ('Hyundai–Kia', 'South Korea'),
  ('Ford Motor', 'USA'),
  ('Honda Motor', 'Japan'),
  ('FCA', 'Italy'),
  ('Groupe PSA', 'France'),
  ('Suzuki', 'Japan'),
  ('Daimler', 'Germany'),
  ('BMW', 'Germany');

-----------------------------------------------------------------------------------------------

  INSERT INTO USERS (name, phone_number) VALUES
    ('Ilya', '+375-29-748-75-93'),
    ('Yuriy', '+375-33-833-26-45'),
    ('Anna', '+375-44-774-93-53'),
    ('Pavel', '+375-29-855-34-52'),
    ('Nikita', '+375-78-550-23-31'),
    ('Oksana', '+375-67-566-32-90');

  INSERT INTO PROJECTS (name, user_id, version) VALUES
    ('ПрогСП лаб. 1', 1, '1.1.03'),
    ('КС лаб. 2', 5, '10.1'),
    ('Курсовая по КС', 3, '5.2.1'),
    ('Курсовая по ПрогСП', 4, '3.2.1'),
    ('Звездные войны: мини игра', 2, '7.8.0');