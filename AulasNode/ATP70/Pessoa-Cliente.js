class Pessoa{
    nome;
    idade;
}

class Cliente{
    id;
    nome;
}

const c1 = new Cliente();
c1.id = 1;
c1.nome = "Freddie"

const p1 = new Pessoa();
p1.idade = 29;
p1.nome = "John"


console.log(`Id: ${c1.id}\nNome: ${c1.nome}`);
console.log(`Idade: ${p1.idade}\nNome: ${p1.nome}`);

