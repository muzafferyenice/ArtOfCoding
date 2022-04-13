package tasks;

import java.util.Scanner;

public class Seker {


    //v12
    static Scanner scan = new Scanner(System.in);

    public Seker(String seker) {
        if (seker.equalsIgnoreCase("EVET")) {
            System.out.println("Kac seker eklemek istesiniz");

            int sekerSayisi = scan.nextInt();

            if (sekerSayisi > 0) {
                System.out.println(sekerSayisi + " seker ekleniyor");

            } else {
                Seker aa = new Seker(seker);
////
            }
        }
        if (seker.equalsIgnoreCase("HAYIR")) {
        }
    }
}