/*/_  Crie um sistema para leitura e escrita de dados.
_  Crie uma classe que contenha a estrutura para a leitura de dados através do terminal. Esta leitura deve conter o fluxo de entrada de dados do terminal, um leitor de fluxo e um buffer de leitura. 
_  Crie uma estrutura para escrita em arquivo. A estrutura deve conter um fluxo de saída de dados para arquivo, um forma de escrita no fluxo e um buffer de escrita. Com o buffer, escreva algumas linhas dentro do arquivo texto.
_  Utilize o buffer de leitura como fonte de entrada para o buffer de escrita, ou seja, a entrada será o terminal e a saída o arquivo texto.*/
package ATP39;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class LeituraEscrita {
    public static void main(String[] args) {
        try {
            // leitura

            InputStream fis = new FileInputStream("ATP39/atp39.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            // escrita
            OutputStream fos = new FileOutputStream("ATP39/atp39_2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("testando novamente");
            bw.newLine();
            bw.write("testando novamente2");

           
            while (br.ready()) {
                String conteudo = br.readLine();
                System.out.println(conteudo);
            }
            
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("nao foi possivel localizar o arquivo");
        } catch (IOException e) {
            System.out.println("nao foi possivel acessar o arquivo");
        }
        ;

    }

}
