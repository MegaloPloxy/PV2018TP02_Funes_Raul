/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import fechas.Fecha;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
class Punto2 {
    
    public void menu2() throws ParseException{
        Fecha f = new Fecha();
        int op = 0;
        while (op != 5){
            System.out.println("Menu Punto 2");
            System.out.println("1: a");
            System.out.println("2: b");
            System.out.println("3: c");
            System.out.println("4: d");
            System.out.println("5: Volver");
            System.out.println("Ingrese una opcion");
            Scanner in = new Scanner(System.in);
            op = in.nextInt();
            switch (op) {
                case 1: f.edadEnSemanas();
                    break;
                case 2: f.obtenerEstacion();
                    break;
                case 3: f.mostrarCantDomingos();
                    break;
                case 4: f.calcularDiferenciaDias();
                    break;
                case 5: System.out.println("Volviendo...");
                    break;
            }
        }
    }
}