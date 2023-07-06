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
 //------------------------------------------ inicio encabezado
 var header = document.querySelector('header'); // Encabezado

 // Función para animar el encabezado
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
 
 // Llamar a la función de animación del encabezado
 animarHeader();
 
 // Animación de las figuras en el encabezado
 window.addEventListener('DOMContentLoaded', () => {
   const navbar = document.querySelector('.encabezado');
   const numShapes = 4; // Número de figuras que deseas colocar
 
   const navbarHeight = navbar.offsetHeight;
   const middlePosition = navbarHeight / 2;
 
   // Generar figuras para la parte superior
   for (let i = 0; i < numShapes; i++) {
     const shape = document.createElement('div');
     shape.classList.add('hex');
     shape.style.left = `${getRandomPosition(navbar.offsetWidth)}px`; /* Restado el ancho de la figura */
 
     // Obtener una posición aleatoria entre 10px arriba y abajo de la mitad de la altura
     const randomPosition = getRandomPosition(41) - 8;
     shape.style.bottom = `${middlePosition + randomPosition}px`;
 
     navbar.appendChild(shape);
   }
 
   // Generar figuras para la parte inferior
   for (let i = 0; i < numShapes; i++) {
     const shape = document.createElement('div');
     shape.classList.add('hex');
     shape.style.left = `${getRandomPosition(navbar.offsetWidth)}px`; /* Restado el ancho de la figura */
     shape.style.top = `${getRandomPosition(navbar.offsetHeight - 110)}px`; /* Restado el alto de la figura */
     navbar.appendChild(shape);}
 });
 
 // Obtener una posición aleatoria
 function getRandomPosition(max) {
   return Math.floor(Math.random() * max);
 }


 //------------fin de encabezado