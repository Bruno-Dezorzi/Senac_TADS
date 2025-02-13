DROP TABLE IF EXISTS producao;
DROP TABLE IF EXISTS preco_produto;
DROP TABLE IF EXISTS produto_abelha;
DROP TABLE IF EXISTS predador_abelha;
DROP TABLE IF EXISTS abelha;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS cidade;
DROP TABLE IF EXISTS produto_melifero;

CREATE TABLE produto_melifero (
    id_produto INT PRIMARY KEY AUTO_INCREMENT,
    nome_produto varchar(100),
    descricao varchar(255),
    sabor varchar(50),
    propriedades_medicinais varchar(5)
);

CREATE TABLE cidade (
    id_cidade INT PRIMARY KEY AUTO_INCREMENT,
    uf varchar(2),
    latitude decimal(15, 8),
    longitude decimal(15, 8),
    clima varchar(10),
    relevo varchar(10)
);

CREATE TABLE usuario (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    id_cidade INT,
    cpf varchar(14) UNIQUE,
    nome varchar(100),
    data_nascimento date,
    status varchar(10),
    celular varchar(50),
    codassinatura varchar(10),
    senha varchar(50),
    email varchar(50) UNIQUE,
    genero char(1),
    foto blob,
    codperfil varchar(10),
    FOREIGN KEY(id_cidade) REFERENCES cidade(id_cidade)
);

CREATE TABLE abelha (
    id_especie INT PRIMARY KEY AUTO_INCREMENT,
    nome_cientifico varchar(255) UNIQUE,
    nome_comum varchar(100),
    familia varchar(100),
    genero varchar(100),
    especie varchar(100),
    distribuicao_geografica varchar(255),
    habitat varchar(255),
    comportamento varchar(255),
    tamanho_medio decimal(5, 2),
    cor_predominante varchar(50),
    papel_ecologico varchar(255),
    estado_de_conservacao varchar(50),
    tempo_de_vida double,
    tipo_de_colmeia varchar(100),
    alimentacao varchar(100),
    id_ameacabio varchar(5),
    obs text,
    ferrao boolean
);

CREATE TABLE produto_abelha (
    id_produto INT,
    id_especie INT,
    PRIMARY KEY (id_produto, id_especie),
    FOREIGN KEY(id_especie) REFERENCES abelha(id_especie),
    FOREIGN KEY(id_produto) REFERENCES produto_melifero(id_produto)
);

CREATE TABLE predador_abelha (
    id_predador INT PRIMARY KEY AUTO_INCREMENT,
    nome_comum varchar(100),
    nome_cientifico varchar(255),
    descricao varchar(1000),
    origem varchar(100),
    principais_presas varchar(255),
    nivel_ameaca varchar(50),
    habitos_alimentares varchar(255),
    ciclo_vida varchar(100),
    estrategias_controle varchar(255),
    preferencias_climaticas varchar(255),
    impacto_ecologico varchar(1000),
    estrategias_prevencao varchar(1000),
    foto blob,
    populacao_estimada int,
    taxa_reproducao decimal(5, 2),
    area_distribuicao decimal(8, 3),
    temperatura_preferencial decimal(5, 2),
    umidade_preferencial decimal(5, 2)
);

CREATE TABLE preco_produto (
    id_preco_produto INT PRIMARY KEY AUTO_INCREMENT,
    id_produto INT,
    valor int(10),
    data_ultima_atualizacao int(10),
    FOREIGN KEY(id_produto) REFERENCES produto_melifero(id_produto)
);

CREATE TABLE producao (
    id_producao INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    id_produto INT,
    quantidade double,
    data date,
    preco double,
    FOREIGN KEY(id_produto) REFERENCES produto_melifero(id_produto),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

CREATE UNIQUE INDEX abelha_id_especie ON abelha (id_especie);
CREATE UNIQUE INDEX cidade_id_cidade ON cidade (id_cidade);
CREATE UNIQUE INDEX preco_produto_id_preco_produto ON preco_produto (id_preco_produto);
CREATE UNIQUE INDEX producao_id_producao ON producao (id_producao);
CREATE UNIQUE INDEX produto_abelha_id_produto ON produto_abelha (id_produto);
CREATE UNIQUE INDEX produto_abelha_id_especie ON produto_abelha (id_especie);
CREATE UNIQUE INDEX produto_melifero_id_produto ON produto_melifero (id_produto);
CREATE UNIQUE INDEX usuario_id_usuario ON usuario (id_usuario);
CREATE INDEX usuario_id_cidade ON usuario (id_cidade);
