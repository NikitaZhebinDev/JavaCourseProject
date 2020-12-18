INSERT INTO COUNTRY (name, currency) VALUES
  ('USA', 'USD'),
  ('Belarus', 'BYN'),
  ('France', 'EUR'),
  ('Germany', 'EUR'),
  ('Japan', 'JPY'),
  ('Kazakhstan', 'KZT');

  INSERT INTO COMPANY (name, country_name, current_budget, allocated_budget, foundation_date) VALUES
    ('EPAM', 'Belarus', 500405100.00, 94900.00, '1993-10-08'),
    ('Microsoft', 'USA', 190200100.00, 100100100.00, '1974-04-04'),
    ('Google', 'USA', 300100400.00, 100200300.00, '1998-09-04'),
    ('Lenovo', 'Japan', 500500500500.00, 500500500.00, '1984-11-01'),
    ('Xiaomi', 'Japan', 300100100100.00, 100200200.00, '2010-04-06'),
    ('SAP', 'Germany', 200900800.00, 300600600.00, '1972-04-01'),
    ('L’Oreal', 'France', 100500500.00, 100700300.00, '1909-07-30'),
    ('G1 Software', 'Kazakhstan', 100200300400.00, 300200100.00, '2010-11-01');

    INSERT INTO BUDGET (start_date, finish_date, months_number, monthly_payment, total_payment, currency) VALUES
      ('2018-10-08', '2025-10-08', 12*(2025-2018), 150*3853.80, (150*3853.80)*(12*(2025-2018)), 'BYN'),
      ('2015-11-11', '2026-11-11', 12*(2025-2018), 80*2569.20, (80*2569.20)*(12*(2025-2018)), 'BYN'),

      ('2017-01-01', '2027-01-01', 12*(2027-2017), 9000*1999.40, (9000*1999.40)*(12*(2027-2017)), 'USD'),
      ('2009-11-02', '2028-11-02', 12*(2028-2009), 19000*2999.60, (19000*2999.60)*(12*(2028-2009)), 'USD'),

      ('2019-10-03', '2030-10-03', 12*(2030-2019), 6000*2499.00, (6000*2499.00)*(12*(2030-2019)), 'USD'),
      ('2018-09-04', '2028-09-04', 12*(2028-2018), 15000*1499.80, (15000*1499.80)*(12*(2028-2018)), 'USD'),

      ('2011-08-05', '2024-08-05', 12*(2024-2011), 100*260398.75, (100*260398.75)*(12*(2024-2011)), 'JPY'),

      ('2010-04-06', '2030-04-06', 12*(2030-2010), 3800*208319.00, (3800*208319.00)*(12*(2030-2010)), 'JPY'),
      ('2010-05-25', '2030-05-25', 12*(2030-2010), 4000*208319.00, (4000*208319.00)*(12*(2030-2010)), 'JPY'),

      ('2016-07-23', '2024-07-23', 12*(2024-2016), 30100*1749.75, (30100*1749.75)*(12*(2024-2016)), 'EUR'),
      ('2015-06-15', '2027-06-15', 12*(2027-2015), 34000*1337.31, (34000*1337.31)*(12*(2027-2015)), 'EUR'),

      ('2017-01-06', '2035-01-06', 12*(2035-2017), 4000*824.87, (4000*824.87)*(12*(2035-2017)), 'EUR'),
      ('2018-03-30', '2028-03-30', 12*(2028-2018), 8000*1649.75, (8000*1649.75)*(12*(2028-2018)), 'EUR'),

      ('2019-02-25', '2030-02-25', 2030-2019, 10500*841332.80, (10500*841332.80)*(12*(2030-2019)), 'KZT');

      INSERT INTO PROJECT (name, company_name, staff_skill_level, staff_number, budget_id) VALUES
        ('EPAM IT School', 'EPAM', 'A3', 150, 1),
        ('EPAM Trainings Media', 'EPAM', 'A2', 80, 2),

        ('Windows 10 Support', 'Microsoft', 'B1', 9000, 3),
        ('Windows 11', 'Microsoft', 'B3', 19000, 4),

        ('Google Mail', 'Google', 'B2', 6000, 5),
        ('Translator', 'Google', 'A3', 15000, 6),

        ('Lenovo Network', 'Lenovo', 'B2', 100, 7),

        ('Xiaomi POCO mobile', 'Xiaomi', 'B1', 3800, 8),
        ('Xiaomi Digital Shop', 'Xiaomi', 'B1', 4000, 9),

        ('SAP Social Media project', 'SAP', 'B1', 30100, 10),
        ('SAP Lead & Deal management platform', 'SAP', 'A3', 34000, 11),

        ('L’Oreal Paris pharma project', 'L’Oreal', 'A2', 4000, 12),
        ('L’Oreal WWW Shop', 'L’Oreal', 'B1', 8000, 13),

        ('G1 Solutions', 'G1 Software', 'B1', 10500, 14);

        INSERT INTO SKILL_PAYMENT (country_name, skill_level, monthly_payment) VALUES
          ('USA', 'A1', 499.60),
          ('USA', 'A2', 999.20),
          ('USA', 'A3', 1499.80),
          ('USA', 'B1', 1999.40),
          ('USA', 'B2', 2499.00),
          ('USA', 'B3', 2999.60),
          ('Belarus', 'A1', 1284.60),
          ('Belarus', 'A2', 2569.20),
          ('Belarus', 'A3', 3853.80),
          ('Belarus', 'B1', 5138.40),
          ('Belarus', 'B2', 6423.00),
          ('Belarus', 'B3', 7707.60),
          ('France', 'A1', 412.44),
          ('France', 'A2', 824.87),
          ('France', 'A3', 1237.31),
          ('France', 'B1', 1649.75),
          ('France', 'B2', 2062.19),
          ('France', 'B3', 2474.62),
          ('Germany', 'A1', 512.44),
          ('Germany', 'A2', 924.87),
          ('Germany', 'A3', 1337.31),
          ('Germany', 'B1', 1749.75),
          ('Germany', 'B2', 2162.19),
          ('Germany', 'B3', 2574.62),
          ('Japan', 'A1', 52079.75),
          ('Japan', 'A2', 104159.50),
          ('Japan', 'A3', 156239.25),
          ('Japan', 'B1', 208319.00),
          ('Japan', 'B2', 260398.75),
          ('Japan', 'B3', 312478.50),
          ('Kazakhstan', 'A1', 210333.20),
          ('Kazakhstan', 'A2', 420666.40),
          ('Kazakhstan', 'A3', 630999.60),
          ('Kazakhstan', 'B1', 841332.80),
          ('Kazakhstan', 'B2', 1051666.00),
          ('Kazakhstan', 'B3', 1261999.20);


INSERT INTO USER_DATA (username, password, active) VALUES
  ('kita', 'pass', true),
  ('admin', 'admin', true),
  ('dima', 'dima', true),
  ('kirill', 'kirill', true);

INSERT INTO USER_ROLE (user_id, roles) VALUES
  (1, 'ADMIN'),
  (2, 'ADMIN'),
  (3, 'USER'),
  (4, 'USER');

