function detectar_campo_preenchido(){
    let nome = document.getElementById("fname").value.trim();
    let sobrenome = document.getElementById("fsecondname").value.trim();

    if(nome !== "" && sobrenome !== ""){
        alert("Parabéns por preencher");
    } else {
        alert("Preencha as colunas");
    }

}
