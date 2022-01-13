package modulo1.aula13_array;

public class ArrayStrings2 {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        nomes[0] = "Cintia";
        nomes[1] = "Vanessa";
        nomes[2] = "Niara";
        nomes[3] = "Tais";
        nomes[4] = "May";

        // percorrendo a array atraves de um foreach

        for (String n : nomes) {
            System.out.println(n);
        }
    }

}
