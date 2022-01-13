package src.ATP_R07;

public class Main {
    public static void main(String[] args) {

        Localizacao local = new Localizacao(50, 90);
        Localizacao rj = new Localizacao(768, 943);

        System.out.println("Imprimindo localização do construtor: ");
        System.out.println(local);

        System.out.println("imprimindo localizacao com variável: ");

        int lat = local.getLatitude();
        int longi = local.getLongitude();
        System.out.printf("latitude: %d  - latitude: %d\n", lat, longi);

        // setando novas localizações

        local.setLatitude(34);
        local.setLongitude(76);

        System.out.println("Imprimindo localizaçao do set: ");

        System.out.println(local);

        System.out.println("Imprimindo rio de janeiro: ");
        System.out.println(rj);

    }
}
