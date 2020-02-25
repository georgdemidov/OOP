package Praks2;

public class Elektriauto {
    private String automark;
    private double elektrikulu;
    private int laadimisaeg;
    private int sõiduulatus;
    private Elektrijaam elektrijaam;

    Elektriauto(String mark, double kulu, int laadimiskestvus, int maxpikkus, String nimi){
        this.automark = mark;
        this.elektrikulu = kulu;
        this.laadimisaeg = laadimiskestvus;
        this.sõiduulatus = maxpikkus;
        this.elektrijaam = nimi;
    }

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        this.laadimisaeg = laadimisaeg;
    }

    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }

    public void setElektrijaam(Elektrijaam elektrijaam) {
        this.elektrijaam = elektrijaam;
    }

    public double maksumus100(){
        Elektrijaam hind = new Elektrijaam();
        return elektrikulu * hind;
    }

    public double maksumus(int teepikkus){

    }
}
