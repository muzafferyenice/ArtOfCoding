package ortak;

import java.util.Scanner;

public class KahveMakınası {
    String hangiKahve;


    public KahveMakınası() {
        String kCesidi1 = "turkKahvesi";
        String kCesidi2 = "filtrekahve";
        String kCesidi3 = "espresso";

        Scanner scanner = new Scanner(System.in);
        System.out.println("kahve Makınesı \n" + "turkKahvesi  \nfiltre kahve  \nespresso  \n");

        System.out.println("hangi kahveyi istersiniz");
        String kahveCesidi1=scanner.nextLine();

        if ( kahveCesidi1.equalsIgnoreCase("turkKahvesi")) {
            System.out.println(" Türk kahvesi hazırlanıyor.");


        } else if ( kahveCesidi1.equalsIgnoreCase("filtre_kahve")) {
            System.out.println("Filtre kahve hazırlanıyor");
        } else if ( kahveCesidi1.equalsIgnoreCase("espresso")) {
            System.out.println("Filtre kahve hazırlanıyor.");
        } else {
            System.out.println("Hatalı tuşlama yaptınız");

            KahveMakınası robot = new KahveMakınası();
        }
    }

}



