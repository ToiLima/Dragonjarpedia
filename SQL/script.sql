/*Garanta que a conexão esteja no banco criado neste arquivo*/
CREATE DATABASE dragonjarpedia;

/*Criação de Tabelas*/
CREATE TABLE monster (
    id SERIAL PRIMARY KEY,
    name VARCHAR(299) NOT NULL,
    description TEXT NOT NULL,
    family VARCHAR(299) NOT NULL
);

CREATE TABLE character (
    id SERIAL PRIMARY KEY,
    name VARCHAR(299) NOT NULL,
    description TEXT NOT NULL,
    gender VARCHAR(299) NOT NULL,
    age VARCHAR(299) NOT NULL,
    race VARCHAR(299) NOT NULL,
    class VARCHAR(299) NOT NULL
);

CREATE TABLE equipment (
    id SERIAL PRIMARY KEY,
    name VARCHAR(299) NOT NULL,
    description TEXT NOT NULL,
    price FLOAT NOT NULL,
    howObtain TEXT NOT NULL,
    type VARCHAR(299) NOT NULL
);