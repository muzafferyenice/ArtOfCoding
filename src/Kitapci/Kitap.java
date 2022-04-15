package Kitapci;

public class Kitap {
    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private int kitapFiyati;

    public Kitap() {
    }

    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyati) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(String kitapFiyati) {
        this.kitapFiyati = Integer.parseInt(kitapFiyati);
    }
}
