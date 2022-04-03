package tasks;

import java.util.Scanner;

public class Sut {

    public static void main(String[] args) {

        System.out.println("Süt ister misiniz? Evet/Hayır olarak belirtiniz." );

        Scanner scan = new Scanner(System.in);

        String str= scan.next();

        if (str.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (str.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor.");
        }
    }

}
