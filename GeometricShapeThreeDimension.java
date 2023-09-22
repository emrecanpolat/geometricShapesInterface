package com.company;

abstract class GeometricShapeThreeDimension {
    private final String name;
    private final int yariCap;

    public GeometricShapeThreeDimension(String name, int yariCap) {
        this.name = name;
        this.yariCap = yariCap;
    }

    public String getName() {
        return name;
    }

    public int getYariCap() {
        return yariCap;
    }
}
