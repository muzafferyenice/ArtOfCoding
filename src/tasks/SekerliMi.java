package tasks;

import java.util.Scanner;

public class SekerliMi {
    ublic static void main(String[] args) {

        SekerliMi sekerMi = new SekerliMi();{

          Scanner scan = new Scanner(System.in);

          System.out.println("Seker eklemek ister misiziniz (Evet veya Hayir yazınız)");
            String seker = scan.nextLine().toUpperCase();
          if (seker.equalsIgnoreCase("EVET")) {
                System.out.println("Kac seker ekemek istesini)");
                int sekerSayisi = scan.nextInt();
                System.out.println("Seker ekleniyor");
            }
          if (seker.equalsIgnoreCase("HAYIR")) {
            }
        }
    }
}
}
