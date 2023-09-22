package com.company;

abstract class GeometricShapeTwoDimension{
    private final String name;
    private final int kenarUzunlugu;

    public GeometricShapeTwoDimension(String name, int kenarUzunlugu) {
        this.name = name;
        this.kenarUzunlugu = kenarUzunlugu;
    }



    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }
}
