package ATP24;

public class Main {
    public static void main(String[] args) {

        Veiculo veic1 = new Veiculo();
        Carro car1 = new Carro();

        veic1.marca = "Fiat";
        veic1.modelo = "Uno";
        veic1.placa = "LID4799";

        car1.numPortas = 4;
        car1.portaMalas = "100 litros";

        // criando objeto da calsse object
        Object obj1 = veic1;
        Object obj2 = car1;

        // convertendo os objetos em itens das classes veiculo e carro
        Veiculo obj_veic = (Veiculo) obj1;
        Carro obj_carro = (Carro) obj2;

        // imprimindo os objs convertidos
        /*System.out.println(obj_veic.marca);
        System.out.println(obj_veic.modelo);
        System.out.println(obj_veic.placa);*/

        // System.out.println(obj_carro.numPortas);
        // System.out.println(obj_carro.portaMalas);

        System.out.println(obj_veic);
        System.out.println(obj_carro);

    }

}
