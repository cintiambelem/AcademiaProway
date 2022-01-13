import { Categoria} from "./Categoria.js";
import { Produto} from "./Produto.js";

const cat = new Categoria();
const prod = new Produto();

prod.id = 1;
prod.nome = 'notebook';
console.log(`ID: ${prod.id}\nNome do produto: ${prod.nome}`);

cat.id = 1;
cat.nome = 'eletronicos';
console.log(`ID: ${cat.id}\nNome do produto: ${cat.nome}`);
