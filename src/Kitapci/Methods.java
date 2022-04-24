package Kitapci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
    static List<Kitap> kitaplarList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapSayac = 0;

    public static void giris() throws InterruptedException {
        System.out.println("Hosgeldiniz. Lütfen asagidaki menuden bir secim yapiniz: ");
        islemSecim();
    }

    public static void islemSecim() throws InterruptedException {
        System.out.println("* 1-kitap ekle\n" +
                "* 2-numara ile kitap goruntule\n" +
                "* 3-bilgi ile kitap goruntule\n" +
                "* 4-numara ile kitap sil\n" +
                "* 5-tum kitaplari listele\n" +
                "* 6-cikis");
        System.out.print("Seciminiz : ");
        int secim = 0;
        try {
            secim = scan.nextInt();
        } catch (Exception e) {
            String str = scan.next();
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
            giris();
        }
        switch (secim) {
            case 1:
                kitapEkle();
                giris();
                break;
            case 2:
                kitapnoileGoruntule();
                giris();
                break;
            case 3:
                kitapBilgiileGoruntule();
                giris();
                break;
            case 4:
                kitapnoileSil();
                giris();
                break;
            case 5:
                tumkitaplariListele();
                giris();
                break;
            case 6:
                cikis();
                break;
            default: {
                System.out.println("Yanlis bir secim yaptiniz. Tekrar deneyiniz...");
                giris();
                break;
            }
        }
    }

    private static void kitapEkle() throws InterruptedException {
        System.out.println("Girmek istediginiz kitap bilgileriniz yaziniz...");
        scan.nextLine(); // dummy scan
        System.out.print("Kitap adi : ");
        String kitapAdi = scan.nextLine();
        System.out.print("Yazar adi : ");
        String yazarAdi = scan.nextLine();
        System.out.print("Kitap fiyati : ");
        int kitapFiyati = scan.nextInt();
        Kitap kitap = new Kitap();
        int kitapNo = 1000 + kitapSayac;
        kitapSayac++;
        Kitap yeniKitap = new Kitap(kitapNo, kitapAdi, yazarAdi, kitapFiyati);
        kitaplarList.add(yeniKitap);
        while (true) {
            System.out.println("Kitap eklemeye devam etmek icin 1'e, Ana Menuye donmek icin 0'a basiniz.");
            int secim = 0;
            try {
                secim = scan.nextInt();
                if (secim == 1) kitapEkle();
                else if (secim == 0) giris();
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz...");
            }
        }
    }

    private static void kitapnoileGoruntule() throws InterruptedException {
        for (int i = 0; i < kitaplarList.size(); i++) {
            System.out.println(kitaplarList.get(i).getKitapNo());
        }
        System.out.print("Listeden bir kitap no giriniz : ");
        int secim = scan.nextInt();
        boolean bulunduMu = false;
        for (int i = 0; i < kitaplarList.size(); i++) {
            if (kitaplarList.get(i).getKitapNo() == secim) {
                bulunduMu = true;
                System.out.println("Aradiginiz kriterlere uygun sonuc bulundu ve listelendi");
                System.out.print("Kitap no  : " + kitaplarList.get(i).getKitapNo() + " ");
                System.out.print("Kitap adi : " + kitaplarList.get(i).getKitapAdi() + " ");
                System.out.print("Yazar adi : " + kitaplarList.get(i).getYazarAdi() + " ");
                System.out.print("Fiyati    : " + kitaplarList.get(i).getKitapFiyati() + " ");
                System.out.println();
            }
        }
        if (!bulunduMu) System.out.println("Aradiginiz kriterler uygun sonuc bulunamadi. ");

        while (true) {
            System.out.println("Arama yapmaya devam etmek icin 1'e, Ana Menuye donmek icin 0'a basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) kitapnoileGoruntule();
                else if (secim == 0) giris();
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz. ");
            }
        }
    }

    private static void kitapBilgiileGoruntule() throws InterruptedException {
        System.out.println("Kitap adi ile aramak icin 1'e, Yazar adi ile aramak icin 2'ye basiniz. ");
        System.out.println("Ana menuye donmek icin 0'a basiniz. Cikmak icin 6'ya basiniz. ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                scan.nextLine();
                System.out.print("Kitap adi giriniz : ");
                String kitapAdi = scan.nextLine();
                boolean bulunduMu = false;
                for (int i = 0; i < kitaplarList.size(); i++) {
                    if (kitaplarList.get(i).getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                        bulunduMu = true;
                        System.out.println("Aradiginiz kriterlere uygun sonuc bulundu ve listelendi");
                        System.out.print("Kitap no  : " + kitaplarList.get(i).getKitapNo() + " ");
                        System.out.print("Kitap adi : " + kitaplarList.get(i).getKitapAdi() + " ");
                        System.out.print("Yazar adi : " + kitaplarList.get(i).getYazarAdi() + " ");
                        System.out.print("Fiyati    : " + kitaplarList.get(i).getKitapFiyati() + " ");
                        System.out.println();
                    }
                }
                if (!bulunduMu) System.out.println("Aradiginiz kriterler uygun sonuc bulunamadi. ");
            }

            while (true) {
                System.out.println("Arama yapmaya devam etmek icin 1'e, Ana Menuye donmek icin 0'a basiniz.");
                try {
                    secim = scan.nextInt();
                    if (secim == 1) kitapnoileGoruntule();
                    else if (secim == 0) giris();
                } catch (Exception e) {
                    String str = scan.next();
                    System.out.println("Hatali giris yaptiniz. ");
                }
            }

            case 2: {
                scan.nextLine();
                System.out.print("Yazar adi giriniz : ");
                String yazarAdi = scan.nextLine();
                boolean bulunduMu = false;
                for (int i = 0; i < kitaplarList.size(); i++) {
                    if (kitaplarList.get(i).getYazarAdi().equalsIgnoreCase(yazarAdi)) {
                        bulunduMu = true;
                        System.out.println("Aradiginiz kriterlere uygun sonuc bulundu ve listelendi");
                        System.out.print("Kitap no  : " + kitaplarList.get(i).getKitapNo() + " ");
                        System.out.print("Kitap adi : " + kitaplarList.get(i).getKitapAdi() + " ");
                        System.out.print("Yazar adi : " + kitaplarList.get(i).getYazarAdi() + " ");
                        System.out.print("Fiyati    : " + kitaplarList.get(i).getKitapFiyati() + " ");
                        System.out.println();
                    }
                }
                if (!bulunduMu) System.out.println("Aradiginiz kriterler uygun sonuc bulunamadi. ");

                while (true) {
                    System.out.println("Arama yapmaya devam etmek icin 1'e, Ana Menuye donmek icin 0'a basiniz.");
                    try {
                        secim = scan.nextInt();
                        if (secim == 1) kitapBilgiileGoruntule();
                        else if (secim == 0) giris();
                    } catch (Exception e) {
                        String str = scan.next();
                        System.out.println("Hatali giris yaptiniz. ");
                    }
                }
            }
            case 0:
                giris();
            case 6:
                cikis();
            default: {
                System.out.println("Hatali giris yaptiniz. ");
                kitapBilgiileGoruntule();
            }
        }
    }

    private static void kitapnoileSil() throws InterruptedException {
        for (int i = 0; i < kitaplarList.size(); i++) {
            System.out.println(kitaplarList.get(i).getKitapNo());
        }
        System.out.print("Silmek istediginiz kitap no'sunu giriniz : ");
        int secim = scan.nextInt();
        boolean bulunduMu = false;
        for (int i = 0; i < kitaplarList.size(); i++) {
            if (kitaplarList.get(i).getKitapNo() == secim) {
                bulunduMu = true;
                System.out.println("Aradiginiz kriterlere uygun sonuc bulundu ve silinecek.");
                System.out.println("Emin misiniz ? (E) / (H)");
                char silmeEvetHayir = scan.next().charAt(0);
                if (silmeEvetHayir == 'E' || silmeEvetHayir == 'e') {
                    kitaplarList.remove(i);
                    System.out.println("Silme işlemi gerçekleştirildi. ");
                } else {
                    System.out.println("Silme işlemi iptal edildi.");
                }
            }
        }
        if (!bulunduMu) System.out.println("Aradiginiz kriterler uygun sonuc bulunamadi. ");
        System.out.println("Lutfen bekleyiniz.");
        Thread.sleep(3000);
        while (true) {
            System.out.println("Silme islemine devam etmek icin 1'e, Ana Menuye donmek icin 0'a basiniz.");
            try {
                secim = scan.nextInt();
                if (secim == 1) kitapnoileGoruntule();
                else if (secim == 0) giris();
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz. ");
            }
        }
    }


    private static void tumkitaplariListele() throws InterruptedException {
        for (int i = 0; i < kitaplarList.size(); i++) {
            System.out.print("Kitap no  : " + kitaplarList.get(i).getKitapNo() + " ");
            System.out.print("Kitap adi : " + kitaplarList.get(i).getKitapAdi() + " ");
            System.out.print("Yazar adi : " + kitaplarList.get(i).getYazarAdi() + " ");
            System.out.print("Fiyati    : " + kitaplarList.get(i).getKitapFiyati() + " ");
            System.out.println();

        }
        System.out.println("Lutfen bekleyiniz.");
        Thread.sleep(3000);
        islemSecim();
    }

    private static void cikis() {
        System.out.println("İyi gunler dileriz...");
    }
}
