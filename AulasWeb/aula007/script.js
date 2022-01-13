function alertainicio(){
    alert ("ola mundo");
}

// window.onload = function () {
//     alertainicio();
// }

// salvando o input do telcado numa variavel
function salvar(){
    console.log('Funcao funcionando');
    let input_nome = document.getElementById('nome'); 
    console.log(input_nome.value);
    let div = document.getElementById('nome-preenchido');
    div.innerHTML = input_nome.value;
    input_nome.value="";
    // função que insere informações na área escolhida do html
}