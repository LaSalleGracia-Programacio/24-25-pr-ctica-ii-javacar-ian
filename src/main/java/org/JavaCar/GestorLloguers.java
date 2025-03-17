package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class GestorLloguers {

    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double totalIngressos = 0;
        for (Vehicle vehicle : vehicles) {
            totalIngressos += vehicle.calcularPreu(dies);
        }
        return totalIngressos;
    }

    public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax) {
        List<Vehicle> vehiclesFiltrats = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPreuBase() <= preuMax) {
                vehiclesFiltrats.add(vehicle);
            }
        }
        return vehiclesFiltrats;
    }
}
