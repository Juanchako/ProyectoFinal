//Inicializar una variable que capture los datos del DOM en el html
const loginForm = document.querySelector('#signinForm');

function togglePasswordVisibility(button) {
    const passwordInput = document.querySelector('#password');
    const showPasswordIcon = document.querySelector('#show-password i');

    if (passwordInput.type === 'password') {
        passwordInput.type = 'text';
        showPasswordIcon.classList.remove('bi-eye');
        showPasswordIcon.classList.add('bi-eye-slash');
        button.classList.add('highlighted');
    } else {
        passwordInput.type = 'password';
        showPasswordIcon.classList.remove('bi-eye-slash');
        showPasswordIcon.classList.add('bi-eye');
        button.classList.remove('highlighted');
    }
}


// Inicializaremos un evento que nos envíe la info
loginForm.addEventListener('submit', (e) => {
    e.preventDefault()

    //Inicializaremos una variable que capture los datos del correo en el DOM
    const email = document.querySelector('#email').value;
    const password = document.querySelector('#password').value;

    //La variable constante Users incializa y trae los datos que están en localstotrage

    //JSON.parse nos especifica en donde están almacenados los datos que ingresamos, en este caso (users)

    // || [] significa que en el localsotrage se están almacenando la información en un arreglo.
    const Users = JSON.parse(localStorage.getItem('users')) || []

    //Inicializamos una variable validUser que es para que nos valide la información
    //Función find() nos ayuda a buscar los elementos
    // Nos ayuda a comprobar si los datos que ingreso al loguearme existen.
    const validUser = Users.find(user => user.email === email && user.password === password)

    //Si los datos no concuerdan y son (!) DIFERENTES, entonces que nos muestre un mensaje
    if (!validUser) {
        return alert('Usuario y/o contraseña son incorrectos o no existen.')
    }

    //Si los datos concuerdan, nos muestre un mensaje de bienvenida con el nombre del usuario registrado
    alert(`Bienvenido ${validUser.name}`)

    //localstosrage.setItem para enviar o almacenar los datos
    //'login_sucess' que se logueo correctamente
    // JSON.stringify(validUser) nos convierte los datos de json a string para que sea visible para el usuario que lo solicite.

    localStorage.setItem('login_success', JSON.stringify(validUser))

    //Si el logueo es exitoso, que nos redireccione al home
    window.location.href = '#'
})