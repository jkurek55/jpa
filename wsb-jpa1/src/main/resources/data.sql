insert into address (id, address_line1, address_line2, city, postal_code)
values (1, '31', '12', 'Wroclaw', '50-455'),
       (2, '54', '56', 'Warsaw', '31-123'),
       (3, '12', '34', 'Gdanks', '123-321'),
       (4, '32', '12', 'Gdanks', '432-123'),
       (5, '11', '321', 'Strzelin', '44-12'),
       (6, '12', '41', 'Londyn', '30-13'),
        (7, '13', '12', 'Gniezno', '13-31'),
        (8, '41', '31', 'Krakow', '66-55'),
        (9, '32', '12', 'Polska', '32-123'),
        (10, '54', '23', 'Guro', '32-123'),
        (11, '543', '12', 'Krakow', '123-123');
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
values (1, 'Jan', 'Kowalski', '+48 111 222 333', 'jan.kowalski@gmail.com', 'assa', 'Surgeon', 3),
       (2, 'Jakub', 'Kurke', '+48 444 555 666', 'kurek.jkb@gmail.com', 'das', 'Surgeon', 2),
(3, 'Krzysztof', 'Cienias', '+48 777 888 999', 'krkr.cns@gmail.com', 'fads', 'Surgeon', 5),
(4, 'Jurek', 'Nowak', '+48 123 567 890', 'jureekl.nowak@gmail.com', 'zxc', 'Surgeon', 7),
(5, 'Marek', 'Nowak', '+48 951 627 384', 'makek.nowak@gmail.com', 'fas', 'Surgeon', 1);

insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, regular_customer)
values (1, 'blazej', 'dsax', '+48 321 132 123', 'bvlaezj@gmail.com', '1454', '1999-01-01', 4, TRUE),
       (2, 'jurek', 'xcz', '+48 643 234 523', 'cxvzsac@gmail.com', '52', '1999-01-02', 8, FALSE),
       (3, 'esacz', 'mbank', '+48 5646 32 122', 'asdd@gmail.com', '123', '1999-01-03', 6, FALSE),
       (4, 'polak', 'niemiec', '+48 4132 43 123', 'asddas@gmail.com', '124', '1999-01-04', 11, FALSE),
       (5, 'krzysztog', 'elo', '+48 56 3245 234', 'xzccxz@gmail.com', '5132', '1999-01-05', 9, TRUE),
       (6, 'blazej', 'sieradzki', '+48 2533 23 552', 'sadds@gmail.com', '542', '1999-01-06', 10, FALSE);

insert into visit (id, description, time, doctor_id, patient_id)
values (1, 'asd', '2024-08-01T10:00:00.000', 1, 1),
       (2, 'zxc', '2024-08-01T10:00:01.000', 1, 2),
       (3, 'asd', '2024-08-01T10:00:02.000', 1, 3),
       (4, 'qw3e', '2024-08-01T10:00:03.000',4, 4),
       (5, 'zxc', '2024-08-01T10:00:04.000', 4, 2),
       (6, 'vxc', '2024-08-01T10:00:05.000', 1, 5),
       (7, 'rew', '2024-08-01T10:00:06.000', 1, 5),
       (8, 'bc', '2024-08-01T10:00:07.000', 1, 6),
       (9, 'czxc', '2024-08-01T10:00:08.000', 1, 6),
       (10, 'zxc', '2024-08-01T10:00:09.000', 1, 3);

insert into medical_treatment (id, description, type, visit_id)
values (1, 'heart removal', 'surgery', 1),
         (2, 'brain removal', 'surgery', 1);