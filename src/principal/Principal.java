/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        menu();
    }

    public static void menu() throws ParseException {
        Punto1 p1 = new Punto1();
        Punto2 p2 = new Punto2();
        Punto3 p3 = new Punto3();
        int op = 0;
        while (op != 4){
            System.out.println("----MENU----");
            System.out.println("1: Punto 1");
            System.out.println("2: Punto 2");
            System.out.println("3: Punto 3");
            System.out.println("4: Salir");
            System.out.println("Ingrese una opcion");
            Scanner in = new Scanner(System.in);
            op = in.nextInt();
            switch (op) {
                case 1: p1.menu1();
                    break;
                case 2: p2.menu2();
                    break;
                case 3: p3.mostrarFormato();
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
            }
        }
    }
}


        

