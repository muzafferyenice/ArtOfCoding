package storage_project;

public class Product  implements GodFather{

    private String urunIsmi;
    private String marka;
    private String birim;
    private int miktar;
    private String raf=null;
    private int price;
    public static final String R = "\u001B[0m";
    public static final String K = "\u001B[31m";
    public static final String Y = "\u001B[32m";
    public static final String S = "\u001B[33m";
    public static final String M = "\u001B[34m";
    public static final String B = "\u001B[37m";
    public static final String C = "\u001B[36m";
    public static final String SIYAH = "\u001B[30m";


    public Product() {

    }

    public Product(String urunIsmi, String marka, String birim, int miktar, String raf) {

        this.urunIsmi = urunIsmi;
        this.marka = marka;
        this.birim = birim;
        this.miktar = miktar;
        this.raf = raf;


    }






    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBirim() {
        return birim;
    }



    public void setBirim(String birim) {
        this.birim = birim;
    }


    @Override
    public void depoyaUrunEkleme() {

    }

    @Override
    public void urunArama() throws InterruptedException {

    }

    @Override
    public void urunCikisi() throws InterruptedException {

    }
}


