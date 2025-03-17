package org.JavaCar;

public abstract class Vehicle implements Llogable {
    private String Matricula;
    private String Marca;
    private String Model;
    private double preuBase;
    private Motor motor;
    private Roda[] rodes;


    public Vehicle(String Matricula, String Marca, String Model, double preuBase, Motor motor,Roda[] rodes) {
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





