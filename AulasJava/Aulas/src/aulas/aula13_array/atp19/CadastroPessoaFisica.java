package modulo1.aula13_array.atp19;

import modulo1.aula11.ATP15.Pessoa;

public class CadastroPessoaFisica {
    public static void main(String[] args) {

        PessoaFisica[] pessoas = new PessoaFisica[5];

        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Cintia");
        pessoa1.setSobrenome("Belem");
        pessoa1.setCodigo(123);
        pessoa1.setRg(22597641);
        pessoa1.setCpf("598762678");
        pessoa1.setIdade(29);

        PessoaFisica pessoa2 = new PessoaFisica();
        pessoa2.setNome("Cecilia");
        pessoa2.setSobrenome("Belem");
        pessoa2.setCodigo(874);
        pessoa2.setRg(5697461);
        pessoa2.setCpf("2553215892");
        pessoa2.setIdade(35);

        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setNome("Paula");
        pessoa3.setSobrenome("Belem");
        pessoa3.setCodigo(986);
        pessoa3.setRg(66577841);
        pessoa3.setCpf("505369712");
        pessoa3.setIdade(33);

        PessoaFisica pessoa4 = new PessoaFisica();
        pessoa4.setNome("Celia");
        pessoa4.setSobrenome("Belem");
        pessoa4.setCodigo(983);
        pessoa4.setRg(55478562);
        pessoa4.setCpf("05336597423");
        pessoa4.setIdade(37);

        PessoaFisica pessoa5 = new PessoaFisica();
        pessoa5.setNome("José");
        pessoa5.setSobrenome("Souza");
        pessoa5.setCodigo(756);
        pessoa5.setRg(648742);
        pessoa5.setCpf("048746582");
        pessoa5.setIdade(87);

        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;
        pessoas[2] = pessoa3;
        pessoas[3] = pessoa4;
        pessoas[4] = pessoa5;

        for (PessoaFisica PF : pessoas) {
            System.out.printf("Nome: %s \nSobrenome: %s\nCodigo: %d\nRG: %d\nCPF: %s\nIdade: %d \n=====\n", PF.getNome(), PF.getSobrenome(), PF.getCodigo(), PF.getRg(), PF.getCpf(), PF.getIdade());
        }

    }
}
