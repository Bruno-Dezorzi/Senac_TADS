import { Veiculo } from "./Veiculo";

export class Carro extends Veiculo{

    constructor(
         marca: string,
         modelo: string,
         ano: number,
         preco: number,
         public porta : number
    ){
        super(marca,modelo,ano,preco);
    }

    public getPorta() : number{
        return this.porta;
    }

    public setPorta(porta: number) : void{
        this.porta = porta
    }

    exibirDetalhes(): void {
        console.log(`Carro: ${this.marca}, ${this.ano},R$ ${this.preco} e quantidade de portas: ${this.porta}`);
    }

}