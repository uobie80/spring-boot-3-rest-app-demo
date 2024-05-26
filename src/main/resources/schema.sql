CREATE TABLE IF NOT EXISTS user (
    phone_number TEXT PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    email TEXT NULL,
    username TEXT NOT NULL,
    password TEXT NOT NULL,
    roles TEXT NOT NULL
);