package tasks;

import java.util.Locale;
import java.util.Scanner;

public class KahveCesitleri {
    String khv1= "TURK KAHVESI";
    String khv2 ="FILTRE KAHVE";
    String khv3 ="ESPRESSO";

    static String kahveCesit;



    public KahveCesitleri(String turk_kahvesi_, String filtre_kahve_, String s) {
        System.out.println("~~~~~***KAHVEM KAFEYE HOSGELDINIZ***~~~~~");
        Scanner scan = new Scanner(System.in);
        System.out.println("HANGI KAHVEMIZI ARZU EDERSINIZ\n "+ "TURK KAHVESI\n "+"FILTRE KAHVE\n "+"ESPRESSO ");
        kahveCesit=scan.nextLine().trim();// bug() ü harfi girerse ne yapcan



        if (kahveCesit.replaceAll("ü","u").equalsIgnoreCase("TURK KAHVESI")){
            System.out.println("SIZIN ICIN "+ kahveCesit.toUpperCase()+ " HAZIRLANIYOR");
        }else if (kahveCesit.equalsIgnoreCase(khv2)){
            System.out.println("SIZIN ICIN "+ kahveCesit.toUpperCase()+ " HAZIRLANIYOR");
        }else if (kahveCesit.equalsIgnoreCase(khv3)){
            System.out.println("SIZIN ICIN "+ kahveCesit.toUpperCase()+ " HAZIRLANIYOR");
        }else {
            System.out.println("HATALI TUSLAMA YAPTINIZ TEKRAR DENEYIN");
            KahveCesitleri kahve =new KahveCesitleri("TURK KAHVESI ","FILTRE KAHVE "," ESPRESSO ");

            //TRICK BURDA:::)))
        }

    }
    KahveCesitleri(){

    }

    public KahveCesitleri(String evet, String hayır) {
        System.out.println("Süt ister misiniz? Evet/Hayır olarak belirtiniz.");

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        if (str.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (str.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor.");
        }else {
            System.out.println("HATALI TUSLAMA YAPTINIZ TEKRAR DENEYIN");
            KahveCesitleri sut = new KahveCesitleri("Evet","Hayır");
        }
    }

    public KahveCesitleri(String s) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seker eklemek ister misiziniz (Evet veya Hayir yazınız)");
        String seker = scan.nextLine().toUpperCase();
        if (seker.equalsIgnoreCase("EVET")) {


            if (seker.equalsIgnoreCase("EVET")) {
                System.out.println("Kac seker eklemek istesiniz");
                int sekerSayisi = scan.nextInt();
                System.out.println(sekerSayisi+ " Seker ekleniyor");
            }else if (seker.equalsIgnoreCase("HAYIR")) {
                System.out.println("Sekersiz");
            }else {
                System.out.println("HATALI TUSLAMA YAPTINIZ TEKRAR DENEYIN");
                KahveCesitleri sekerMi = new KahveCesitleri("Evet ,Hayır");
            }


        }

    }

    public KahveCesitleri(String büyük_boy, String orta_boy, String kucuk_boy, String double_boy) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kahveniz Hangi boyutta olsun? (büyük boy , orta boy , küçük boy  olarak giriniz.) ");
        String boyut1 = scan.nextLine().trim();
        if (boyut1.equalsIgnoreCase("Büyük boy") || boyut1.equalsIgnoreCase("orta boy") || boyut1.equalsIgnoreCase("küçük boy")) {

            System.out.println(kahveCesit+" " + boyut1 + " hazırlanıyor.");
        } else {
            System.out.println("HATALI TUSLAMA YAPTINIZ TEKRAR DENEYIN");
            KahveCesitleri boyut = new KahveCesitleri("Büyük boy","Orta boy","Kucuk boy","Double boy");

        }
    }
}
