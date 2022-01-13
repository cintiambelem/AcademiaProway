package models;

public class Categoria extends Base{
    public String descCat;

    @Override
    public String toString() {
        
        return "\nCategoria: " + descCat;
    }
    
}
