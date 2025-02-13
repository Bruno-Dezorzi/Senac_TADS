// Exibe uma caixa de alerta com a mensagem "Bem Vindo ao ProjectBee"
alert("Bem Vindo ao ProjectBee");

// Inicializa o índice do slide
let slideIndex = 0;


// Função para exibir o slide específico
function showSlide(n) {
    // Obtém todos os elementos com a classe "carousel-item"
    const slides = document.getElementsByClassName("carousel-item");
    // Calcula o índice do slide atual, garantindo que ele esteja dentro do intervalo válido
    slideIndex = (n + slides.length) % slides.length;

    // Oculta todos os slides
    Array.from(slides).forEach(slide => slide.style.display = "none");
    // Exibe o slide atual
    slides[slideIndex].style.display = "block";
}

// Função para mover para o próximo ou anterior slide
function moveSlide(n) {
    // Incrementa o índice do slide e exibe o slide correspondente
    showSlide(slideIndex += n);
}

// Função para avançar automaticamente para o próximo slide
function autoAdvance() {
    // Move para o próximo slide
    moveSlide(1);
}

// Configura um intervalo para avançar automaticamente os slides a cada 3 segundos (3000 milissegundos)
setInterval(autoAdvance, 3000);

// Função para rolar a página para o topo de forma suave
function scrollToTop() {
    window.scrollTo({
        top: 0, // Define a posição de rolagem para o topo da página
        behavior: 'smooth' // Define a rolagem suave
    });
}
