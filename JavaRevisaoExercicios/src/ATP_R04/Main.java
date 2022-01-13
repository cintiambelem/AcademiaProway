//  Crie dois objetos da classe Usuário e execute os métodos settter para definir valores diferentes à cada objeto.
// Imprima os dados dos dois objetos ao final da execução utilizando os métodos getters.*/

package src.ATP_R04;

import javax.annotation.processing.SupportedSourceVersion;

public class Main {
    public static void main(String[] args) {
       Usuario us1 = new Usuario();
       Usuario us2 = new Usuario();

       us1.setCodigo(123);
       us1.setEmail("usuario1@gmail.com");
       us1.setNomeCompleto("Silvio Santos");
       us1.setSenha(1024);

       us2.setCodigo(555);
       us2.setEmail("usuario2@gmail.com");
       us2.setNomeCompleto("Gugu Liberato");
       us2.setSenha(5555);

       System.out.println("Imprimindo objeto us1: ");

       System.out.println(us1.getCodigo());
       System.out.println(us1.getEmail());
       System.out.println(us1.getNomeCompleto());

       System.out.println("\nImprimindo objeto us2: ");
       
       System.out.println(us2.getCodigo());
       System.out.println(us2.getEmail());
       System.out.println(us2.getNomeCompleto());



    }
    
}
