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
INSERT INTO content (name, description, author, picturelink, releasedate, duration, rate) values
('The Revenant', 'La vengeance d un pere dont le fils a ete tue', 'Christophe', '', 2015, 156, 5),
('Interstellar', 'Space Opera', 'Christophe', 'asset/images/content/interstellar.jpg', 2014, 169, 5),
('Inception', 'Bracage de haut vol dans la psyche', 'Christophe', '', 2010, 147, 5)
