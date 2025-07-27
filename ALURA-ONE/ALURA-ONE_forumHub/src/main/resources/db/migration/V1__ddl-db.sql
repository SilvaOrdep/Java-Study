-- Tabela de usuários
CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    perfil VARCHAR(20) NOT NULL
);

-- Tabela de cursos
CREATE TABLE cursos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    categoria VARCHAR(50) NOT NULL
);

-- Tabela de tópicos
CREATE TABLE topicos (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    mensagem TEXT NOT NULL,
    data_criacao DATE NOT NULL,
    status VARCHAR(20) NOT NULL,
    id_autor BIGINT NOT NULL,
    id_curso BIGINT NOT NULL,
    FOREIGN KEY (id_autor) REFERENCES usuarios(id),
    FOREIGN KEY (id_curso) REFERENCES cursos(id)
);

-- Tabela de respostas
CREATE TABLE respostas (
    id SERIAL PRIMARY KEY,
    mensagem TEXT NOT NULL,
    data_criacao DATE NOT NULL,
    id_topico BIGINT NOT NULL,
    id_autor BIGINT NOT NULL,
    FOREIGN KEY (id_topico) REFERENCES topicos(id),
    FOREIGN KEY (id_autor) REFERENCES usuarios(id)
);

-- Índices para melhorar performance das consultas
CREATE INDEX idx_topicos_autor ON topicos(id_autor);
CREATE INDEX idx_topicos_curso ON topicos(id_curso);
CREATE INDEX idx_respostas_topico ON respostas(id_topico);
CREATE INDEX idx_respostas_autor ON respostas(id_autor);