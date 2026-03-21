/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Juan Martín
 */
public class Furgoneta extends Vehiculo {

    private double volumenLitros;

    public Furgoneta(String placa, String marca, double capacidadCombustible, double volumenLitros) {
        super(placa, marca, capacidadCombustible);
        this.volumenLitros = volumenLitros;
    }

    @Override
    public double calcularAutonomia() {
        return capacidadCombustible * 12;
    }
}