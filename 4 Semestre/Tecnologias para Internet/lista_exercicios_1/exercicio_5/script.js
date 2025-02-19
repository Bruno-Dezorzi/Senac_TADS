function adicionarTarefa(){
    let tarefa = document.getElementById("tarefa").value.trim();

    if(tarefa !== ""){
        const div = document.createElement("div");
        div.innerHTML = tarefa
        div.className = "item"
        document.getElementById("lista").appendChild(div)
    }
    else{
        stop
    }
}