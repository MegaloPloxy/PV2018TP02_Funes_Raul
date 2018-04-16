/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Cadena {
    private String cadena;

    public Cadena() {
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public int extraerLongitud(){   
        return cadena.length();
    }
    
    public char extraerCaracter(int i){
        return cadena.charAt(i);
    }
    
    public void mostrarVocales(){
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        Cadena cad = new Cadena ();
        System.out.println("Escriba su cadena: ");
        cad.setCadena(scan.nextLine());
        System.out.println("Cadena= " + cad.getCadena());
        for (int i=0; i<=cad.extraerLongitud()-1; i++){
            char l= cad.extraerCaracter(i);
            if (l=='a' || l== 'e' || l=='i' || l=='o' || l=='u'){
                cont=cont+1;
            }
            else
                if (l=='A' || l== 'E' || l=='I' || l=='O' || l=='U'){
                    cont=cont+1;
                }
        }
        System.out.println("Las vocales = " + cont);
    }
    
    public void invertirCadena(){
        Scanner scan = new Scanner (System.in);
        Cadena cad = new Cadena ();
        String s="";
        System.out.println("Escriba su cadena: ");
        cad.setCadena(scan.nextLine());
        System.out.println("Cadena a invertir: " + cad.getCadena());
        for (int i=cad.extraerLongitud()-1; i>=0; i--){
            s = s+cad.extraerCaracter(i);
        }
        s=s.toLowerCase();
        System.out.println("Cadena invertida: " + s);
    }
    
    public void verificarCaracter(){
        Scanner scan = new Scanner(System.in);
        Cadena cad = new Cadena ();
        int cont = 0;
        System.out.println("Escriba su cadena: ");
        cad.setCadena(scan.nextLine());
        System.out.println("Escriba su caracter: ");
        char c = scan.next().charAt(0);
        System.out.println("Cadena= " + cad.getCadena());
        for (int i=0; i<=cad.extraerLongitud()-1; i++){
            if (c == cad.extraerCaracter(i)){
                cont = cont+1;
            }
        }
        System.out.println("Las veces que se repite " + c + " son " + cont);
    }
}

