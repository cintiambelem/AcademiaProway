var idades = [];

window.onload = function () {
    console.log('carregando js...');
}

function salvar(event) {
    event.preventDefault();
    let nome = document.getElementById('nome');
    let sobrenome = document.getElementById('sobrenome');
    let idade = document.getElementById('idade');
    console.log(nome.value, sobrenome.value, idade.value);

    idades.push(idade.value);
    console.log(idades);

}