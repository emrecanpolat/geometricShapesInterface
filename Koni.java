package com.company;

public class Koni extends GeometricShapeThreeDimension implements IGeometricShapeThreeDimesion {
    private int yukseklik;
    private int yuzeyUreteci;

    public Koni(String name, int yariCap, int yukseklik, int yuzeyUreteci) {
        super(name, yariCap);
        this.yukseklik = yukseklik;
        this.yuzeyUreteci = yuzeyUreteci;
    }


    @Override
    public double alanHesapla() {
        System.out.println(getClass().getSimpleName()+"'nin alanı: ");
        return Math.PI * getYariCap() * (getYariCap() + this.yuzeyUreteci);

    }

    @Override
    public double hacimHesapla() {
        System.out.println(getClass().getSimpleName()+"'nin hacmi: ");
        return (1.0 / 3.0) * Math.PI * getYariCap() * getYariCap() * this.yukseklik;
    }
}