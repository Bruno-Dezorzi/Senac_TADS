import { RacaCao } from  "./model/RacaCao";


function consultarImagensPorRaca(raca: string): void {
  fetch(`https://dog.ceo/api/breed/${raca}/images`)
      .then((res) => res.json())
      .then((data) => {
          const imagens: string[] = data.message;
          const racaCao = new RacaCao();
          racaCao.nome = raca;
          racaCao.imagens = imagens;
          racaCao.exibirInformacoes();  // Exibe as informações da raça
      })
      .catch((error) => {
          console.log("Erro na requisição de imagens:", error);
      });
}

function consultarRacasCao(): void {
  fetch("https://dog.ceo/api/breeds/list/all")
      .then((res) => res.json())
      .then((data) => {
          const racas: string[] = Object.keys(data.message);
          console.log("Raças de Cachorros:");
          racas.forEach((raca) => {
              console.log(raca);  // Exibe o nome de cada raça
          });
          consultarImagensPorRaca(racas[0]);  // Consulta imagens de uma raça específica
      })
      .catch((error) => {
          console.log("Erro na requisição:", error);
      });
}
  
  consultarRacasCao();