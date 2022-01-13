
public class Desktop extends Computador {
    String gabinete;
    int fonte, monitor;

    @Override
    public String toString() {

        return super.toString() + "\n" + gabinete + "\n" + fonte + "\n" + monitor + "\n";

    }
}
