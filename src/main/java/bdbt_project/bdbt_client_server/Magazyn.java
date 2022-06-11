package bdbt_project.bdbt_client_server;



public class Magazyn {
    private int id;
    private float wielkosc;
    private String nr_tel;
    private String operator;
    private String adres;

    public Magazyn(){

    }

    public Magazyn(int id, float wielkosc, String nr_tel, String operator, String adres) {
        this.id = id;
        this.wielkosc = wielkosc;
        this.nr_tel = nr_tel;
        this.operator = operator;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(float wielkosc) {
        this.wielkosc = wielkosc;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }




    @Override
    public String toString() {
        return "Magazyn{" +
                "id=" + id +
                ", wielkosc=" + wielkosc +
                ", nr_tel='" + nr_tel + '\'' +
                ", operator='" + operator + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
