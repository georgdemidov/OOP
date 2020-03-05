package Rühmatöö;

import java.util.Random;
import java.util.Scanner;

public class Rulett {

    private int raha;
    private String kasutaja;

    Rulett(String kasutajaNimi, int rahasumma) {
        this.raha = rahasumma;
        this.kasutaja = kasutajaNimi;
    }

    public int getRaha() {
        return raha;
    }

    public void setRaha(int raha) {
        this.raha = raha;
    }

    public String getKasutaja() {
        return kasutaja;
    }

    public String toString() {
        return "Rulett{" + "raha=" + raha + ", kasutaja='" + kasutaja + '\'' + '}';
    }

    static String tervitus(String kasutajaNimi) {
        return "Tere tulemast, " + kasutajaNimi + ", algab ruleti simulatsioon!";
    }

    static void mäng(Rulett mängija) {
        int panus;
        Random arv = new Random();
        String värv;
        int kordaja;
        String valik;
        System.out.println("================================================================");
        System.out.println("Tere tulemast Georgsandri onlain kasiinoosse, " + mängija.getKasutaja() + "!");
        System.out.println("Te alustate oma hasartmängu " + mängija.getRaha() + " euroga.");
        System.out.println();
        System.out.println("Mänguks on rulett, kus saate panustada endale ");
        System.out.println("sobiva värvi peale - 'punane', 'must', 'roheline'.");
        System.out.println();
        System.out.println("Kui Teie panus läheb täppi, saate vastavalt 2x,");
        System.out.println("2x või 14x oma panusest juurde.");
        System.out.println();
        System.out.println("Kui aga juhtub, et teie panus ei läinud täppi,");
        System.out.println("kaotate panustatud summa.");
        System.out.println("-Mäng saab läbi, kui raha saab otsa või kirjutate");
        System.out.println("'quit'.");
        System.out.println("================================================================");
        System.out.println();
        while (true) {
            if (mängija.getRaha() <= 0){
                System.out.println("Teil sai raha otsa. Mäng sai läbi.");
                break;
            }
            System.out.println("\nTeil on praguse seisuga " + mängija.getRaha() + " eurot.");
            Scanner värviValik = new Scanner(System.in);
            System.out.println("Sisestage enda valik ('punane', 'must', roheline' või 'quit'): ");
            valik = värviValik.nextLine();
            if (valik.equals("quit")) {
                System.out.println("Mäng sai läbi. Teile jäi " + mängija.getRaha() + " eurot.");
                break;
            }
            Scanner panuseSumma = new Scanner(System.in);
            System.out.println("Sisestage enda panus (täisarv): ");
            panus = Integer.parseInt(panuseSumma.nextLine());
            int ruletiLauaNumber = arv.nextInt(38);
            if (ruletiLauaNumber == 0){
                värv = "roheline";
                kordaja = 14;
            }else if (ruletiLauaNumber % 2 == 0){
                värv = "punane";
                kordaja = 2;
            }else{
                värv = "must";
                kordaja = 2;
            }
            if (valik.equals(värv)){
                System.out.println("Õnnitlen Teid, teie panus läks täppi!");
                System.out.println("Ruleti pall maandus lohku, mis oli " + värv + ".");
                System.out.println("Võtisite " + (panus * kordaja) + " eurot!");
                mängija.setRaha(mängija.getRaha() + (panus * kordaja));
            }else{
                System.out.println("Pagan võtaks, teie pakkumine läks nihu!");
                System.out.println("Ruleti pall maandus lohku, mis oli " + värv + ".");
                System.out.println("Kaotasite " + panus+ " eurot.");
                mängija.setRaha(mängija.getRaha() - panus);
            }
        }
    }
}
