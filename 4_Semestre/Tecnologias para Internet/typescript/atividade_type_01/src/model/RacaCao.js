"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RacaCao = void 0;
var RacaCao = /** @class */ (function () {
    function RacaCao() {
        this.nome = "";
        this.imagens = [];
    }
    RacaCao.prototype.exibirInformacoes = function () {
        console.log("Ra\u00E7a: ".concat(this.nome));
        console.log("Imagens:");
        this.imagens.forEach(function (img, i) {
            console.log("".concat(i + 1, ": ").concat(img));
        });
    };
    return RacaCao;
}());
exports.RacaCao = RacaCao;
