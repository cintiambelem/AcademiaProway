/*Crie um sistema java para cadastro de pratos.
_  O projeto deve utilizar MVC.
_  Utilize uma classe abstrata base model para manter o id.
_  Utilize uma classe abstrata base repository para realizar as operações de crud .
_  Na View, teste todos os metodos do Crud com dados fixos, sem a necessidade de menu ou leitura e escrita pelo terminal.*/
package models;

public abstract class BaseId {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseId) {
            BaseId b = (BaseId) obj;
            if (this.id == b.id) {
                return true;
            }
        } return false;
    }

    @Override
    public String toString() {
        
        return "id: " + getId();
    }


    
} 