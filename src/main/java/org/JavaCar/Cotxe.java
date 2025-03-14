package org.JavaCar;

public class Cotxe extends Vehicle {
    private int nombrePlaces;

    public Cotxe(String Matricula, String Marca, String Model, double preuBase, int nombrePlaces, Motor motor, Roda[] rodes) {
        super(Matricula, Marca, Model, preuBase, motor, rodes);
        this.nombrePlaces = nombrePlaces;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

}
