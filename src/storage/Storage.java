package storage_project;

import java.util.Scanner;

public class Storage extends Menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {


        Product prd = new Product("UN ", "HEKIMOGLU ", "CUVAL ", 20, " RAF1");
        Product prd1 = new Product("SUT ", "SUTAS ", "LİTRE ", 100, " RAF2 ");
        Product prd2 = new Product("YAG ", "HAYAT ", "LİTRE ", 50, " RAF3 ");
        Product prd3 = new Product("UN ", "SOKE ", "CUVAL ", 15, " RAF4 ");

        products.put(1000, prd);
        products.put(1001, prd1);
        products.put(1002, prd2);
        products.put(1003, prd3);
        keyler.addAll(keySet);


        menu();
    }

}

