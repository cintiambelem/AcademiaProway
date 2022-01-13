package ATP27.models;

public class Filme {
    public int id;
    public String titulo;
    public int ano;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Filme) {
            Filme f1 = (Filme) obj;
            if (this.id == f1.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        return "Imprimindo filme\nID: " + id + "\nTitulo: " + titulo + "\nAno: " + ano + "\n";
    }

}
