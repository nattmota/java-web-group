let form = document.getElementById('form');
let username = document.getElementById('usuario');
let senha = document.getElementById('senha');
let email = document.getElementById('email');
let cpf = document.getElementById('cpf');
let telefone = document.getElementById('telefone');

form.addEventListener('submit', e => {
    e.preventDefault();

    validateInputs();
});

const setError = (element, message) => {
    const inputBox = element.parentElement;
    const errorDisplay = inputBox.querySelector('.error');

    errorDisplay.innerText = message;
    inputBox.classList.add('error');
    inputBox.classList.remove('success'); // Corrigido: remover 'success'
};

const setSuccess = element => {
    const inputBox = element.parentElement;
    const errorDisplay = inputBox.querySelector('.error');

    errorDisplay.innerText = '';
    inputBox.classList.add('success');
    inputBox.classList.remove('error'); // Corrigido: remover 'error'
};

const validateInputs = () => {
    let usernameValue = username.value.trim();
    let senhaValue = senha.value.trim();
    let emailValue = email.value.trim();
    let cpfValue = cpf.value.trim();
    let telefoneValue = telefone.value.trim(); // Corrigido: acessar 'value'

    if (usernameValue === '') {
        setError(username, 'Nome de usuário necessário');
    } else {
        setSuccess(username);
    }

    if (senhaValue === '') {
        setError(senha, 'Senha é necessária');
    } else if (senhaValue.length < 8) { // Corrigido: 'length' em vez de 'lenght'
        setError(senha, 'Senha é necessário ter pelo menos 8 dígitos');
    } else {
        setSuccess(senha);
    }

    if (emailValue === '') {
        setError(email, 'Email é necessário');
    } else {
        setSuccess(email);
    }

    if (cpfValue === '') {
        setError(cpf, 'Cpf é necessário');
    } else if (cpfValue.length < 11) {
        setError(cpf, 'CPF inválido');
    } else {
        setSuccess(cpf);
    }

    if (telefoneValue === '') {
        setError(telefone, 'Telefone é necessário');
    } else if (telefoneValue.length < 11) {
        setError(telefone, 'Telefone inválido');
    } else {
        setSuccess(telefone);
    }
};


