package modulo1.aula13_array;

public class ArrayStrings {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Cintia";
        nomes[1] = "Vanessa";
        nomes[2] = "Niara";
        nomes[3] = "Tais";
        nomes[4] = "May";

        // percorrendo um array atraves de um laço for

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }

}