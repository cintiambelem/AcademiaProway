package modulo1.aula16.ATP22_2;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, 25009);

        System.out.println(cc);

        cc.saque(100);
        System.out.println(cc);
        cc.deposito(200);

        System.out.println(cc);
     

        





    }
}
