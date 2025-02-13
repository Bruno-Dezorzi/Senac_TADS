// Função de validação dos campos de email, senha e CPF
function validacao() {
    // Obtém os valores dos campos de email, senha e CPF
    var email = document.getElementById('email').value;
    var senha = document.getElementById('senha').value;
    var cpf = document.getElementById('cpf').value;

    // Valores válidos para comparação
    var valide = 'aluno@senac.com.br';
    var valids = '1234';
    var validc = '12345678912345';

    // Verifica se o CPF tem exatamente 14 caracteres
    if (cpf.length !== 14) {
        alert("CPF deve ter 14 caracteres");
        return false; // Interrompe a execução da função e impede o envio do formulário
    }

    // Verifica se email, senha e CPF são válidos
    if (email === valide && senha === valids && cpf === validc) {
        // Redireciona para a página home.html se todos os valores forem corretos
        window.location.href = '/pages/home.html';  
        return false; // Interrompe a execução da função para evitar qualquer comportamento padrão
    } else {
        // Verifica qual(is) campo(s) está(ão) incorreto(s) e exibe a mensagem apropriada
        if (email !== valide && senha !== valids) {
            alert("Email e senha incorretos");
        } else if (email !== valide) {
            alert("Email Incorreto");
        } else if (senha !== valids) {
            alert("Senha Incorreta");
        } else if (cpf !== validc) {
            alert("CPF incorreto");
        }
        return false; // Interrompe a execução da função e impede o envio do formulário
    }
}
