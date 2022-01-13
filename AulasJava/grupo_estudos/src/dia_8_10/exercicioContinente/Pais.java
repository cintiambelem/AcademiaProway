/*f) Um método que retorne o país com maior população no continente;
g) Um método que retorne o país com menor população no continente;
h) Um método que retorne o país de maior dimensão territorial no
continente;
i) Um método que retorne o país de menor dimensão territorial no
continente;*/

package dia_8_10.exercicioContinente;

public class Pais extends Continente {
    private String nome_pais;

    public Pais(String nome_pais, String Continente) {
        super("America do sul");       
        this.nome_pais = nome_pais;
    }

}
