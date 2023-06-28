// Inicializar una variable que reciba datos del DOM
const signupForm = document.querySelector('#signupForm');
const checkbox = document.querySelector('#exampleCheck1');
const submitButton = document.querySelector('.btn-primary');
const passwordField = document.querySelector('#password');
const confirmPasswordField = document.querySelector('#confirm-password');
const showPasswordButton = document.querySelector('#show-password');
const showConfirmPasswordButton = document.querySelector('#show-confirm-password');


// Deshabilitar el botón de registro inicialmente
submitButton.disabled = true;

// Agregar un evento al checkbox para habilitar/deshabilitar el botón de registro
checkbox.addEventListener('change', () => {
  submitButton.disabled = !checkbox.checked;
  if (checkbox.checked) {
    checkbox.classList.remove('highlight');
  } else {
    checkbox.classList.add('highlight');
  }
});

// Función para mostrar/ocultar la contraseña
const togglePasswordVisibility = (passwordField, eyeIcon) => {
  const fieldType = passwordField.getAttribute('type');
  passwordField.setAttribute('type', fieldType === 'password' ? 'text' : 'password');
  eyeIcon.classList.toggle('bi-eye', fieldType === 'password');
  eyeIcon.classList.toggle('bi-eye-slash', fieldType === 'text');
  eyeIcon.classList.toggle('show-password');
};

// Asociar eventos a los íconos para mostrar/ocultar la contraseña
showPasswordButton.addEventListener('click', () => {
  togglePasswordVisibility(passwordField, showPasswordButton.querySelector('i'));
});

showConfirmPasswordButton.addEventListener('click', () => {
  togglePasswordVisibility(confirmPasswordField, showConfirmPasswordButton.querySelector('i'));
});

showConfirmPasswordButton.addEventListener('click', () => {
    showConfirmPasswordButton.classList.toggle('clicked');
  });

  showPasswordButton.addEventListener('click', () => {
    showPasswordButton.classList.toggle('clicked');
  });
// Inicializaremos un evento para que nos envíe los datos con el botón
signupForm.addEventListener('submit', (e) => {
  e.preventDefault();

  // Verificar si el checkbox está marcado
  if (!checkbox.checked) {
    checkbox.classList.add('highlight');
    return;
  }

  // Referenciar los datos
  const name = document.querySelector('#full-name').value;
  const phone = document.querySelector('#phone').value;
  const email = document.querySelector('#email').value;
  const password = passwordField.value;
  const confpass = confirmPasswordField.value;

  // Trae los datos almacenados del arreglo que se nombra (users)
  // Nos convierte los datos en JSON en el localstorage
  const Users = JSON.parse(localStorage.getItem('users')) || [];

  // La función find() nos ayuda a buscar los datos almacenados
  // Nos comprueba si el correo que se ingresa es igual al que está guardado en el localstorage
  const isUserRegistered = Users.find((user) => user.email === email);

  // Realizaremos una comprobación
  if (isUserRegistered) {
    return alert('El usuario ya está registrado, intentalo con otro correo');
  }

  // Verificar si las contraseñas coinciden
  if (password !== confpass) {
    return alert('Las contraseñas no coinciden');
  }

  // Agregaremos los datos al objeto
  Users.push({ name: name, phone: phone, email: email, password: password });
  localStorage.setItem('users', JSON.stringify(Users));

  // Reiniciar el formulario y deshabilitar el botón de registro
  submitButton.disabled = true;

  alert('Registro Exitoso');
  window.location.href = 'registro.html'
});