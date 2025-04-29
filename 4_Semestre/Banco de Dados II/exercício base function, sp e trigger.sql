DROP TABLE IF EXISTS alunos_turmas;
DROP TABLE IF EXISTS turmas;
DROP TABLE IF EXISTS salas;
DROP TABLE IF EXISTS alunos;
DROP TABLE IF EXISTS funcionarios;
DROP TABLE IF EXISTS disciplinas;
DROP TABLE IF EXISTS professores;
DROP TABLE IF EXISTS cursos;
DROP TABLE IF EXISTS departamentos;
DROP TABLE IF EXISTS centros;

CREATE TABLE centros (
    id_centro SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    sigla VARCHAR(10),
    localizacao VARCHAR(100),
    diretor VARCHAR(100)
);

CREATE TABLE departamentos (
    id_departamento SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    sigla VARCHAR(10),
    centro_id INT,
    FOREIGN KEY (centro_id) REFERENCES centros(id_centro)
);

CREATE TABLE cursos (
    id_curso SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    duracao INT,
    departamento_id INT,
    tipo VARCHAR(50),
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id_departamento)
);

CREATE TABLE professores (
    id_professor SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    titulacao VARCHAR(50),
    email VARCHAR(100),
    curso_id INT,
    FOREIGN KEY (curso_id) REFERENCES cursos(id_curso)
);

CREATE TABLE disciplinas (
    id_disciplina SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    carga_horaria INT,
    curso_id INT,
    professor_id INT,
    FOREIGN KEY (curso_id) REFERENCES cursos(id_curso),
    FOREIGN KEY (professor_id) REFERENCES professores(id_professor)
);

CREATE TABLE salas (
    id_sala SERIAL PRIMARY KEY,
    nome VARCHAR(50),
    capacidade INT,
    localizacao VARCHAR(100)
);

CREATE TABLE turmas (
    id_turma SERIAL PRIMARY KEY,
    disciplina_id INT,
    sala_id INT,
    horario VARCHAR(50),
    semestre VARCHAR(20),
    FOREIGN KEY (disciplina_id) REFERENCES disciplinas(id_disciplina),
    FOREIGN KEY (sala_id) REFERENCES salas(id_sala)
);

CREATE TABLE alunos (
    id_aluno SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    matricula VARCHAR(20) UNIQUE,
    email VARCHAR(100),
    curso_id INT,
    FOREIGN KEY (curso_id) REFERENCES cursos(id_curso)
);

CREATE TABLE funcionarios (
    id_funcionario SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    cargo VARCHAR(50),
    email VARCHAR(100),
    departamento_id INT,
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id_departamento)
);

CREATE TABLE alunos_turmas (
    id_aluno INT,
    id_turma INT,
    PRIMARY KEY (id_aluno, id_turma),
    FOREIGN KEY (id_aluno) REFERENCES alunos(id_aluno),
    FOREIGN KEY (id_turma) REFERENCES turmas(id_turma)
);




INSERT INTO centros (
	nome ,
    sigla ,
    localizacao ,
    diretor 
) VALUES 
('Centro de Computação', 'CECP', 'Bloco A', 'Dr. Turingão'),
('Centro de Humanas', 'CEHU', 'Bloco B', 'Dr. Gandiho'),
('Centro de Geologia', 'CEGEO', 'Bloco C', 'Dr. Sacani'),
('Centro de Física', 'CEFC', 'Bloco D', 'Dr. Galileu'),
('Centro de Química', 'CEQM', 'Bloco E', 'Dr. Curie');

INSERT INTO departamentos (
	nome ,
    sigla ,
    centro_id 
)VALUES 
('Departamento da RAM', 'DRAM', 1),
('Departamento das Sílabas', 'DSB', 2),
('Departamento Tectônico', 'DTC', 3),
('Departamento de Astrofísica', 'DAS', 4),
('Departamento de Inorgânica', 'DIN', 5);

INSERT INTO cursos (
	nome ,
    duracao ,
    departamento_id ,
    tipo 
) VALUES 
('Análise e Desenvolvimento de Sistemas', 3, 1, 'Tecnólogo'),
('Letras', 4, 2, 'Licenciatura'),
('Geofísica', 4, 3, 'Bacharelado'),
('Astrofísica', 4, 4, 'Bacharelado'),
('Química', 4, 5, 'Bacharelado');

INSERT INTO professores (
	nome ,
    titulacao ,
    email ,
    curso_id
) VALUES 
('Steve Jobs', 'Empresário', 'steve.jobs@uni.edu', 1),
('Machadão de Assis', 'Escritor', 'machado.assis@uni.edu', 2),
('John Contravolta', 'Graser', 'volta.john@uni.edu', 3),
('Newton', 'CAPA PINK FLOYD/ OIA A GRAVIDADE', 'grav_newton@uni.edu', 4),
('Cariani', 'BODYBUILDER', 'cari.ani@uni.edu', 5);

INSERT INTO disciplinas (
	nome ,
    carga_horaria ,
    curso_id ,
    professor_id
) VALUES 
('Estrutura de Dados', 60, 1, 1),
('LEITURA', 60, 2, 2),
('Geografia Estrutural', 60, 3, 3),
('Física dos Fluídos', 60, 4, 4),
('Radiação', 60, 5, 5);


INSERT INTO salas (
    nome,
    capacidade,
    localizacao
) VALUES
('Sala 101', 40, 'Bloco A'),
('Sala 102', 50, 'Bloco B'),
('Sala 103', 60, 'Bloco C'),
('Sala 104', 70, 'Bloco D'),
('Sala 105', 80, 'Bloco E');

INSERT INTO turmas (
    disciplina_id,
    sala_id,
    horario,
    semestre
) VALUES
(1, 1, '08:00 - 10:00', '2025/1'),
(2, 2, '10:00 - 12:00', '2025/1'),
(3, 3, '13:00 - 15:00', '2025/1'),
(4, 4, '15:00 - 17:00', '2025/1'),
(5, 5, '18:00 - 20:00', '2025/1');

INSERT INTO alunos (
    nome,
    matricula,
    email,
    curso_id
) VALUES
('Ada Lovelace', '20250001', 'ada.lovelace@uni.edu', 1),
('Clarice Lispector', '20250002', 'clarice.lispector@uni.edu', 2),
('Charles Darwin', '20250003', 'charles.darwin@uni.edu', 3),
('Carl Sagan', '20250004', 'carl.sagan@uni.edu', 4),
('Marie Curie', '20250005', 'marie.curie@uni.edu', 5);

INSERT INTO funcionarios (
    nome,
    cargo,
    email,
    departamento_id
) VALUES
('Bruce Wayne', 'Coordenador', 'bruce.wayne@uni.edu', 1),
('Diana Prince', 'Secretária', 'diana.prince@uni.edu', 2),
('Clark Kent', 'Bibliotecário', 'clark.kent@uni.edu', 3),
('Barry Allen', 'Técnico de Laboratório', 'barry.allen@uni.edu', 4),
('Arthur Curry', 'Segurança', 'arthur.curry@uni.edu', 5);

INSERT INTO alunos_turmas (
    id_aluno,
    id_turma
) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);


