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

    public Furgoneta(double volumenLitros, String placa, String marca, double capacidadCombustible) {
        super(placa, marca, capacidadCombustible);
        this.volumenLitros = volumenLitros;
    }

    @Override
    public double calcularAutonomia() {
      return capacidadCombustible * 12;
    }

    public double getVolumenLitros() {
        return volumenLitros;
    }

    public void setVolumenLitros(double volumenLitros) {
        this.volumenLitros = volumenLitros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furgoneta{");
        sb.append("volumenLitros=").append(volumenLitros);
        sb.append('}');
        return sb.toString();
    }

    
    
}
