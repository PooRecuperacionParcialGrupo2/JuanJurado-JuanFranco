/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

import java.util.Objects;

/**
 *
 * @author Juan Martín
 */
    public abstract class Vehiculo {

    protected String placa;
    protected String marca;
    protected double capacidadCombustible;

    public Vehiculo(String placa, String marca, double capacidadCombustible) {
        this.placa = placa;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
    }

    public void mostrarInfoGeneral() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad Combustible: " + capacidadCombustible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);  
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.placa, other.placa);
    }

    
    public abstract double calcularAutonomia();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }
    
    
}

