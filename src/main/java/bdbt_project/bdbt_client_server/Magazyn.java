package bdbt_project.bdbt_client_server;


public class Magazyn {
    private int ID_magazynu;
    private float wielkosc;
    private String nr_tel;
    private String Operator;
    private String Miasto;

    public Magazyn(){

    }

    public Magazyn(int id, float wielkosc, String nr_tel, String operator, String Miasto) {
        this.ID_magazynu = id;
        this.wielkosc = wielkosc;
        this.nr_tel = nr_tel;
        this.Operator = operator;
        this.Miasto = Miasto;
    }

    public int getID_magazynu() {
        return ID_magazynu;
    }

    public void setID_magazynu(int ID_magazynu) {
        this.ID_magazynu = ID_magazynu;
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
        return Operator;
    }

    public void setOperator(String operator) {
        this.Operator = operator;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String miasto) {
        this.Miasto = miasto;
    }




    @Override
    public String toString() {
        return "Magazyn{" +
                "id=" + ID_magazynu +
                ", wielkosc=" + wielkosc +
                ", nr_tel='" + nr_tel + '\'' +
                ", operator='" + Operator + '\'' +
                ", adres='" + Miasto + '\'' +
                '}';
    }
}
