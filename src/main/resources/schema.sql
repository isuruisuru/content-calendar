CREATE TABLE IF NOT EXISTS Content(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255)
);

--INSERT INTO Content(title, desc, status, content_type, date_created, date_updated, url)
--    VALUES('My spring data blog post', 'a post abt spring data', 'IDEA', 'ARTICLE', CURRENT_TIMESTAMP(), NULL, NULL);