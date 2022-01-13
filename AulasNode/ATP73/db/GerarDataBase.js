import Database from "./Database.js";
//import ClienteTable from "./ClienteTable.js";


Database
    .sync()
    .then( ()=> console.log('Sincronizado o Database'))
    .catch( ()=> console.log('Deu erro'));