package tasks;

import java.util.Scanner;

public class Seker {
static  Scanner scan=new Scanner(System.in);

    public Seker(String seker) {
        if (seker.equalsIgnoreCase("EVET")) {
            System.out.println("Kac seker ekemek istesini)");

            int sekerSayisi = scan.nextInt();
            System.out.println(sekerSayisi+" Seker ekleniyor");
        }
        if (seker.equalsIgnoreCase("HAYIR")) {
        }
    }
}
