package Praks3;

public class SõnadeAnalüüs {
    public static void main(String[] args) {
        String lause = "Minu nimi on Peep ja ma elan Tartus";
        System.out.println(lause);
        for (String element: lause.split(" ")) {
            System.out.println(element);
            System.out.println(element.length());
        }
    }
}
