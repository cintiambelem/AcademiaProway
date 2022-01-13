package views;

import models.Endereco;
import models.PessoaFisica;
import models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica();
        PessoaJuridica pj1 =new PessoaJuridica();
        Endereco end1 = new Endereco();

        pf1.nome = "Hugo";
        
        //pf1.enderecoRes.tipoRua = "Rua";
       // pf1.enderecoRes.rua = "Riachuelo";
        pf1.cpf = "555885555";
        pf1.enderecoCom.rua = "Rua batatinha";

                

        System.out.println(pf1);

        
    }
    
}
