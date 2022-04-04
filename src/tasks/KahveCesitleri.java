package tasks;

import java.util.Locale;
import java.util.Scanner;

public class KahveCesitleri {
    String khv1= "TURK KAHVESI";
    String khv2 ="FILTRE KAHVE";
    String khv3 ="ESPRESSO";
    public KahveCesitleri() {
        System.out.println("~~~~~***KAHVEM KAFEYE HOSGELDINIZ***~~~~~");
        Scanner scan = new Scanner(System.in);
        System.out.println("HANGI KAHVEMIZI ARZU EDERSINIZ "+ "TURK KAHVESI "+"FILTRE KAHVE "+" ESPRESSO ");
        String kahveCesit=scan.nextLine().toUpperCase().trim();// bug() ü harfi girerse ne yapcan

        if (kahveCesit.equals("TURK KAHVESI")){
            System.out.println("SIZIN ICIN "+ khv1+ " HAZIRLANIYOR");
        }else if (kahveCesit.equals(khv2)){
            System.out.println("SIZIN ICIN "+ khv2+ " HAZIRLANIYOR");
        }else if (kahveCesit.equals(khv3)){
            System.out.println("SIZIN ICIN "+ khv3+ " HAZIRLANIYOR");
        }else {
            System.out.println("HATALI TUSLAMA YAPTINIZ TEKRAR DENEYIN");
            //KahveCesitleri kahve =new KahveCesitleri();
            //TRICK BURDA:::)))
        }

    }
   // public KahveCesitleri(String kahveCesit) {
   //     System.out.println(kahveCesit +"  HAZIRLANIYOR ");
   // }

}
