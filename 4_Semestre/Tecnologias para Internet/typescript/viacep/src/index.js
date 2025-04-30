"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function consultarCEP(cep) {
    fetch("https://viacep.com.br/ws/".concat(cep, "/json"))
        .then(function (res) { return res.json(); })
        .then(function (data) {
        if (data.erro) {
            console.log("CEP não encontrado!");
        }
        else {
            console.log("Endereço encontrado");
            console.log(data);
        }
    })
        .catch(function (error) {
        console.log("Erro na requisi\u00E7\u00E3o: ".concat(error));
    });
}
consultarCEP("85805437");
