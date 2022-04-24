package storage_project;

import javax.swing.*;
import java.util.*;


public class Actions extends Product {
    static Map<Integer, Product> products = new HashMap<>();
    static Set<Integer> keySet = products.keySet();
    static List<Integer> keyler = new ArrayList<>();
    static int id = 1004;
    static String raf;
    //static List<String> birimler = new ArrayList<>(Arrays.asList(Y  + "KG", "CUVAL", "PALET", "LİTRE", "ADET" +  R));
    static String birimler[] = {S + "", "CUVAL", "PALET", "LİTRE", "ADET", "KG", "" + R};

    public void depoyaUrunEkleme() {

        Scanner scan = new Scanner(System.in);//


        System.out.print("urun ismini giriniz : ");

        String urunIsmi = scan.nextLine().toUpperCase();
        //scan.nextLine();

        System.out.print("marka bilgisi giriniz : ");
        String marka = scan.nextLine().toUpperCase();

        System.out.print("urun birimi giriniz : ");//


        String birim = scan.next().toUpperCase();

        boolean flag = false;
        for (String each : birimler) {

            if (birim.equalsIgnoreCase(each)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.print("urun miktar giriniz : ");
            try {
                int miktar = scan.nextInt();

                scan.nextLine();


                Product prd = new Product(urunIsmi, marka, birim, miktar, " " + raf);//

                products.put(id, prd);
                keyler.add(id);
                id++;
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(900);
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("urun eklendi");

                // JOptionPane.showMessageDialog(null,products.values());

                System.out.println(S + " ID     Urun Ismi    Marka           Birim       Miktar      Raf ");
                System.out.println("=================================================================");
                for (int i = 0; i < keyler.size(); i++) {


                    System.out.printf(  "%-9d %-10s %-15s %-12s %-9d %-1s\n", keyler.get(i),
                            products.get(keyler.get(i)).getUrunIsmi(), products.get(keyler.get(i)).getMarka(),
                            products.get(keyler.get(i)).getBirim(), products.get(keyler.get(i)).getMiktar(),
                            products.get(keyler.get(i)).getRaf());

                    System.out.println("----------------------------------------------------------------");
                }

                urunuRafaKoy();


            } catch (InputMismatchException | InterruptedException e) {
                System.out.println("harf giremezsiniz");
                ;
            }


        } else {

            System.out.println("Boyle bir birim yok");
            System.out.println(Arrays.toString(birimler));

        }
    }


    public static void urunuRafaKoy() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println(R + "(yonetici) hangi raf");
        String[] raf = {"RAF1","RAF2","RAF3","RAF4"};
        System.out.println("1-RAF1\n" +
                "2-RAF2\n" +
                "3-RAF3\n" +
                "4-RAF4");
        int rafTercihi = scan.nextInt();

        switch (rafTercihi) {

            case 1:
                products.get(keyler.get(keyler.size() - 1)).setRaf(raf[0]);

                break;
            case 2:
                products.get(keyler.get(keyler.size() - 1)).setRaf(raf[1]);
                break;
            case 3:
                products.get(keyler.get(keyler.size() - 1)).setRaf(raf[2]);
                break;
            case 4:
                products.get(keyler.get(keyler.size() - 1)).setRaf(raf[3]);
                break;
            default:
                System.out.println("sen nasil yoneticisin");
        }


        System.out.println(S + " ID     Urun Ismi    Marka           Birim       Miktar       Raf ");
        System.out.println("=================================================================");
        for (int i = 0; i < keyler.size(); i++) {


            System.out.printf("%-9d %-10s %-15s %-12s %-9d %s\n", keyler.get(i),
                    products.get(keyler.get(i)).getUrunIsmi(), products.get(keyler.get(i)).getMarka(),
                    products.get(keyler.get(i)).getBirim(), products.get(keyler.get(i)).getMiktar(),
                    products.get(keyler.get(i)).getRaf());

            System.out.println("----------------------------------------------------------------");
        }
        System.out.println(R);

    }

    public void urunArama() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aramak istediginiz urunun ID'sini giriniz");
        int id = scan.nextInt();
        for (int i = 0; i < 3; i++) {
            Thread.sleep(900);
            System.out.print("*");
        }
        System.out.println();

        if (products.containsKey(id)) {
            System.out.println(S + " ID     Urun Ismi    Marka           Birim       Miktar      Raf");
            System.out.println("================================================================");

            System.out.printf("%-9d %-10s %-15s %-12s %-9d %s\n", id,
                    products.get(id).getUrunIsmi(), products.get(id).getMarka(),
                    products.get(id).getBirim(), products.get(id).getMiktar(),
                    products.get(id).getRaf() + R);


        } else {
            System.out.println("elimizde girdiginiz ID'e ait urun yok");
        }
        System.out.println(R);


    }


    public void urunCikisi() throws InterruptedException {
        System.out.println(" ID     Urun Ismi    Marka           Birim       Miktar       Raf");
        System.out.println("=================================================================");
        for (int i = 0; i < keyler.size(); i++) {


            System.out.printf("%-9d %-10s %-15s %-12s %-10d %s\n", keyler.get(i), products.get(keyler.get(i)).getUrunIsmi(), products.get(keyler.get(i)).getMarka(), products.get(keyler.get(i)).getBirim(), products.get(keyler.get(i)).getMiktar(), products.get(keyler.get(i)).getRaf());

            System.out.println("----------------------------------------------------------------");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("istediginiz urunun ID'sini giriniz");
        int id = scan.nextInt();

        if (products.containsKey(id)) {
            try {


                System.out.println("ne kadar istiyorsun");
                int alis = scan.nextInt();

                if (products.get(id).getMiktar() >= alis) {
                    if (products.containsKey(id)) {
                        products.get(id).setMiktar(products.get(id).getMiktar() - alis);
                    }
                } else {
                    System.out.println("elimizde istediginiz urunden " + products.get(id).getMiktar() + " " + products.get(id).getBirim() + " var");

                }

            } catch (IllegalArgumentException e) {
                System.out.println("harf girmeyiniz");
            }
        } else {
            System.out.println("elimizde girdiginiz ID'e ait urun yok");
        }
    }
}

