package src.ATP_R07;



public class Localizacao {
    private int latitude;
    private int longitude;

    public Localizacao(int latitude, int longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLongitude() {
        return this.longitude;
    }

    @Override
    public String toString() {
        // dúvida: quando eu uso o super no toString?

        String localizacao = "latitude: " + this.getLatitude() + "\nlongitude: " + this.getLongitude();
        return localizacao;

    }
}
