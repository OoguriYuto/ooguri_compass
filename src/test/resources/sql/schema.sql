CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    mail VARCHAR(255),
    password VARCHAR(255),
    roles VARCHAR(255),
    created TIMESTAMP,
    last_logined TIMESTAMP,
    enabled BOOLEAN
);
