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

public class escrita {
    public static void main(String[] args) {

        try {

            // leitura
            InputStream fis = new FileInputStream("dados/dados1.txt"); // funcao que apenas le o arquivo.
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            // escrita
            OutputStream fos = new FileOutputStream("dados/dados2.txt"); // funcao para leitura, caso nao encontre,ela cria o arquivo

            // OutputStreamWriter osw = new OutputStreamWriter(fos);

            // abstraindo a funcao output stream writer
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            while (br.ready()) {
                String conteudo = br.readLine();
                System.out.println(conteudo);
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("arquivo nao encontrado");
        } catch (IOException e) {
            System.out.println("nao foi possível abrir o arquivo");
        }
    }

}
