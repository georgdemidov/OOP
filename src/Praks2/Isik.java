package Praks2;

public class Isik {
    String nimi;
    double pikkus;
    String isikukood;
    int mass;

    Isik(String isikuNimi, double isikuPikkus, String idkood, int kaal){
        nimi = isikuNimi;
        pikkus = isikuPikkus;
        isikukood = idkood;
        mass = kaal;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi(){
        return nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus){
        if (pikkus < 0 || pikkus > 4){
            System.out.println("Valed andmed, proovi uuesti");
        }else {
            this.pikkus = pikkus;
        }
    }

    public String getIsikukood() {
        return isikukood;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String toString() {
        return "(" + nimi + "; " + pikkus + "; " + isikukood + "; " + mass + ")";
    }

    public double kehamassiindeks(){
        double KMI = (double)mass/(Math.pow(pikkus, 2));
        return Math.round(KMI);
    }

    public double suusaPikkus(){
        double SP = pikkus + 20.0;
        return SP;
    }

    public String eesnimiPerenimi(String perenimi){
        return ("Tervist, " + nimi + " " + perenimi + "!");
    }

    public static void main(String[] args) {
        Isik mina = new Isik("Georg", 1.83, "38921092939", 93);
        mina.setMass(90);
        mina.setPikkus(1.85);
        mina.setNimi("Carl");
        System.out.println(mina.toString());
        System.out.println(mina.kehamassiindeks());
        System.out.println(mina.suusaPikkus());
        System.out.println(mina.eesnimiPerenimi("Demidov"));
    }
}
