package com.company;

public class Kare extends GeometricShapeTwoDimension implements IGeometricShapeTwoDimension {

    public Kare(String name, int kenarUzunlugu) {
        super(name, kenarUzunlugu);
    }


    @Override
    public int cevreHesapla() {
        return 4*getKenarUzunlugu();
    }

    @Override
    public int alanHesapla() {
        return getKenarUzunlugu()*getKenarUzunlugu();
    }
}
