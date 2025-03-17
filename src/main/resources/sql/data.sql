INSERT INTO users (id, name, mail, password, roles, created, last_logined, enabled) 
VALUES 
(1, 'A', 'aaaa@mail.com', 'Password1111', 'PM', NOW(), NOW(), 0),
(2, 'B', 'bbbb@mail.com', 'Password2222', 'PL', NOW(), NOW(), 0),
(3, 'C', 'cccc@mail.com', 'Password3333', 'USER', NOW(), NOW(), 1);
