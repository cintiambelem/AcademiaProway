package src.ATP_R06;

public class Main {
    public static void main(String[] args) {
        Linguagem ling1 = new Linguagem();
        Linguagem ling2 = new Linguagem();
        Linguagem ling3 = new Linguagem();

        ling1.setDataCriacao("01-01-1988");
        ling1.setNome("Desk");
        ling1.setOrientacaoObjeto("POO");
        ling1.setTipagem("Tipagem");

        System.out.println(ling1);

    }

}
