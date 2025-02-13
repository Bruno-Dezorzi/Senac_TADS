function ex1() {
    var text = document.getElementById("meuDiv");

    if (text.textContent.trim() === "Ola mundo!") {
        text.innerHTML = "<h1>Ola, JAVASCRIPT!</h1>";
    } else {
        text.innerHTML = "<h1>Ola mundo!</h1>";
    }
}

function ex2(){
    var text = document.getElementById("meuDiv");
    if (text.style.backgroundColor === 'white'){
        text.style.backgroundColor = 'purple';
    } else {
        text.style.backgroundColor = 'white';
    }
}

function ex3(){
    var paragrafo = document.createElement('p');
    paragrafo.textContent = "Novo Paragráfo";
    paragrafo.id = 'paragrafo';
    document.body.appendChild(paragrafo);
    paragrafo.style.backgroundColor = 'red';
}

function ex4(){
    var paragrafo = document.getElementById("paragrafo");
    document.body.removeChild(paragrafo);
}

function ex5(){
    var ul = document.getElementById('ula');
    var frutas = document.getElementsByTagName('li');

    if(frutas[1].textContent.trim() === 'MAÇA') {
        frutas[1].textContent = 'MANGA';
    } else {
        frutas[1].textContent = 'MAÇA';
    }
}

function ex6(){
    var box = document.querySelectorAll(".box");

    if (box.length > 0){
        if (box[0].style.backgroundColor === 'white') {
            box[0].style.backgroundColor = 'red';
        } else {
            box[0].style.backgroundColor = 'white';
        }
    }

    if (box.length > 1){
        if (box[1].style.backgroundColor === 'white') {
            box[1].style.backgroundColor = 'green';
        } else {
            box[1].style.backgroundColor = 'white';
        }
    }
}

function ex7(){
    var contentDiv = document.querySelector("#content");

    contentDiv.innerHTML = "<p>Este é um parágrafo inserido usando innerHTML</p>";
}

function ex8() {
    var text = document.getElementById('text8').value; 
    var list = document.createElement('li');
    list.className = 'li8';
    list.textContent = text; 

    var formulario = document.getElementById('formulario'); 
    formulario.appendChild(list);
}

function ex8_1() {
    var listItems = document.querySelectorAll('.li8'); 

    listItems.forEach(function(item) {
        item.parentNode.removeChild(item); 
    });
}

function ex9() {
    var num = document.getElementById('num').value;

    var container9 = document.getElementById('container9');

    for (var i = 1; i <= num; i++) {
        var newdiv = document.createElement('div'); 
        newdiv.textContent = 'Filho ' + i; 
        newdiv.className = 'filho';
        container9.appendChild(newdiv); 
    }
}

function ex9_1() {
    var listItems = document.querySelectorAll('.filho'); 

    listItems.forEach(function(item) {
        item.parentNode.removeChild(item); 
    });
}

function ex10() {
    var img = document.getElementById("img");
    var img1 = "download1.jpg";
    var img2 = "download2.jpg"; 

 
    if (img.src.endsWith(img1)) {
        img.src = img2;
    } else {
        img.src = img1;
    }
}
