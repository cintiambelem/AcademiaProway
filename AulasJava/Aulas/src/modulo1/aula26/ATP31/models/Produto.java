package models;

public class Produto extends Base{
    public String descProd;
    public Categoria categoria;
    //construtor de produto para criar categoria do produto
    
    public Produto(){
        categoria = new Categoria();

    }

    @Override
    public String toString() {
        return "\nID: " + this.id + "\nDescrição do produto: " + descProd + this.categoria.toString();
       
        
    }
    
}
