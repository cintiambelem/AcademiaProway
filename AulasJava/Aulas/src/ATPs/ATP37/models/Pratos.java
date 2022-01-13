package models;

public class Pratos extends BaseId {
    public String nomePrato;

  

   @Override
   public String toString() {
      
       return super.toString() + "\nnome do prato: "+nomePrato;
   }

    
    
}
