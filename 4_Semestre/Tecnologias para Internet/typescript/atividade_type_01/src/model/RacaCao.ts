export class RacaCao {
    nome: string = "";
    imagens: string[] = [];
  
    exibirInformacoes(): void {
      console.log(`Raça: ${this.nome}`);
      console.log("Imagens:");
      this.imagens.forEach((img, i) => {
        console.log(`${i + 1}: ${img}`);
      });
    }
  }
  