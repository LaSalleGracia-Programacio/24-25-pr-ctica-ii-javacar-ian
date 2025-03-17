package org.JavaCar;

public abstract class Vehicle implements Llogable {
    protected String matricula;
    protected String marca;
    protected String model;
    protected double preuBase;
    protected Motor motor;
    protected Roda[] rodes;


    public Vehicle(String matricula, String marca, String model, double preuBase, Motor motor,Roda[] rodes) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public Motor getMotor() {
        return motor;
    }

    public Roda[] getRodes() {
        return rodes;
    }


    @Override
    public double calcularPreu(int dies){
        double preu = preuBase * dies;
        return preu + getExtra(dies);
    }

    private double getExtra(int dies){
        if (this instanceof Moto){
            Moto moto = (Moto) this;
            if (moto.getCilindrada() > 500) {
                double extra = 5 * dies;
                return extra;
            }
        } else if (this instanceof Furgoneta) {
            Furgoneta furgoneta = (Furgoneta) this;
            if (furgoneta.getCapacitatCarga() > 1000) {
                double extra = 10 * dies;
                return extra;
            }

        }
        return 0;
    }
}





