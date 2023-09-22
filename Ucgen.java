package com.company;

public class Ucgen extends GeometricShapeTwoDimension implements IGeometricShapeTwoDimension {
    private final int ikinciKenarUzunlugu;
    private final int tabanUzunlugu;
    private final int yukseklik;

    public Ucgen(String name, int kenarUzunlugu, int ikinciKenarUzunlugu, int tabanUzunlugu, int yukseklik) {
        super(name, kenarUzunlugu);
        this.ikinciKenarUzunlugu = ikinciKenarUzunlugu;
        this.tabanUzunlugu = tabanUzunlugu;
        this.yukseklik = yukseklik;
    }

    @Override
    public int cevreHesapla() {
        return getKenarUzunlugu()+this.ikinciKenarUzunlugu+this.tabanUzunlugu;
    }

    @Override
    public int alanHesapla() {
        return (this.tabanUzunlugu*this.yukseklik)/2;
    }
}
