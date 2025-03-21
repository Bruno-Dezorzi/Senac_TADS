const express = require('express');
const { Pool } = require('pg');
const path = require('path');

const port = 3000;
const app = express();

app.use(express.static('public'))



app.get('/',(req,res) => {
    res.send("Hello World!")
})


const conn = new Pool({
    host: 'localhost',
    user: 'postgres',
    password: 'admin',
    database: 'node',
    port: 5432, // Certifique-se de que essa é a porta correta
});

conn.connect()
    .then(async() => {
        console.log("Conectado ao PostgreSQL");
        await inicializarBanco();
        await adicionarDadosTeste();
    })
    .catch(err => console.error("Erro de conexão: ", err));

    async function inicializarBanco() {
        const queries = [
            `DROP TABLE IF EXISTS usuario;`,
            `DROP TABLE IF EXISTS pessoa;`,
            `CREATE TABLE IF NOT EXISTS usuario (
                id SERIAL PRIMARY KEY,  
                nome TEXT NOT NULL,
                email TEXT NOT NULL
            );`,
            `CREATE TABLE IF NOT EXISTS pessoa (
                id SERIAL PRIMARY KEY,  
                nome TEXT NOT NULL
            );`
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

    async function adicionarDadosTeste(){
        const queries = [
            `INSERT INTO usuario (nome, email) 
            VALUES 
                ('João Silva', 'joao.silva@email.com'),
                ('Maria Souza', 'maria.souza@email.com'),
                ('Carlos Pereira', 'carlos.pereira@email.com'),
                ('Ana Oliveira', 'ana.oliveira@email.com'),
                ('Pedro Santos', 'pedro.santos@email.com'),
                ('Fernanda Lima', 'fernanda.lima@email.com'),
                ('Lucas Rocha', 'lucas.rocha@email.com'),
                ('Juliana Mendes', 'juliana.mendes@email.com'),
                ('Ricardo Nunes', 'ricardo.nunes@email.com'),
                ('Camila Costa', 'camila.costa@email.com'),
                ('Bruno Martins', 'bruno.martins@email.com'),
                ('Larissa Ferreira', 'larissa.ferreira@email.com'),
                ('Gustavo Almeida', 'gustavo.almeida@email.com'),
                ('Patricia Ramos', 'patricia.ramos@email.com'),
                ('Rafael Barbosa', 'rafael.barbosa@email.com'),
                ('Vanessa Teixeira', 'vanessa.teixeira@email.com'),
                ('Tiago Cardoso', 'tiago.cardoso@email.com'),
                ('Beatriz Farias', 'beatriz.farias@email.com'),
                ('Rodrigo Cunha', 'rodrigo.cunha@email.com'),
                ('Natália Duarte', 'natalia.duarte@email.com');`,
            `INSERT INTO pessoa (nome) 
            VALUES 
                ('João Silva'),
                ('Maria Souza'),
                ('Carlos Pereira'),
                ('Ana Oliveira'),
                ('Pedro Santos'),
                ('Fernanda Lima'),
                ('Lucas Rocha'),
                ('Juliana Mendes'),
                ('Ricardo Nunes'),
                ('Camila Costa'),
                ('Bruno Martins'),
                ('Larissa Ferreira'),
                ('Gustavo Almeida'),
                ('Patricia Ramos'),
                ('Rafael Barbosa'),
                ('Vanessa Teixeira'),
                ('Tiago Cardoso'),
                ('Beatriz Farias'),
                ('Rodrigo Cunha'),
                ('Natália Duarte');`

        ];
        for (const query of queries){
            console.log("Executando a inserção..")
            try{
                await conn.query(query);
                console.log("Insert com sucesso")
            }
            catch (error){
                console.log("Erro: ", error)
            }
        }
    }





// Rotas
app.get('/', (req, res) => {
    res.send('Olá, mundo!');
});

app.get('/pessoa', async (req, res) => {
    let resposta = await buscarPessoa();
    res.json(resposta);
});

app.get('/usuario', async (req, res) => {
    let resposta = await buscarUsuario();
    res.json(resposta);
});

app.get('/pessoa/:id', async (req, res) => {
    let resposta = await buscarPessoaPorId(req.params.id);
    res.json(resposta);
});

app.get('/usuario/:id', async (req, res) => {
    let resposta = await buscarUsuarioPorId(req.params.id);
    res.json(resposta);
});

app.post('/pessoa', async (req, res) => {
    await inserirPessoa(req.body.nome);
    res.send('Pessoa inserida com sucesso!');
});

app.post('/usuario', async (req, res) => {
    await inserirUsuario(req.body.nome, req.body.email);
    res.send('Usuário inserido com sucesso!');
});

app.put('/pessoa/:id', async (req, res) => {
    await atualizarPessoa(req.params.id, req.body.nome);
    res.send('Pessoa atualizada com sucesso!');
});

app.put('/usuario/:id', async (req, res) => {
    await atualizarUsuario(req.params.id, req.body.nome, req.body.email);
    res.send('Usuário atualizado com sucesso!');
});

app.delete('/pessoa/:id', async (req, res) => {
    await deletarPessoa(req.params.id);
    res.send('Pessoa deletada com sucesso!');
});

app.delete('/usuario/:id', async (req, res) => {
    await deletarUsuario(req.params.id);
    res.send('Usuário deletado com sucesso!');
});


app.listen(port,() =>{
    console.log(`Example app listening on http://localhost:${port}/`)
})