package org.JavaCar;

public class Moto extends Vehicle{
    private int cilindrada;

    public Moto(String Matricula, String Marca, String Model, double preuBase, int cilindrada, Motor motor, Roda[] rodes) {
        super(Matricula, Marca, Model, preuBase, motor, rodes);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
