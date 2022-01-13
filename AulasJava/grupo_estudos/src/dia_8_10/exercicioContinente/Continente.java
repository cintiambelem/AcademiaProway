/*Escreva em Java uma classe Continente. Um continente possui um nome
e é composto por um conjunto de países. Forneça os membros de
classe a seguir:
a) Construtor que inicialize o nome do continente;
b) Um método que permita adicionar países aos continentes;
c) Um método que retorne a dimensão total do continente;
d) Um método que retorne a população total do continente;
e) Um método que retorne a densidade populacional do continente;

f) Um método que retorne o país com maior população no continente;
g) Um método que retorne o país com menor população no continente;
h) Um método que retorne o país de maior dimensão territorial no
continente;
i) Um método que retorne o país de menor dimensão territorial no
continente;
j) Um método que retorne a razão territorial do maior pais em
relação ao menor país.*/

package dia_8_10.exercicioContinente;

import java.util.Set;

public class Continente {

    private String nome_continente;
    private String nome_pais;
    private int dimensao_cont;
    private int populacao_total;

    public Continente(String nome_continente) {
        this.nome_continente = nome_continente;
    }

    public void addPais(String nome_pais) {
        this.nome_pais = nome_pais;
    }

    /*public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;

    }*/

    public String getNome_pais() {
        return this.nome_pais;
    }

    public int dimensaoCont(int dimensao_cont) {
        return this.dimensao_cont = dimensao_cont;
    }

    public int populacaoTotal(int populacao_total) {
        return this.populacao_total = populacao_total;
    }

}
