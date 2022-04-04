package ortak;

public class KahveMakınası {
String hangiKahve;


    public KahveMakınası() {
        String kCesidi1 = "turkKahvesi";
        String kCesidi2 = "filtrekahve";
        String kCesidi3 = "espresso";

        if (kCesidi1.equals("turkKahvesi")) {
            System.out.println(" Türk kahvesi hazırlanıyor.");


        } else if (kCesidi2.equals("filtre_kahve")) {
            System.out.println("Filtre kahve hazırlanıyor");
        } else if (kCesidi3.equals("espresso")) {
            System.out.println("Filtre kahve hazırlanıyor.");
        } else System.out.println("Hatalı tuşlama yaptınız");

        KahveMakınası robot=new KahveMakınası();
    }
    }





