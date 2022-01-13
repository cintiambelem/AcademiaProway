package modulo1.aula12.atp18;

public class TelaPrincipalBanco {
    public static void main(String[] args) {
        Conta_Corrente cc = new Conta_Corrente();

        cc.setAgencia(2507);
        System.out.println(cc.getAgencia());

        cc.setCodCliente(6974);
        System.out.println(cc.getCodCliente());

        cc.setNumeroCC(6597);
        System.out.println(cc.getNumeroCC());

        cc.setSaldo(6580.98);
        System.out.println(cc.getSaldo());

    }

}
