import { RacaCao } from  "./model/RacaCao";


function consultarRacasCao(): void {
    fetch("https://dog.ceo/api/breeds/list/all")
      .then((res) => res.json())
      .then((data) => {
        const racas: string[] = Object.keys(data.message);
        const select = document.getElementById("racas") as HTMLSelectElement;
  
        racas.forEach((raca) => {
          const option = document.createElement("option");
          option.value = raca;
          option.text = raca;
          select.appendChild(option);
        });
  
        select.addEventListener("change", () => {
          consultarImagensPorRaca(select.value);
        });
  
        // Mostrar imagens da primeira raça por padrão
        consultarImagensPorRaca(racas[0]);
      })
      .catch((error) => {
        console.error("Erro na requisição:", error);
      });
  }
  
  function consultarImagensPorRaca(raca: string): void {
    fetch(`https://dog.ceo/api/breed/${raca}/images`)
      .then((res) => res.json())
      .then((data) => {
        const imagens: string[] = data.message.slice(0, 5); // Pegamos só as 5 primeiras
        const racaCao = new RacaCao();
        racaCao.nome = raca;
        racaCao.imagens = imagens;
        racaCao.exibirInformacoes();
  
        const div = document.getElementById("imagens") as HTMLDivElement;
        div.innerHTML = "";
        imagens.forEach((img) => {
          const imageElement = document.createElement("img");
          imageElement.src = img;
          imageElement.width = 200;
          imageElement.style.margin = "10px";
          div.appendChild(imageElement);
        });
      })
      .catch((error) => {
        console.error("Erro na requisição de imagens:", error);
      });
  }
  
  consultarRacasCao();