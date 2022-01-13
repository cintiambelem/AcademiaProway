package ATP27.views;

import java.util.ArrayList;

import ATP27.controllers.BaseController;
import ATP27.controllers.FilmeController;
import ATP27.controllers.SerieController;
import ATP27.models.Filme;
import ATP27.models.Serie;

public class Main {
    public static void main(String[] args) {

        FilmeController fcontroller = new FilmeController();
        SerieController scontroller = new SerieController();

        Filme f1 = new Filme();
        f1.ano = 1996;  
        f1.id = 001;
        f1.titulo = "Central do Brasil";
        fcontroller.create(f1);

        Filme f2 = new Filme();
        f1.ano = 1996;
        f1.id = 001;
        f1.titulo = "Central do Brasil";
        fcontroller.create(f2);

        Serie s1 = new Serie();
        s1.ano = 2020;
        s1.id = 005;
        s1.titulo = "Sweet tooth";
        scontroller.create(s1);

        Serie s3 = new Serie();
        s3.ano = 2028;
        s3.id = 006;
        s3.titulo = "Titanic";
        scontroller.create(s3);

        // System.out.println(scontroler.contains(s1));

        System.out.println(s1);

        Serie s2 = new Serie();
        s2.ano = 2021;
        s2.id = 005;
        s2.titulo = "Feshow da Cintia";

        scontroller.update(s2);

        // System.out.println(s2);
        listar(scontroller);

        

    }

    static public void listar(Object obj) {
        if (obj instanceof FilmeController) {
            FilmeController f1 = (FilmeController) obj;
            for (Filme filme : f1.read()) {
                System.out.println(filme);
            }
        } else if (obj instanceof SerieController) {
            SerieController s1 = (SerieController) obj;
            for (Serie serie : s1.read()) {
                System.out.println(serie);
            }
        }

    }

}
