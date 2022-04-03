package tasks;

import java.util.Scanner;

public class SekerliMi {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);

        System.out.println("Seker eklemek ister misiziniz (Evet veya Hayir yazınız)");
        String seker = scan.nextLine();
        Seker aa=new Seker(seker);

        if (seker.equalsIgnoreCase("EVET")) {
            System.out.println("Kac seker ekemek istesini)");

            int sekerSayisi = scan.nextInt();
            System.out.println(sekerSayisi+" Seker ekleniyor");
        }
        if (seker.equalsIgnoreCase("HAYIR")) {
        }
    }


    }


