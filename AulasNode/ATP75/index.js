import Cliente from './model/Cliente.js';
import ClienteRepository from './repository/ClienteRepository.js';

const c1 = new Cliente();
const repository = new ClienteRepository();

//create
// c1.nome = "Cintia";
// c1.sobrenome = "Belem";
// c1.idade = 29;
// repository.create(c1);

//read
// const lista = repository.findAll;
// console.log(lista);

c1.id = 3;
c1.nome = 'nome novo';
c1.sobrenome = 'sobrenome novo';
repository.update(c1);


// const lista = repository.findAll;
// console.log(lista);









