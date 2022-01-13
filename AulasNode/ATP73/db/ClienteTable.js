import { Sequelize } from "sequelize";
import Database from "./Database.js";

const ClienteTable = Database.define('tabelaCliente',{
    id:{
        type: Sequelize.INTEGER,
        allowNull: false,
        autoIncrement: true,
        primaryKey: true
    },
    nome:{
        type:  Sequelize.STRING,
        allowNull: false
    },
    sobrenome:{
        type:  Sequelize.STRING,
        allowNull: false
    },
    idade:{
        type: Sequelize.INTEGER,
        allowNull: false
    }
});
export default ClienteTable;