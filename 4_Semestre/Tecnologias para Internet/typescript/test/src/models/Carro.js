"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Carro = void 0;
var Veiculo_1 = require("./Veiculo");
var Carro = /** @class */ (function (_super) {
    __extends(Carro, _super);
    function Carro(marca, modelo, ano, preco, porta) {
        var _this = _super.call(this, marca, modelo, ano, preco) || this;
        _this.porta = porta;
        return _this;
    }
    Carro.prototype.getPorta = function () {
        return this.porta;
    };
    Carro.prototype.setPorta = function (porta) {
        this.porta = porta;
    };
    Carro.prototype.exibirDetalhes = function () {
        console.log("Carro: ".concat(this.marca, ", ").concat(this.ano, ",R$ ").concat(this.preco, " e quantidade de portas: ").concat(this.porta));
    };
    return Carro;
}(Veiculo_1.Veiculo));
exports.Carro = Carro;
