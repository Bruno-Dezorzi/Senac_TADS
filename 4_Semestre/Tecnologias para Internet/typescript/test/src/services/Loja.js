"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Loja = void 0;
var Loja = /** @class */ (function () {
    function Loja() {
        this.estoque = [];
    }
    Loja.prototype.adicionarVeiculo = function (veiculo) {
        this.estoque.push(veiculo);
        console.log("\n ".concat(veiculo.marca, " ").concat(veiculo.modelo, " adicionado ao estoque"));
    };
    Loja.prototype.listaEstoque = function () {
        console.log("\n Estoque da loja");
        if (this.estoque.length === 0) {
            console.log("Nenhum veículo disponível");
            return;
        }
        this.estoque.forEach(function (veiculo) { return veiculo.exibirDetalhes(); });
    };
    return Loja;
}());
exports.Loja = Loja;
