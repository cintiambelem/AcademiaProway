package views;

import controllers.PratosController;
import models.Pratos;

public class Main {
    public static void main(String[] args) {
        PratosController pratoControl = new PratosController();
        Pratos prato1 = new Pratos();

        prato1.setId(001);
        prato1.nomePrato = "almondega";
        System.out.println(prato1);

        pratoControl.delete(prato1);

        

    }

    public static Pratos cadastrar() {
        Pratos novoPrato = new Pratos();
        return novoPrato;
        
    }

    public static void listar(PratosController pratoControl) {
        for (Pratos p : pratoControl.read()) {
            System.out.println(p);
            
        }
        
        
    }

    
}
