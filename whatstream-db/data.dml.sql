INSERT INTO roles (name) values ('ROLE_ADMIN');
INSERT INTO users (pseudo, username, password, roles_id) values 
('Christophe', 'admin@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT r.id from roles r where r.name='ROLE_ADMIN')), 
('Cindy', 'user@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT r.id from roles r where r.name='ROLE_ADMIN'));
INSERT INTO artists (firstname, lastname) values
('Leonardo', 'DiCaprio'),
('Jessica', 'Chastain'),
('Jennifer', 'Lawrence'),
('Alejandro', 'González-Iñárritu'),
('Steven', 'Spielberg'),
('Tom', 'Cruise'),
('Steve', 'Carell');
INSERT INTO categories (name) values
('série'),
('film');
INSERT INTO kinds (name) values 
('comédie'),
('action'),
('science-fiction'),
('comédie romantique');
INSERT INTO content (name, description, picturelink, releasedate, duration, rate) values
('The Revenant', 'La vengeance d''un pere dont le fils a ete tué', null, '2022-05-19', 156, 5),
('Interstellar', 'Space Opera', 'asset/images/content/interstellar.jpg', '2014-11-05', 169, 5),
('Inception', 'Bracage de haut vol dans la psyche', null, '2010-07-21', 147, 5),
('Birdman', 'show must go on', null, '2015-02-25', 119, 5),
('Aladdin', 'Genius and love', null, '1993-11-10', 90, 4),
('Mad Max: Fury Road', 'Fire and Fury', null, '2015-05-14', 120, 4),
('2001: l''Odyssée de l''espace', 'Space Opera', null, '1968-09-27', 141, 5)