//_  Crie uma classe abstrata Veículo com os atributos privados: Marca, Modelo, ano de fabricação, cor e número de chassi.
package src.ATP_R05;

import java.sql.Date;

public class Veiculo {

    private String marca, modelo, cor;
    private int anoFab;
    private int chassi;

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getAnoFab() {
        return this.anoFab;
    }

    public int getChassi() {
        return this.chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

}
