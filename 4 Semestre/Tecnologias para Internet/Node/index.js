const express = require('express');
const { Pool } = require('pg');

const app = express();

const conn = new Pool({
    host: 'localhost',
    user: 'postgres',
    password: 'admin',
    database: 'postgres',
    port: 5432, // Certifique-se de que essa é a porta correta
});

conn.connect()
    .then(() => {
        console.log("Conectado ao PostgreSQL");
        inicializarBanco();
    })
    .catch(err => console.error("Erro de conexão: ", err));

async function inicializarBanco() {
    const queries = [
        `CREATE TABLE IF NOT EXISTS usuario (
            id SERIAL PRIMARY KEY,  
            nome TEXT NOT NULL,
            email TEXT NOT NULL
        )`,
        `CREATE TABLE IF NOT EXISTS pessoa (
            id SERIAL PRIMARY KEY,  
            nome TEXT NOT NULL
        )`
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

// Rota simples
app.get('/', (req, res) => {
    res.send('Olá, mundo!');
});

// Servidor rodando na porta 3000
app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
});
