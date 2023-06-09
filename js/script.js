var elementos = document.querySelectorAll('.diana1,.maira1,.danna1,.sebas1');
var header = document.querySelector('header');

function animarElementos() {
  var scrollY = window.pageYOffset || document.documentElement.scrollTop;

  elementos.forEach(function(elemento) {
    var rect = elemento.getBoundingClientRect();
    var elementoTop = rect.top + scrollY;

    var isVisible = (
      elementoTop >= scrollY &&
      elementoTop <= (scrollY + window.innerHeight)
    );

    if (isVisible) {
      if (!elemento.classList.contains('animado')) {
        elemento.style.opacity = '0';
        elemento.style.transform = 'translateY(20px)';

        elemento.animate([
          { opacity: '0', transform: 'translateX(-40px)' },
          { opacity: '1', transform: 'translateY(0)' }
        ], {
          duration: 1000,
          easing: 'ease-out',
          fill: 'forwards'
        });

        elemento.classList.add('animado');
      }
    } else {
      elemento.classList.remove('animado');
    }
  });
}
function animarHeader() {
  var rect = header.getBoundingClientRect();
  var isVisible = (
  rect.top >= 0 &&
  rect.left >= 0 &&
  rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
  rect.right <= (window.innerWidth || document.documentElement.clientWidth)
  );
  
  if (isVisible && !header.classList.contains('animado')) {
    header.style.transform = 'translateX(-100%)';  
    header.animate([
        { transform: 'translateY(-100%)' },
        { transform: 'translateX(0)' }
      ], {
    duration: 1000,
    easing: 'ease-out',
    fill: 'forwards'
    });
    header.classList.add('animado');
  }
}
  
window.addEventListener('scroll', animarElementos);
  
// Llamar a la función una vez al cargar la página
animarElementos();
animarHeader();
  