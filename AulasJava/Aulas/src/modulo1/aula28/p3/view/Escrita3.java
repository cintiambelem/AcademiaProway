package p3.view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Escrita3 {
    public static void main(String[] args) {
        FileWriter fw = null; // funcao espeficica par aescrever dentro do arquivo de texto, e com opcoes de tratar erros
        try {
            fw = new FileWriter("p3/dados/dados.txt", true);
            fw.write("teste5\n");
            fw.write("teste6\n");
            fw.write("teste7\n");
            fw.write("teste8\n");
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("nao foi possivel escrever no arquivo");
        } 
    }
}