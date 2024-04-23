function cart(valor) {
    let quantidade = parseInt(document.getElementById('primeiro').value);
    let subtotal = quantidade * valor;
    document.getElementById('segundo').value = subtotal.toFixed(2); // Exibe o subtotal com duas casas decimais
}

// let produtoValor = ${produto.valor}; // Obtém o valor do produto do lado do servidor e passa para o JavaScript

document.addEventListener('DOMContentLoaded', function() {
    let ans = document.getElementById("primeiro");
    ans.addEventListener('input', () => cart(produtoValor));
});