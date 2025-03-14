package org.JavaCar;

public class Moto extends Vehicle{
    private int cilindrada;

    public Moto(String Matricula, String Marca, String Model, double preuBase, String motor, String rodes, int cilindrada) {
        super(Matricula, Marca, Model, preuBase, motor, rodes);
        this.cilindrada = cilindrada;
    }
}
