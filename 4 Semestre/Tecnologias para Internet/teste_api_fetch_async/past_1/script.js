function buscarCep() {
  // https://viacep.com.br/ws/85805437/json
  var url = "https://viacep.com.br/ws/";

  var inputCep = document.querySelector("#inputCep");

  if (inputCep.value != "") {
    fetch(`${url}${inputCep.value}/json`)
      .then((response) => response.json())
      .then((dados) => {
        document.querySelector("#cep").innerHTML = `CEP: ${dados.cep}`;
        document.querySelector("#logradouro").innerHTML = `Logradouro: ${dados.logradouro}`; 
        document.querySelector("#complemento").innerHTML = `Complemento: ${dados.complemento}`; 
        document.querySelector("#unidade").innerHTML = `Unidade: ${dados.unidade}`; 
        document.querySelector("#bairro").innerHTML = `Bairro: ${dados.bairro}`; 
        document.querySelector("#localidade").innerHTML = `Localidade: ${dados.localidade}`; 
        document.querySelector("#uf").innerHTML = `UF: ${dados.uf}`; 
        document.querySelector("#estado").innerHTML = `Estado: ${dados.estado}`; 
        document.querySelector("#regiao").innerHTML = `Região: ${dados.regiao}`; 
        document.querySelector("#ibge").innerHTML = `IBGE: ${dados.ibge}`; 
        document.querySelector("#gia").innerHTML = `GIA: ${dados.gia}`; 
        document.querySelector("#ddd").innerHTML = `DDD: ${dados.ddd}`; 
        document.querySelector("#logrdouro").innerHTML = `Logradouro: ${dados.logrdouro}`; 
        document.querySelector("#siafi").innerHTML = `SIAFI: ${dados.siafi}`;
                        }
            )
      .catch((error) => alert(`Houve um erro na requisoção: ${error}`));
  } else {
    alert("Digite um CEP");
  }
}
