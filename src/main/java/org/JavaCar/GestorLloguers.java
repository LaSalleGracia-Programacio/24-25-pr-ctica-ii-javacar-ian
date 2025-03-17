package org.JavaCar;

import java.awt.*;

public class GestorLloguers {
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double totalIngressos = 0;
        for (Vehicle vehicle : vehicles) {
            totalIngressos += vehicle.calcularPreu(dies);
        }
        return totalIngressos;
    }

    public static double calcularIngressosTotals(java.util.List<Vehicle> vehicles, int dies) {
    }
}
