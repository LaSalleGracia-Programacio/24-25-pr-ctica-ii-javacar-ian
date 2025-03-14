package org.JavaCar;

public abstract class Vehicle {
    private String Matricula;
    private String Marca;
    private String Model;
    private double preuBase;
    private String motor;
    private String rodes;


    public Vehicle(String Matricula, String Marca, String Model, double preuBase, String motor, String rodes) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Model = Model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModel() {
        return Model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public String getMotor() {
        return motor;
    }

    public String getRodes() {
        return rodes;
    }


}


