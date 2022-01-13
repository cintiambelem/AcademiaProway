package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Models.Empresa;

/**
 * View
 */
public class View {

    public static void main(String[] args) {
        Empresa emp1 = new Empresa();

        emp1.atividade = "educacao";
        emp1.cnpj = "1111111";
        emp1.nome = "maykon way";

        try {
            FileWriter fw = new FileWriter("dados.csv", true);
            String registro = String.format("%s; %s; %s\n", emp1.atividade, emp1.cnpj, emp1.nome);
            fw.write(registro);
            fw.close();
        } catch (IOException e) {
            
            System.out.println("nao foi possivel abrir o arquivo");
        }

        try {
            Scanner sc = new Scanner(new File("dados.csv"));
            while (sc.hasNextLine()) {
                String conteudo = sc.nextLine();
                String [] empresaString = conteudo.split(";");
                Empresa emp2 = new Empresa();
                emp2.nome = empresaString[0];
                emp2.atividade = empresaString[1];

                System.out.printf("%s - %s\n", emp2.nome, emp2.atividade);
                
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        


    }
}