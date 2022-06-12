package bdbt_project.bdbt_client_server;

public class Uslugi {
    private int Id;
    private String Nazwa;
    private String Typ;
    private String Rodzaj;
    private float Netto;
    private String Operator;

    public Uslugi(){}

    public Uslugi(int id, String nazwa, String typ, String rodzaj, float netto, String operator) {
        Id = id;
        Nazwa = nazwa;
        Typ = typ;
        Rodzaj = rodzaj;
        Netto = netto;
        Operator = operator;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public float getNetto() {
        return Netto;
    }

    public void setNetto(float netto) {
        Netto = netto;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    @Override
    public String toString() {
        return "Uslugi{" +
                "Id=" + Id +
                ", Nazwa='" + Nazwa + '\'' +
                ", Typ='" + Typ + '\'' +
                ", Rodzaj='" + Rodzaj + '\'' +
                ", Netto=" + Netto +
                ", Operator='" + Operator + '\'' +
                '}';
    }
}
