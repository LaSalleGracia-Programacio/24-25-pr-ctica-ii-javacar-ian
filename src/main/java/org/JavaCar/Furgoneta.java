package org.JavaCar;

public class Furgoneta extends Vehicle{
    private int capacitatCarga;

    public Furgoneta(String Matricula, String Marca, String Model, double preuBase, int capacitatCarga, String motor, String rodes) {
        super(Matricula, Marca, Model, preuBase, motor, rodes);
        this.capacitatCarga = capacitatCarga;
    }

    public int getCapacitatCarga() {
        return capacitatCarga;
    }
}
