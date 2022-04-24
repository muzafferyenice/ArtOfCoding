package storage_project;

import javax.swing.*;

public class Menu extends Actions {

    public static void menu() throws InterruptedException {


        String Menu = JOptionPane.showInputDialog(null, "Lütfen Yapmak İstediğiniz İşlemi Seçiniz :\n1-Ürün Ekleme\n2-Ürün Arama\n3-Ürün Cikis\n0-Cikis"
                , JOptionPane.QUESTION_MESSAGE);


        Actions obj = new Actions();
        if (Menu != null) {


            switch (Menu) {

                case "1":
                    obj.depoyaUrunEkleme();
                    menu();
                    break;
                case "2":

                    obj.urunArama();
                    menu();
                    break;
                case "3":
                    obj.urunCikisi();
                    menu();
                    break;
                case "0":

                    cikis();
                    break;
                default:
                    System.out.println("gecerli bir tuslama yapiniz");
                    menu();
                    break;
            }

        }
    }

    public static void cikis() {

        System.out.println("yine bekleriz");


    }
}
