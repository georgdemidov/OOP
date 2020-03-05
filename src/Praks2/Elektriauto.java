package Praks2;

public class Elektriauto {
    private String automark;
    private double elektrikulu;
    private int laadimisaeg;
    private int sõiduulatus;
    private Elektrijaam elektrijaam;

    Elektriauto(String mark, double kulu, int laadimiskestvus, int maxpikkus, Elektrijaam hind){
        this.automark = mark;
        this.elektrikulu = kulu;
        this.laadimisaeg = laadimiskestvus;
        this.sõiduulatus = maxpikkus;
        this.elektrijaam = hind;
    }

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        if (laadimisaeg > 0){
            this.laadimisaeg = laadimisaeg;
        }else{
            System.out.println("Sisestage sobivad andmed!");
        }
    }

    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }

    public void setElektrijaam(Elektrijaam elektrijaam) {
        this.elektrijaam = elektrijaam;
    }


    public double reisiKestus(int teepikkus, double keskmineKiirus){
        return ((teepikkus/sõiduulatus)*laadimisaeg + teepikkus/keskmineKiirus);
    }

    public String toString(){
        return "Antud elektriauto automark on " + automark + ". Selle auto elektrikulu on " + elektrikulu + " kwh/100km, aku laadimiskestvus on " + laadimisaeg + "minutit ning maksimaalne sõiduulatus " + sõiduulatus + ". Samuti on selle auto sajakilomeetrilise reisi maksumus ";
    }

    public static void main(String[] args) {
        Elektrijaam elektrijaam = new Elektrijaam(0.30);
        Elektriauto Volkswagen = new Elektriauto("Volkswagen e-up!", 1, 300, 120, elektrijaam);
        System.out.println(Volkswagen.toString());
        System.out.println(Volkswagen.reisiKestus(200, 110.5));
    }
}