package org.JavaCar;

public class Cotxe extends Vehicle {
    private int nombrePlaces;

    public Cotxe(String Matricula, String Marca, String Model, double preuBase, String motor, String rodes, int nombrePlaces) {
        super(Matricula, Marca, Model, preuBase, motor, rodes);
        this.nombrePlaces = nombrePlaces;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

}
