"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var RacaCao_1 = require("./model/RacaCao");
function consultarImagensPorRaca(raca) {
    fetch("https://dog.ceo/api/breed/".concat(raca, "/images"))
        .then(function (res) { return res.json(); })
        .then(function (data) {
        var imagens = data.message;
        var racaCao = new RacaCao_1.RacaCao();
        racaCao.nome = raca;
        racaCao.imagens = imagens;
        racaCao.exibirInformacoes(); // Exibe as informações da raça
    })
        .catch(function (error) {
        console.log("Erro na requisição de imagens:", error);
    });
}
function consultarRacasCao() {
    fetch("https://dog.ceo/api/breeds/list/all")
        .then(function (res) { return res.json(); })
        .then(function (data) {
        var racas = Object.keys(data.message);
        console.log("Raças de Cachorros:");
        racas.forEach(function (raca) {
            console.log(raca); // Exibe o nome de cada raça
        });
        consultarImagensPorRaca(racas[0]); // Consulta imagens de uma raça específica
    })
        .catch(function (error) {
        console.log("Erro na requisição:", error);
    });
}
consultarRacasCao();
