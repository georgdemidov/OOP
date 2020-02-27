package Praks3;

public class Seade {
    private int kood;
    private String nimetus;
    private double hindKMita;
    static double KMprotsent = 20.00;

    Seade(int kood, String nimi, double hind) {
        this.kood = kood;
        this.nimetus = nimi;
        this.hindKMita = hind;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHindKMita() {
        return hindKMita;
    }

    public void setHindKMita(double hindKMita) {
        this.hindKMita = hindKMita;
    }

    public static double getKMprotsent() {
        return KMprotsent;
    }

    public static void setKMprotsent(double KMprotsent) {
        Seade.KMprotsent = KMprotsent;
    }

    static double kmhind(double hindKMita){
        return hindKMita + KMprotsent * hindKMita / 100;
    }

    public String toString() {
        return "Antud toote kood on " + kood + ", toote nimetus on " + nimetus + ", selle toote hind ilma käibemaksuta on " + hindKMita + " eurot, pärast käibemaksu on vatava toote hind " + kmhind(hindKMita)+ " eurot.";
    }

    public static void main(String[] args) {
        Seade juust = new Seade(257, "Hiire juust", 1.00);
        System.out.println(juust.toString());
    }
}
