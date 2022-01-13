import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;


public class leitura {
    public static void main(String[] args) {
        
        try {

            FileInputStream fis = new FileInputStream("dados/dados1.txt"); //funcao que apenas le o arquivo.
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while (br.ready()) {
                String conteudo = br.readLine();
                System.out.println(conteudo);
            }
            br.close();
    
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não encontrado");  
        }catch(IOException e){
            System.out.println("nao foi possível abrir o arquivo");
        }
    }    
}