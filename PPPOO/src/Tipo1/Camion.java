/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author VIVOBOOK
 */
public class Camion extends Vehiculo {

    private double capacidadCargaToneladas;

    public Camion(String placa, String marca, double capacidadCombustible, double capacidadCargaToneladas) {
        super(placa, marca, capacidadCombustible);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }

    @Override
    public double calcularAutonomia() {
        return capacidadCombustible * (10 - capacidadCargaToneladas * 0.2);
    }

    public void asignarRuta() {
        System.out.println("Ruta estándar asignada. Sin destino específico aún.");
    }

    public void asignarRuta(String atrDestino) {
        System.out.println("Ruta asignada con destino a: " + atrDestino);
    }

    public void asignarRuta(String atrDestino, double atrDistanciaKm) {
        System.out.println("Ruta asignada a " + atrDestino + ". Distancia total: " + atrDistanciaKm + " km. Preparando logística pesada.");
    }

    
}
