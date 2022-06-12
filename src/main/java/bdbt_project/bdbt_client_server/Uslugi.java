package bdbt_project.bdbt_client_server;

public class Uslugi {
    private int ID_uslugi;
    private String Nazwa;
    private String Typ;
    private String Rodzaj;
    private float Cena_netto;
    private String NazwaOp;

    public Uslugi(){}

    public Uslugi(int idUslugi, String nazwa, String typ, String rodzaj, float cenanetto, String operator) {
        ID_uslugi = idUslugi;
        Nazwa = nazwa;
        Typ = typ;
        Rodzaj = rodzaj;
        Cena_netto = cenanetto;
        NazwaOp = operator;
    }

    public int getID_uslugi() {
        return ID_uslugi;
    }

    public void setID_uslugi(int ID_uslugi) {
        this.ID_uslugi = ID_uslugi;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getTyp() {
        return Typ;
    }

    public void setTyp(String typ) {
        Typ = typ;
    }

    public String getRodzaj() {
        return Rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        Rodzaj = rodzaj;
    }

    public float getCena_netto() {
        return Cena_netto;
    }

    public void setCena_netto(float cena_netto) {
        Cena_netto = cena_netto;
    }

    public String getOperator() {
        return NazwaOp;
    }

    public void setOperator(String operator) {
        NazwaOp = operator;
    }

    @Override
    public String toString() {
        return "Uslugi{" +
                "Id=" + ID_uslugi +
                ", Nazwa='" + NazwaOp + '\'' +
                ", Typ='" + Typ + '\'' +
                ", Rodzaj='" + Rodzaj + '\'' +
                ", Netto=" + Cena_netto +
                ", Operator='" + NazwaOp + '\'' +
                '}';
    }
}
