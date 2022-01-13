package p3.view;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Escrita{
    public static void main(String[] args) {
       PrintStream ps;
       try {
           ps = new PrintStream("p3/dados/dados.txt");
            ps.println("teste1");
            ps.println("teste2");
            ps.println("teste3");
            ps.close();
        } catch (FileNotFoundException e) {
           System.out.println("arquivo nao encontrado");
       } 
    }
}