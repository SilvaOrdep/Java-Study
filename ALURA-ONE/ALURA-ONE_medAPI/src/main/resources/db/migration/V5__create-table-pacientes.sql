CREATE TABLE pacientes (
                        id SERIAL PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        email VARCHAR(100) NOT NULL UNIQUE,
                        cpf VARCHAR(14) NOT NULL UNIQUE,
                        telefone VARCHAR(13) NOT NULL,
                        logradouro VARCHAR(100) NOT NULL,
                        bairro VARCHAR(100) NOT NULL,
                        cep VARCHAR(9) NOT NULL,
                        complemento VARCHAR(100),
                        numero VARCHAR(20),
                        uf CHAR(2) NOT NULL,
                        cidade VARCHAR(100) NOT NULL
);