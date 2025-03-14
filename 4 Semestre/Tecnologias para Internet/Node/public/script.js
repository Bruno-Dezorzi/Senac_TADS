const { response } = require("express");

function insertPessoa(){
    var inputPessoa = document.querySelector("#InsertPessoa");
    var url = 'localhost:3000/pessoa'
    fetch(url)
        .then((response) => response.json)
        .then((data) => {
            console.log(data);
        }).catch((error) => {
            console.error(error);
        })
}