package tasks;

import java.util.Scanner;

public class sut {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String str= scan.next();

        if (str.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else if (str.equalsIgnoreCase("hayir")){
            System.out.println("Süt eklenmiyor");

        }else{
            System.out.println("Gecerli bir tercih giriniz");

        }
    }
}
