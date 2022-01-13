package p3.view;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Escrita2{
    public static void main(String[] args) {
       PrintWriter ps = null; //funcao espeficica par aescrever dentro do arquivo
       try {
            ps = new PrintWriter("p3/dados/dados.txt");
            ps.println("teste1");
            ps.println("teste2");
            ps.println("teste3");
            ps.println("teste4");
            ps.close();
        } catch (FileNotFoundException e) {
           System.out.println("arquivo nao encontrado");
       } finally{
           ps.close();
       }
    }
}