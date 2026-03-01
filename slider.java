const slides = document.querySelectorAll(".hero-slider .slide");
let index = 0;

function showSlide(n){
    slides.forEach(slide => slide.classList.remove("active"));
    slides[n].classList.add("active");
}

function nextSlide(){
    index = (index + 1) % slides.length;
    showSlide(index);
}

showSlide(0);
setInterval(nextSlide, 5000);