INSERT INTO tb_obra (nome, descricao, data_Publicacao) VALUES ('Harry Potter', 'Bruxos e amizades', TIMESTAMP WITH TIME ZONE '2022-11-13T13:00:00Z');
INSERT INTO tb_obra (nome, descricao, data_Publicacao) VALUES ('Senhor dos Anéis', 'Aneis e Aventuras', TIMESTAMP WITH TIME ZONE '2022-11-13T13:00:00Z');
INSERT INTO tb_obra (nome, descricao, data_Publicacao) VALUES ('Percy Jackson', 'deuses gregos e aventuras e amizades', TIMESTAMP WITH TIME ZONE '2022-11-13T13:00:00Z');

INSERT INTO tb_autor (nome, pais, ano_Nasc, cpf) VALUES ('J. K. Rowling', 'Reino Unido', 1965, null);
INSERT INTO tb_autor (nome, pais, ano_Nasc, cpf) VALUES ('J. R. R. Tolkien', 'Reino Unido', 1892, null);
INSERT INTO tb_autor (nome, pais, ano_Nasc, cpf) VALUES ('Joaozinho', 'Brasil', 2001, '999.999.999-99');

INSERT INTO tb_obra_autor (obra_id, autor_id) VALUES (1, 1);
INSERT INTO tb_obra_autor (obra_id, autor_id) VALUES (2, 2);
INSERT INTO tb_obra_autor (obra_id, autor_id) VALUES (3, 3);
