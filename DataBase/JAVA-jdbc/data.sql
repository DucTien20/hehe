DROP TABLE IF EXISTS article;

CREATE TABLE article(
    id integer primary key autoincrement,
    title text,
    content text
);
-- them du lieu SQL vao bang Article
INSERT INTO article(title, content)
VALUES (?, ?);

SELECT * FROM article;