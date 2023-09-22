package com.company;

public class Dikdortgen extends GeometricShapeTwoDimension implements IGeometricShapeTwoDimension {
    private final int uzunKenarUzunlugu;

    public Dikdortgen(String name, int kenarUzunlugu, int uzunKenarUzunlugu) {
        super(name, kenarUzunlugu);
        this.uzunKenarUzunlugu = uzunKenarUzunlugu;
    }


    @Override
    public int cevreHesapla() {
        return 2*(getKenarUzunlugu()+this.uzunKenarUzunlugu);
    }

    @Override
    public int alanHesapla() {
        return getKenarUzunlugu()*this.uzunKenarUzunlugu;
    }
}
