package Praks2;

public class Raamat {
    private Isik autor;
    private String pealkiri;

    public Raamat(Isik autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri = pealkiri;
    }

    public String toString(){
        return (pealkiri + " autor on: " + autor);
    }

    public static void main(String[] args) {
        Isik luts = new Isik("Oskar Luts", 1.78, "14322339911", 72);
        Raamat suvi = new Raamat(luts, "Suvi");
        System.out.println(suvi.toString());
    }
}
