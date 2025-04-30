"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var RacaCao_1 = require("./model/RacaCao");
function consultarRacasCao() {
    fetch("https://dog.ceo/api/breeds/list/all")
        .then(function (res) { return res.json(); })
        .then(function (data) {
        var racas = Object.keys(data.message);
        var select = document.getElementById("racas");
        racas.forEach(function (raca) {
            var option = document.createElement("option");
            option.value = raca;
            option.text = raca;
            select.appendChild(option);
        });
        select.addEventListener("change", function () {
            consultarImagensPorRaca(select.value);
        });
        // Mostrar imagens da primeira raça por padrão
        consultarImagensPorRaca(racas[0]);
    })
        .catch(function (error) {
        console.error("Erro na requisição:", error);
    });
}
function consultarImagensPorRaca(raca) {
    fetch("https://dog.ceo/api/breed/".concat(raca, "/images"))
        .then(function (res) { return res.json(); })
        .then(function (data) {
        var imagens = data.message.slice(0, 5); // Pegamos só as 5 primeiras
        var racaCao = new RacaCao_1.RacaCao();
        racaCao.nome = raca;
        racaCao.imagens = imagens;
        racaCao.exibirInformacoes();
        var div = document.getElementById("imagens");
        div.innerHTML = "";
        imagens.forEach(function (img) {
            var imageElement = document.createElement("img");
            imageElement.src = img;
            imageElement.width = 200;
            imageElement.style.margin = "10px";
            div.appendChild(imageElement);
        });
    })
        .catch(function (error) {
        console.error("Erro na requisição de imagens:", error);
    });
}
consultarRacasCao();
