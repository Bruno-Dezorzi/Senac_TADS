function buscarCep() {
  var url = "https://viacep.com.br/ws/";
  var inputCep = document.querySelector("#inputCep");
  
  if (inputCep.value.trim() !== "") {
      fetch(`${url}${inputCep.value}/json`)
          .then(response => response.json())
          .then(dados => {
              document.querySelector("#cep").innerHTML = `CEP: ${dados.cep}`;
              document.querySelector("#logradouro").innerHTML = `Logradouro: ${dados.logradouro}`;
              document.querySelector("#bairro").innerHTML = `Bairro: ${dados.bairro}`;
              document.querySelector("#cidade").innerHTML = `Cidade-UF: ${dados.localidade} - ${dados.uf}`;
              document.querySelector("#estado").innerHTML = `Estado: ${dados.uf}`;
              document.querySelector("#ibge").innerHTML = `IBGE: ${dados.ibge}`;
              document.querySelector("#gia").innerHTML = `GIA: ${dados.gia}`;
              document.querySelector("#ddd").innerHTML = `DDD: ${dados.ddd}`;
              document.querySelector("#siafi").innerHTML = `SIAFI: ${dados.siafi}`;
          })
          .catch(error => alert(`Erro na requisição: ${error}`));
  } else {
      alert("Digite um CEP válido");
  }
}