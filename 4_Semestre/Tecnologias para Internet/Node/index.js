const express = require('express');
const { Pool } = require('pg');

const app = express();

app.use(express.static('public'))

const conn = new Pool({
    host: 'localhost',
    user: 'postgres',
    password: '123456', //'admin',
    database: 'node',
    port: 5432, // Certifique-se de que essa é a porta correta
});

conn.connect()
    .then(() => {
        console.log("Conectado ao PostgreSQL");
        inicializarBanco();
        inserirPessoa('Bruno');
        inserirUsuario('Bruno','bruno@email');
    })
    .catch(err => console.error("Erro de conexão: ", err));

async function inicializarBanco() {
    const queries = [
        `CREATE TABLE IF NOT EXISTS usuario (
            id SERIAL PRIMARY KEY,  
            nome TEXT NOT NULL,
            email TEXT NOT NULL
        );`,
        `CREATE TABLE IF NOT EXISTS pessoa (
            id SERIAL PRIMARY KEY,  
            nome TEXT NOT NULL
        );`,
        `TRUNCATE TABLE usuario;`,
        `TRUNCATE TABLE pessoa;`
    ];

    for (const query of queries) {
        console.log("Executando query:", query);
        try {
            await conn.query(query); // ✅ Correção: agora aguardamos a execução
            console.log("Tabela criada com sucesso!");
        } catch (error) {
            console.error("Erro ao criar tabelas:", error);
        }
    }
}

async function inserirPessoa(nome) {
    try{
        await conn.query('INSERT INTO  pessoa (nome) values ($1)', [nome])
    console.log(`Pessoa ${nome} adicionada com sucesso`)
    }
    catch (erro) {
        console.error(`Erro: ${erro}`)
    };
}

async function inserirUsuario(nome,email) {
    try{
        await conn.query('INSERT INTO  usuario (nome,email) values ($1,$2)', [nome,email])
    console.log(`Usuario ${nome} adicionada com sucesso`)
    }
    catch (erro) {
        console.error(`Erro: ${erro}`)
    }
   
}

async function buscarPessoa() {
    const {rows} = await conn.query("SELECT * FROM pessoa");
    return rows;
}



async function buscarUsuario() {
    const {rows} = await conn.query("SELECT * FROM usuario");
    return rows;
}

// Rota simples
app.get('/', (req, res) => {
    res.send('Olá, mundo!');
});

app.get('/pessoa', async (req,res) => {
    let resposta = await buscarPessoa()
    console.log(resposta)
    res.send(resposta)
})

app.get('/Usuario', async (req,res) => {
    let resposta = await buscarUsuario()
    console.log(resposta)
    res.send(resposta)
})

// Servidor rodando na porta 3000
app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
})
