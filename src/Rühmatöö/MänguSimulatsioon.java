package Rühmatöö;

import java.util.Scanner;

public class MänguSimulatsioon {

    public static void main(String[] args) {
        String kasutajanimi;
        int rahaSumma;

        Scanner nimi = new Scanner(System.in);
        System.out.println("Sisestage enda kasutanimi: ");
        kasutajanimi = nimi.nextLine();

        Scanner raha = new Scanner(System.in);
        System.out.println("Sisestage rahasumma, millega hakkate mängima meie kasiinos (täisarv): ");
        rahaSumma = Integer.parseInt(raha.nextLine());

        Rulett kasutaja = new Rulett(kasutajanimi, rahaSumma);
        Rulett.mäng(kasutaja);
    }
}
