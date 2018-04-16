/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import cadenas.Cadena;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Punto1 {
    Cadena cad = new Cadena ();
    public void menu1(){
        int op = 0;
        while (op != 4){
            System.out.println("Menu Punto 1");
            System.out.println("1: a");
            System.out.println("2: b");
            System.out.println("3: c");
            System.out.println("4: Volver");
            System.out.println("Ingrese una opcion");
            Scanner in = new Scanner(System.in);
            op = in.nextInt();
            switch (op) {
                case 1: cad.mostrarVocales();
                    break;
                case 2: cad.invertirCadena();
                    break;
                case 3: cad.verificarCaracter();
                    break;
                case 4: System.out.println("Volviendo...");
                    break;
            }
        }
    }
        
    
    
}
