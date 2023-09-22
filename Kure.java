package com.company;

public class Kure extends GeometricShapeThreeDimension implements IGeometricShapeThreeDimesion {
    public Kure(String name, int yariCap) {
        super(name, yariCap);
    }

    @Override
    public double alanHesapla() {

        return 4 * Math.PI * Math.pow(getYariCap(), 2);

    }

    @Override
    public double hacimHesapla() {
        System.out.println(getClass().getSimpleName()+"'nin hacmi: ");
        return (4.0 / 3.0) * Math.PI * Math.pow(getYariCap(), 3);
    }


}
