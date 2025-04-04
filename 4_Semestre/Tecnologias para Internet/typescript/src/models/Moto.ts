import { Veiculo } from "./Veiculo";

export class Moto extends Veiculo{
    constructor(
        marca: string,
        modelo: string,
        ano: number,
        preco: number,
        public cilindradas : number
   ){
       super(marca,modelo,ano,preco);
   }

   public getCilindradas() : number{
       return this.cilindradas;
   }

   public setCilindradas(porta: number) : void{
       this.cilindradas = porta
   }

   exibirDetalhes(): void {
       console.log(`Carro: ${this.marca}, ${this.ano}, R$ ${this.preco} e quantidade de cilindradas: ${this.cilindradas}`);
   }
}