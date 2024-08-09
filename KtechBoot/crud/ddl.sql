--tao bang student
CREATE TABLE student(
id INTEGER PRIMARY KEY AUTOINCREMENT,
name TEXT,
email TEXT
);
INSERT INTO student(name,email)
VALUES(?, ?)