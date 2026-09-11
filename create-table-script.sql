-- Important : il faut maintenant se reconnecter à cette base avant
-- de créer la table. CREATE DATABASE ne bascule pas la session.
\c trombifunscope


DROP TABLE IF EXISTS student;

CREATE TABLE student (
                         id INTEGER GENERATED ALWAYS AS IDENTITY,
                         date_of_birth   DATE         NOT NULL,
                         real_name       VARCHAR(30)  NOT NULL,
                         fantastic_name  VARCHAR(50),
                         photo           VARCHAR(150),
                         theme_song      VARCHAR(150),
                         power           VARCHAR(50),
                         weakness        VARCHAR(50),
                         element         VARCHAR(20),
                         PRIMARY KEY(id)
);

-- Droits explicites et minimaux du rôle applicatif sur la table.
GRANT SELECT, INSERT ON student TO fantastic;
