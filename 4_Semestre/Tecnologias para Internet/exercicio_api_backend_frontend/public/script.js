window.onload = (e) => {
  var buscarPessoaPorIdBotao = document.getElementById(
    "buscarPessoaPorIdBotao"
  );

  buscarPessoaPorIdBotao.addEventListener("click", function (e) {
    const id = document.getElementById("buscarPessoaPorId").value;

    if (!id) {
      alert("Por favor, insira um ID Pessoa");
      return;
    }

    window.location.href = `/pessoa/${id}`;
  });
  //////////////////////////////////////////////////////////////////////////////////////////////

  var buscarUsuarioPorIdBotao = document.getElementById(
    "buscarUsuarioPorIdBotao"
  );

  buscarUsuarioPorIdBotao.addEventListener("click", function (e) {
    const id = document.getElementById("buscarUsuarioPorId").value;

    if (!id) {
      alert("Por favor, insira um ID Usuario");
      return;
    }

    window.location.href = `/usuario/${id}`;
  });

  /////////////////////////////////////////////////////////////////////////////////////////////

  var botaoAdicionarPessoa = document.getElementById("AdicionarPessoaBotao");

  botaoAdicionarPessoa.addEventListener("click", async function (e) {
    e.preventDefault(); // Evita recarregar a página, caso o botão esteja dentro de um formulário

    const nomePessoa = document.getElementById("AdicionarPessoa").value;

    // Verificar se o nome foi fornecido
    if (!nomePessoa.trim()) {
      alert("Por favor, insira o nome da pessoa.");
      return;
    }

    // Enviar os dados para a rota do backend
    await fetch("/pessoa", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ nome: nomePessoa }), // Envia o nome da pessoa no corpo da requisição
    })
      .then((response) => response.json()) // Espera a resposta da API em JSON
      .then((data) => {
        alert(data.message); // Exibe a resposta da API
        document.getElementById("AdicionarPessoa").value = ""; // Limpa o input
      })
      .catch((error) => {
        console.error("Erro:", error);
        alert("Erro ao adicionar a pessoa.");
      });
  });
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  var botaoAdicionarUsuario = document.getElementById("AdicionarUsuarioBotao");

  botaoAdicionarUsuario.addEventListener("click", async function (e) {
    e.preventDefault();

    const nomeUsuario = document.getElementById("AdicionarNomeUsuario").value;
    const emailUsuario = document.getElementById("AdicionarEmailUsuario").value;

    // Verificar se o nome foi fornecido
    if (!nomeUsuario.trim()) {
      alert("Por favor, insira o nome do Usuário.");
      return;
    }

    if (!emailUsuario.trim()) {
      alert("Por favor, insira o email do Usuário.");
      return;
    }

    await fetch("/usuario", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ nome: nomeUsuario, email: emailUsuario }),
    })
      .then((response) => response.json())
      .then((data) => {
        console.log("Resposta do servidor:", data); // Adicione isso para depurar
        if (data && data.message) {
          alert(data.message);
        } else {
          alert("Resposta inválida do servidor.");
        }
        document.getElementById("AdicionarNomeUsuario").value = "";
        document.getElementById("AdicionarEmailUsuario").value = "";
      })
      .catch((error) => {
        console.error("Erro:", error);
        alert("Erro ao adicionar a usuário.");
      });
  });

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  var BotaoPessoaAtualizar = document.getElementById("BotaoPessoaAtualizar");

  BotaoPessoaAtualizar.addEventListener("click", async function (e) {
    e.preventDefault();

    const IdPessoaAtualizar =
      document.getElementById("IdPessoaAtualizar").value;
    const NomePessoaAtualizar = document.getElementById(
      "NomePessoaAtualizar"
    ).value;

    // Verificar se o nome foi fornecido
    if (!IdPessoaAtualizar.trim()) {
      alert("Por favor, insira o id da pessoa.");
      return;
    }

    if (!NomePessoaAtualizar.trim()) {
      alert("Por favor, insira o nome da pessoa.");
      return;
    }

    await fetch(`/pessoa/${IdPessoaAtualizar}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ nome: NomePessoaAtualizar }),
    })
      .then((response) => response.json())
      .then((data) => {
        console.log("Resposta do servidor:", data); // Adicione isso para depurar
        if (data && data.message) {
          alert(data.message);
        } else {
          alert("Resposta inválida do servidor.");
        }
        document.getElementById("IdPessoaAtualizar").value = "";
        document.getElementById("NomePessoaAtualizar").value = "";
      })
      .catch((error) => {
        console.error("Erro:", error);
        alert("Erro ao atualizar a pessoa.");
      });
  });

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  var BotaoUsuarioAtualizar = document.getElementById("BotaoUsuarioAtualizar");

  BotaoUsuarioAtualizar.addEventListener("click", async function (e) {
    e.preventDefault();

    const IdUsuarioAtualizar =
      document.getElementById("IdUsuarioAtualizar").value;
    const NomeUsuarioAtualizar = document.getElementById(
      "NomeUsuarioAtualizar"
    ).value;
    const EmailUsuarioAtualizar = document.getElementById(
      "EmailUsuarioAtualizar"
    ).value;

    // Verificar se o nome foi fornecido
    if (!IdUsuarioAtualizar.trim()) {
      alert("Por favor, insira o id do Usuário.");
      return;
    }

    if (!NomeUsuarioAtualizar.trim()) {
      alert("Por favor, insira o nome do Usuário.");
      return;
    }

    if (!EmailUsuarioAtualizar.trim()) {
      alert("Por favor, insira o email do Usuário.");
      return;
    }

    await fetch(`/usuario/${IdUsuarioAtualizar}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({
        nome: NomeUsuarioAtualizar,
        email: EmailUsuarioAtualizar,
      }),
    })
      .then((response) => response.json())
      .then((data) => {
        console.log("Resposta do servidor:", data); // Adicione isso para depurar
        if (data && data.message) {
          alert(data.message);
        } else {
          alert("Resposta inválida do servidor.");
        }
        document.getElementById("IdUsuarioAtualizar").value = "";
        document.getElementById("NomeUsuarioAtualizar").value = "";
        document.getElementById("EmailUsuarioAtualizar").value = "";
      })
      .catch((error) => {
        console.error("Erro:", error);
        alert("Erro ao atualizar o usuário.");
      });
  });

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  var BotaoPessoaDelete = document.getElementById("BotaoPessoaDelete");

  BotaoPessoaDelete.addEventListener("click", async function (e) {
    e.preventDefault();

    const IdPessoaDelete = document.getElementById("IdPessoaDelete").value;

    // Verificar se o nome foi fornecido
    if (!IdPessoaDelete.trim()) {
      alert("Por favor, insira o id da pessoa.");
      return;
    }

    await fetch(`/pessoa/${IdPessoaDelete}`, {
      method: "DELETE",
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((data) => {
        console.log("Resposta do servidor:", data); // Adicione isso para depurar
        if (data && data.message) {
          alert(data.message);
        } else {
          alert("Resposta inválida do servidor.");
        }
        document.getElementById("IdPessoaDelete").value = "";
      })
      .catch((error) => {
        console.error("Erro:", error);
        alert("Erro ao adicionar a pessoa.");
      });
  });

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  var BotaoUsuarioDelete = document.getElementById("BotaoUsuarioDelete");

  BotaoUsuarioDelete.addEventListener("click", async function (e) {
    e.preventDefault();

    const IdUsuarioDelete = document.getElementById("IdUsuarioDelete").value;

    // Verificar se o nome foi fornecido
    if (!IdUsuarioDelete.trim()) {
      alert("Por favor, insira o id da usuário.");
      return;
    }

    await fetch(`/usuario/${IdUsuarioDelete}`, {
      method: "DELETE",
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((data) => {
        console.log("Resposta do servidor:", data); // Adicione isso para depurar
        if (data && data.message) {
          alert(data.message);
        } else {
          alert("Resposta inválida do servidor.");
        }
        document.getElementById("IdUsuarioDelete").value = "";
      })
      .catch((error) => {
        console.error("Erro:", error);
        alert("Erro ao adicionar a usuário.");
      });
  });
};
