INSERT INTO roles (name) values ('ROLE_ADMIN');
INSERT INTO users (username, password, roles_id) values 
('admin@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT r.id from roles r where r.name='ROLE_ADMIN')), 
('user@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT r.id from roles r where r.name='ROLE_USER'))