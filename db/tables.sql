-- users
CREATE TABLE users (
    id         SERIAL PRIMARY KEY,          -- Use SERIAL for auto-incrementing ID
    first_name VARCHAR(50)         NOT NULL,
    last_name  VARCHAR(50)         NOT NULL,
    email      VARCHAR(255) UNIQUE NOT NULL -- Set 'email' as unique and not null
);