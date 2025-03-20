function buscarPersonagem(){
  var url = "https://rickandmortyapi.com/api/character/";
  var inputPers = document.querySelector("#numeropersonagem");
  
  if (inputPers.value.trim() !== "") {
      fetch(`${url}${inputPers.value}`)
          .then(response => response.json())
          .then(dados => {
              document.querySelector("#name").innerHTML = `Nome: ${dados.name}`;
              document.querySelector("#status").innerHTML = `Status: ${dados.status}`;
              document.querySelector("#species").innerHTML = `Espécie: ${dados.species}`;
              document.querySelector("#type").innerHTML = `Tipo: ${dados.type}`;
              document.querySelector("#gender").innerHTML = `Genêro: ${dados.gender}`;
              document.querySelector("#origin_name").innerHTML = `Nome de Origem: ${dados.origin_name}`;
              document.querySelector("#location_name").innerHTML = `Nome do Local: ${dados.location_name}`;
              document.querySelector("#episode").innerHTML = `Episódio: ${dados.episode}`;
          })
          .catch(error => alert(`Erro na requisição: ${error}`));
  } else {
      alert("Número sem personagem");
  }
}