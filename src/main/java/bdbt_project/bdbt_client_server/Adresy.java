package bdbt_project.bdbt_client_server;

public class Adresy {
    private int ID_adresu;
    private String Lokal;
    private String Kod_pocztowy;
    private String Ulica;
    private String Miasto;

    public Adresy(int ID_adresu, String lokal, String kod_pocztowy, String ulica, String miasto) {
        this.ID_adresu = ID_adresu;
        Lokal = lokal;
        Kod_pocztowy = kod_pocztowy;
        Ulica = ulica;
        Miasto = miasto;
    }

    public int getID_adresu() {
        return ID_adresu;
    }

    public void setID_adresu(int ID_adresu) {
        this.ID_adresu = ID_adresu;
    }

    public String getLokal() {
        return Lokal;
    }

    public void setLokal(String lokal) {
        Lokal = lokal;
    }

    public String getKod_pocztowy() {
        return Kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        Kod_pocztowy = kod_pocztowy;
    }

    public String getUlica() {
        return Ulica;
    }

    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String miasto) {
        Miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adresy{" +
                "ID_adresu=" + ID_adresu +
                ", Lokal='" + Lokal + '\'' +
                ", Kod_pocztowy='" + Kod_pocztowy + '\'' +
                ", Ulica='" + Ulica + '\'' +
                ", Miasto='" + Miasto + '\'' +
                '}';
    }
}
