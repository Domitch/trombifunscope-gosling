-- On supprime la base en premier : ça efface aussi les droits
-- accordés dedans, qui bloquaient sinon la suppression du rôle.
DROP DATABASE IF EXISTS trombifunscope;

-- Maintenant le rôle n'a plus rien qui en dépend.
DROP ROLE IF EXISTS fantastic;

-- On recrée le rôle avec le strict minimum.
CREATE ROLE fantastic WITH
    LOGIN
    PASSWORD 'power55'
    NOSUPERUSER
    NOCREATEDB
    NOCREATEROLE;

-- On recrée la base.
CREATE DATABASE trombifunscope
    OWNER postgres
    ENCODING 'UTF8';
