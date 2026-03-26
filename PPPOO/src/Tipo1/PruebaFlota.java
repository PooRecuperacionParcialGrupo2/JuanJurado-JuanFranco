/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

import java.util.ArrayList;
/**
 *
 * @author Juan Martín
 */
public class PruebaFlota {
    public static void main(String[] args) {

        ArrayList<Camion> camiones = new ArrayList<>();
        ArrayList<Furgoneta> furgonetas = new ArrayList<>();

      
        Camion c1 = new Camion("AAA111", "Volvo", 200, 10);
        Camion c2 = new Camion("BBB222", "Scania", 180, 8);
        Camion c3 = new Camion("CCC333", "Mercedes", 220, 12);
        Camion c4 = new Camion("DDD444", "MAN", 210, 9);

        if (!camiones.contains(c1)) {
            camiones.add(c1);
        }
        if (!camiones.contains(c2)) {
            camiones.add(c2);
        }
        if (!camiones.contains(c3)) {
            camiones.add(c3);
        }
        if (!camiones.contains(c4)) {
            camiones.add(c4);
        }

    
        Furgoneta f1 = new Furgoneta("EEE555", "Renault", 80, 500);
        Furgoneta f2 = new Furgoneta("FFF666", "Chevrolet", 70, 450);
        Furgoneta f3 = new Furgoneta("GGG777", "Nissan", 75, 480);
        Furgoneta f4 = new Furgoneta("HHH888", "Ford", 85, 520);

        if (!furgonetas.contains(f1)) {
            furgonetas.add(f1);
        }
        if (!furgonetas.contains(f2)) {
            furgonetas.add(f2);
        }
        if (!furgonetas.contains(f3)) {
            furgonetas.add(f3);
        }
        if (!furgonetas.contains(f4)) {
            furgonetas.add(f4);
        }

        System.out.println("=== CAMIONES ===");
        for (int i = 0; i < camiones.size(); i++) {
            Camion c = camiones.get(i);
            c.mostrarInfoGeneral();
            System.out.println("Autonomía: " + c.calcularAutonomia());
        }

        System.out.println("=== FURGONETAS ===");
        for (int i = 0; i < furgonetas.size(); i++) {
            Furgoneta f = furgonetas.get(i);
            f.mostrarInfoGeneral();
            System.out.println("Autonomía: " + f.calcularAutonomia());
        }

        System.out.println("=== RUTAS CAMIONES ===");
        for (int i = 0; i < camiones.size(); i++) {
            Camion c = camiones.get(i);
            c.asignarRuta();
            c.asignarRuta("Bogotá");
            c.asignarRuta("Medellín", 400);
        }
    }
   //version 3
}