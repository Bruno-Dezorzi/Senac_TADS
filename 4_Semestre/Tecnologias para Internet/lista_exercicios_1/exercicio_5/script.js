function adicionarTarefa(){
    let lista = document.getElementsByClassName("lista")
    let tarefa = document.getElementById("desc").value.trim();
     

    if(tarefa !== ""){
        lista[0].appendChild(document.createElement('li')).appendChild(document.createElement[tarefa])
        document.getElementById('desc').value = "";
    }
    else{
        stop
    }
}

function removerTarefa(){
    let lista = document.getElementsByClassName("lista")
    lista[0].removeChild(lista[0].lastChild)
}