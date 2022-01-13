package ATP27.models;

import ATP27.models.Serie;

public class Serie {

    public int id;
    public String titulo;
    public int ano;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Serie) {
            Serie s1 = (Serie) obj;
            if (this.id == s1.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        return "Imprimindo série\nID: " + id + "\nTitulo: " + titulo + "\nAno: " + ano;
    }

}
