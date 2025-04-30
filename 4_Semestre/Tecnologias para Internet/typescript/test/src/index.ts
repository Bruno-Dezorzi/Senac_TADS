import { Carro } from "./models/Carro";
import { Moto } from "./models/Moto";
import { Loja } from "./services/Loja";

const loja = new Loja();

const carro1 = new Carro("Toyota","Corolla",2020,80000,4);
const carro2 = new Carro("Nissan","Kicks",2022,90000,4);

const moto1 = new Moto("Honda","CG Titan",2010,1200,150);
const moto2 = new Moto("Royal Enfield","Super Meteor",2025,3500,650);

loja.adicionarVeiculo(carro1);
loja.adicionarVeiculo(carro2);

loja.listaEstoque();

loja.adicionarVeiculo(moto1);
loja.adicionarVeiculo(moto2);

loja.listaEstoque();