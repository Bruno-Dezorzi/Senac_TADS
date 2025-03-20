function buscarPessoas() {
    fetch('/pessoa')
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(error => console.error('Erro ao buscar pessoas:', error));
}

function buscarPessoaPorId(id) {
    fetch(`/pessoa/${id}`)
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(error => console.error(`Erro ao buscar pessoa com ID ${id}:`, error));
}

function buscarPessoas() {
    fetch('/usuario')
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(error => console.error('Erro ao buscar pessoas:', error));
}

function inserirPessoa(nome) {
    fetch('/pessoa', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nome })
    })
    .then(response => response.text())
    .then(data => console.log(data))
    .catch(error => console.error('Erro ao inserir pessoa:', error));
}

function atualizarPessoa(id, novoNome) {
    fetch(`/pessoa/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nome: novoNome })
    })
    .then(response => response.text())
    .then(data => console.log(data))
    .catch(error => console.error(`Erro ao atualizar pessoa com ID ${id}:`, error));
}

function deletarPessoa(id) {
    fetch(`/pessoa/${id}`, {
        method: 'DELETE'
    })
    .then(response => response.text())
    .then(data => console.log(data))
    .catch(error => console.error(`Erro ao deletar pessoa com ID ${id}:`, error));
}

/**
 * Como usar
 * buscarPessoas(); // Lista todas as pessoas
buscarPessoaPorId(1); // Busca pessoa com ID 1
inserirPessoa('Carlos'); // Insere uma nova pessoa chamada Carlos
atualizarPessoa(2, 'Ana Clara'); // Atualiza pessoa com ID 2 para o nome Ana Clara
deletarPessoa(3); // Deleta pessoa com ID 3
 */