function buscarPessoaPorId() {
    const id = document.getElementById('idPessoa').value; // Pega o valor do input
    if (!id) {
        alert('Por favor, insira um ID');
        return;
    }

    fetch(`/pessoa/${id}`)
        .then(response => response.json())
        .then(data => {
            const container = document.querySelector('.pessoa');
            container.innerHTML = ''; // Limpa o conteúdo antes de inserir novos dados

            if (!data) {
                container.innerHTML = `<p>Nenhuma pessoa encontrada com ID ${id}.</p>`;
                return;
            }

            const div = document.createElement('div');
            div.innerHTML = `
                <p><strong>ID:</strong> ${data.id}</p>
                <p><strong>Nome:</strong> ${data.nome}</p>
            `;
            container.appendChild(div);
        })
        .catch(error => {
            console.error('Erro ao buscar pessoa:', error);
            alert('Ocorreu um erro ao buscar a pessoa. Tente novamente mais tarde.');
        });
}

function adicionarPessoa() {
    const nome = document.getElementById('nomePessoa').value;
    if (!nome) {
        alert('Por favor, insira um nome');
        return;
    }

    fetch('/pessoa', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ nome: nome }),
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao adicionar pessoa');
        }
        return response.text();
    })
    .then(data => {
        alert(data);
        document.getElementById('nomePessoa').value = ''; // Limpa o campo
    })
    .catch(error => {
        console.error('Erro ao adicionar pessoa:', error);
        alert('Ocorreu um erro ao adicionar a pessoa. Tente novamente mais tarde.');
    });
}

function atualizarPessoa() {
    const id = document.getElementById('idPessoaAtualizar').value;
    const nome = document.getElementById('novoNomePessoa').value;
    if (!id || !nome) {
        alert('Por favor, insira um ID e um novo nome');
        return;
    }

    fetch(`/pessoa/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ nome: nome }),
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao atualizar pessoa');
        }
        return response.text();
    })
    .then(data => {
        alert(data);
    })
    .catch(error => {
        console.error('Erro ao atualizar pessoa:', error);
        alert('Ocorreu um erro ao atualizar a pessoa. Tente novamente mais tarde.');
    });
}

function deletarPessoa() {
    const id = document.getElementById('idPessoaDeletar').value;
    if (!id) {
        alert('Por favor, insira um ID');
        return;
    }

    fetch(`/pessoa/${id}`, {
        method: 'DELETE',
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao deletar pessoa');
        }
        return response.text();
    })
    .then(data => {
        alert(data);
    })
    .catch(error => {
        console.error('Erro ao deletar pessoa:', error);
        alert('Ocorreu um erro ao deletar a pessoa. Tente novamente mais tarde.');
    });
}

function adicionarUsuario() {
    const nome = document.getElementById('nomeUsuario').value;
    const email = document.getElementById('emailUsuario').value;
    if (!nome || !email) {
        alert('Por favor, insira um nome e um e-mail');
        return;
    }

    fetch('/usuario', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ nome: nome, email: email }),
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao adicionar usuário');
        }
        return response.text();
    })
    .then(data => {
        alert(data);
        document.getElementById('nomeUsuario').value = ''; // Limpa o campo
        document.getElementById('emailUsuario').value = ''; // Limpa o campo
    })
    .catch(error => {
        console.error('Erro ao adicionar usuário:', error);
        alert('Ocorreu um erro ao adicionar o usuário. Tente novamente mais tarde.');
    });
}
