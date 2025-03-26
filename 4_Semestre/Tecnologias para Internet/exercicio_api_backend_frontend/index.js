const express = require("express");
const { Pool } = require("pg");
//const path = require('path');

const port = 3000;
const app = express();

app.use(express.static("public"));

// Conexão com o banco de dados
const conn = new Pool({
  host: "localhost",
  user: "postgres",
  password: "123456", //'admin',
  database: "node",
  port: 5432,
});

conn
  .connect()
  .then(async () => {
    console.log("Conectado ao PostgreSQL");
    await inicializarBanco();
    await adicionarDadosTeste();
  })
  .catch((err) => console.error("Erro de conexão: ", err));

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
            );`,
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

async function adicionarDadosTeste() {
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
                ('Natália Duarte');`,
  ];
  for (const query of queries) {
    console.log("Executando a inserção..");
    try {
      await conn.query(query);
      console.log("Insert com sucesso");
    } catch (error) {
      console.log("Erro: ", error);
    }
  }
}

async function buscarPessoa() {
  try {
    const resultado = await conn.query("SELECT * FROM pessoa");
    return resultado.rows; 
  } catch (error) {
    console.error("Erro ao buscar pessoas:", error);
    throw error; 
  }
}

async function buscarPessoaPorId(id) {
  try {
    const resultado = await conn.query("SELECT * FROM pessoa WHERE id = $1", [
      id,
    ]);
    return resultado.rows[0]; 
  } catch (error) {
    console.error("Erro ao buscar pessoa por ID:", error);
    throw error;
  }
}

async function inserirPessoa(nome) {
  try {
    const query = "INSERT INTO pessoa (nome) VALUES ($1)";
    await conn.query(query, [nome]);
  } catch (error) {
    console.error("Erro ao inserir pessoa:", error);
    throw error;
  }
}

async function atualizarPessoa(id, nome) {
  try {
    const query = "UPDATE pessoa SET nome = $1 WHERE id = $2";
    await conn.query(query, [nome, id]);
  } catch (error) {
    console.error("Erro ao atualizar pessoa:", error);
    throw error;
  }
}

async function deletarPessoa(id) {
  try {
    const query = "DELETE FROM pessoa WHERE id = $1";
    await conn.query(query, [id]);
  } catch (error) {
    console.error("Erro ao deletar pessoa:", error);
    throw error;
  }
}

async function buscarUsuario() {
  try {
    const resultado = await conn.query("SELECT * FROM usuario");
    return resultado.rows; 
  } catch (error) {
    console.error("Erro ao buscar pessoas:", error);
    throw error; 
  }
}

async function buscarUsuarioPorId(id) {
  try {
    const resultado = await conn.query("SELECT * FROM usuario WHERE id = $1", [
      id,
    ]);
    return resultado.rows[0];
  } catch (error) {
    console.error("Erro ao buscar usuário por ID:", error);
    throw error;
  }
}

async function inserirUsuario(nome, email) {
  try {
    const query = "INSERT INTO usuario (nome, email) VALUES ($1, $2)";
    await conn.query(query, [nome, email]);
  } catch (error) {
    console.error("Erro ao inserir usuário:", error);
    throw error;
  }
}

async function atualizarUsuario(id, nome, email) {
  try {
    const query = "UPDATE usuario SET nome = $1, email = $2 WHERE id = $3";
    await conn.query(query, [nome, email, id]);
  } catch (error) {
    console.error("Erro ao atualizar usuário:", error);
    throw error;
  }
}

async function deletarUsuario(id) {
  try {
    const query = "DELETE FROM usuario WHERE id = $1";
    await conn.query(query, [id]);
  } catch (error) {
    console.error("Erro ao deletar usuário:", error);
    throw error;
  }
}



















// Rota para buscar todas as pessoas
app.get("/pessoa", async (req, res) => {
  try {
    let resposta = await buscarPessoa();
    res.json(resposta); // Retorna as pessoas em formato JSON
  } catch (error) {
    console.error("Erro ao buscar pessoas:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

// Rota para buscar uma pessoa por ID
app.get("/pessoa/:id", async (req, res) => {
  try {
    let resposta = await buscarPessoaPorId(req.params.id);
    if (!resposta) {
      return res.status(404).json({ message: "Pessoa não encontrada" });
    }
    res.json(resposta);
  } catch (error) {
    console.error("Erro ao buscar pessoa:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

// Rota para adicionar uma pessoa
app.post("/pessoa", async (req, res) => {
  try {
    await inserirPessoa(req.body.nome);
    res.status(201).send("Pessoa inserida com sucesso!");
  } catch (error) {
    console.error("Erro ao inserir pessoa:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

// Rota para atualizar uma pessoa
app.put("/pessoa/:id", async (req, res) => {
  try {
    await atualizarPessoa(req.params.id, req.body.nome);
    res.send("Pessoa atualizada com sucesso!");
  } catch (error) {
    console.error("Erro ao atualizar pessoa:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

// Rota para deletar uma pessoa
app.delete("/pessoa/:id", async (req, res) => {
  try {
    await deletarPessoa(req.params.id);
    res.send("Pessoa deletada com sucesso!");
  } catch (error) {
    console.error("Erro ao deletar pessoa:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

// Rota para buscar todas as usuarios
app.get("/usuario", async (req, res) => {
  try {
    let resposta = await buscarUsuario();
    res.json(resposta); // Retorna as usuarios em formato JSON
  } catch (error) {
    console.error("Erro ao buscar usuarios:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

app.get("/usuario/:id", async (req, res) => {
  try {
    const resposta = await buscarUsuarioPorId(req.params.id);
    if (!resposta) {
      return res.status(404).json({ message: "Usuário não encontrado" });
    }
    res.json(resposta);
  } catch (error) {
    console.error("Erro ao buscar usuário:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

app.post("/usuario", async (req, res) => {
  try {
    await inserirUsuario(req.body.nome, req.body.email);
    res.status(201).send("Usuário inserido com sucesso!");
  } catch (error) {
    console.error("Erro ao inserir usuário:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

app.put("/usuario/:id", async (req, res) => {
  try {
    await atualizarUsuario(req.params.id, req.body.nome, req.body.email);
    res.send("Usuário atualizado com sucesso!");
  } catch (error) {
    console.error("Erro ao atualizar usuário:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

app.delete("/usuario/:id", async (req, res) => {
  try {
    await deletarUsuario(req.params.id);
    res.send("Usuário deletado com sucesso!");
  } catch (error) {
    console.error("Erro ao deletar usuário:", error);
    res.status(500).json({ message: "Erro ao processar a requisição" });
  }
});

app.listen(port, () => {
  console.log(`Example app listening on http://localhost:${port}/`);
});
