window.onload = (e) => {
    var buscarPessoaPorIdBotao = document.getElementById("buscarPessoaPorIdBotao");

    buscarPessoaPorIdBotao.addEventListener("click", function (e) {
        const id = document.getElementById('buscarPessoaPorId').value; 

        if (!id) {
            alert("Por favor, insira um ID Pessoa");
            return; 
        }

        window.location.href = `/pessoa/${id}`;
    });

    var buscarUsuarioPorIdBotao = document.getElementById("buscarUsuarioPorIdBotao");

    buscarUsuarioPorIdBotao.addEventListener("click", function (e) {
        const id = document.getElementById('buscarUsuarioPorId').value; 

        if (!id) {
            alert("Por favor, insira um ID Usuario");
            return; 
        }

        window.location.href = `/usuario/${id}`;
    });

    /////////////////////////////////////////////////////////////////////////////////////////////

    function inserirPessoa() {
        const nomePessoa = document.getElementById('AdicionarPessoa').value;
    
        // Verificar se o nome foi fornecido
        if (!nomePessoa) {
            alert("Por favor, insira o nome da pessoa.");
            return;
        }
    
        // Enviar os dados para a rota do backend
        fetch('/pessoa', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ nome: nomePessoa }) // Envia o nome da pessoa no corpo da requisição
        })
        .then(response => response.text()) // Espera a resposta do servidor em texto
        .catch(error => {
            console.error('Erro:', error);
            alert("Erro ao adicionar a pessoa.");
        });
    }
    
}