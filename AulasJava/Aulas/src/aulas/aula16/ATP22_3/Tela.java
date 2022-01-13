package modulo1.aula16.ATP22_3;

public class Tela {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        /*double a = calc.soma(10, 20);
        double b = calc.soma(0.35, 1.5);
        double c = calc.soma(0.9f, 5.8f, 6.5f);
        calc.soma(50000, 58790, 3548);*/

        System.out.printf("soma inteiros: %d \n", calc.soma(10, 20));
        System.out.printf("soma double: %.2f\n", calc.soma(0.35, 1.5));
        System.out.printf("soma float: %.2f\n", calc.soma(0.9f, 5.8f, 6.5f));
        System.out.printf("soma long: %d\n", calc.soma(50000, 58790, 3548));


        


    }
    
}
