CREATE DATABASE chatgpt;

USE chatgpt;

CREATE TABLE conversations (
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id)
);

CREATE TABLE messages (
    id INT NOT NULL AUTO_INCREMENT,
    content TEXT NOT NULL,
    conversation_id INT NOT NULL,
    PRIMARY KEY (id),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (conversation_id) REFERENCES conversations(id)
);