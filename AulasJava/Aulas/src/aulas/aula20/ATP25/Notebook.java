
public class Notebook extends Computador {

    String bateria, wifi, versBluetooth;

    @Override
    public String toString() {

        return super.toString() + "\n" + bateria + "\n" + wifi + "\n" + versBluetooth + "\n";
    }

}
