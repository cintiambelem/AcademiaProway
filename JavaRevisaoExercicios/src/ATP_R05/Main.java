/*_   Crie uma classe Main com um método principal main.
_   Crie um objeto da classe Carro e utilize os métodos setters para atribuir valores.
_   Crie um objeto da classe Caminhão e utilize os métodos setters para atribuir valores.
_   Utilize os métodos getters para imprimir os valores dos atributos de cada objeto.*/

package src.ATP_R05;

public class Main {
    public static void main(String[] args) {

        Carro car = new Carro();
        Caminhao cam = new Caminhao();

        car.setAnoFab(1988);
        car.setCapacidadePM(300);
        car.setChassi(7777777);
        car.setCor("Preta");
        car.setMarca("Fiat");
        car.setModelo("Uno");
        car.setNumPass(5);
        car.setNumPortas(5);

        cam.setAnoFab(1988);
        cam.setCapacidadeCarga(59999);
        cam.setChassi(77733333);
        cam.setCor("Preta");
        cam.setMarca("Scania");
        cam.setModelo("Batatinha 123");
        cam.setRegistroANTT("66232423");
        cam.setSemirreboque("Sim");
        cam.setTracao("Sim");

        System.out.println("Imprimindo classe carro");

        System.out.println(car.getAnoFab());
        System.out.println(car.getCapacidadePM());
        System.out.println(car.getCor());
        System.out.println(car.getChassi());
        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getNumPass());
        System.out.println(car.getNumPortas());

        System.out.println("Imprimindo classe caminhão");

        System.out.println(cam.getAnoFab());
        System.out.println(cam.getCapacidadeCarga());
        System.out.println(cam.getCor());
        System.out.println(cam.getChassi());
        System.out.println(cam.getMarca());
        System.out.println(cam.getModelo());
        System.out.println(cam.getRegistroANTT());
        System.out.println(cam.getSemirreboque());
        System.out.println(cam.getTracao());

    }

}
