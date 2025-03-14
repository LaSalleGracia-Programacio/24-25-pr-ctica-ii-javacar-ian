package org.JavaCar;

public class Roda {
    private String Marca;
    private int diametre;

    public Roda(String marca, int diametre) {
        this.Marca = marca;
        this.diametre = diametre;
    }

    public String getMarca() {
        return Marca;
    }

    public int getDiametre() {
        return diametre;
    }
}
