
public class Main {
    public static void main(String[] args) {

        Computador comp1 = new Computador();
        Notebook note1 = new Notebook();
        Desktop desk1 = new Desktop();

        note1.bateria = "22000MhA";
        note1.hd = 256;
        note1.memoria = 16;
        note1.processador = "i7";
        note1.marca = "Dell";
        note1.versBluetooth = "LTC 2.0";
        note1.wifi = "822.g";

        desk1.fonte = 300;
        desk1.memoria = 16;
        desk1.hd = 512;
        desk1.marca = "Lenovo";
        desk1.monitor = 17;
        desk1.processador = "i5";
        desk1.gabinete = "ATX";

        comp1.hd = 128;
        comp1.marca = "HP";
        comp1.memoria = 8;
        comp1.processador = "Rayzen";

        Object obj_comp = comp1;
        Object obj_note = note1;
        Object obj_desk = desk1;

        Computador comp2 = (Computador) obj_comp;
        Notebook note2 = (Notebook) obj_note;
        Desktop desk2 = (Desktop) obj_desk;

        System.out.println("Imprimindo o objeto obj_comp: ");
        System.out.println(comp2);

        System.out.println("Imprimindo o objeto obj_note: ");
        System.out.println(note2);

        System.out.println("Imprimindo o objeto desk: ");
        System.out.println(desk2);

    }
}
