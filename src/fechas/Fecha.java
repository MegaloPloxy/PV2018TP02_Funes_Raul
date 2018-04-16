/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Fecha {
    private String dia;
    private String mes;
    private String año;
    public Fecha() {
    }
    
    public Date brindarFecha(){
        Date hoy=new Date();   
        return hoy;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }
    
    public void edadEnSemanas() throws ParseException{
        Fecha fecha=new Fecha();
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese la fecha de su nacimiento (dd/MM/yyyy)");
        int a=(int) fecha.devolverEdadEnSemanas(scan.next());
        System.out.println("Ha vivido "+ a/7+ " semanas");
        
    }
    
    public long devolverEdadEnSemanas (String fecha) throws ParseException{
        long res;
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        Date f=sdf.parse(fecha);
        res=(brindarFecha().getTime()-f.getTime())/86400000; //Esto da el resultado en Dias
        System.out.println(brindarFecha());
        System.out.println(f);
        return res;       
    }
    
    public void obtenerEstacion () throws ParseException{
        Fecha fecha=new Fecha();
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese una fecha(dd/MM/yyyy)");
        String fechae = scan.next();
        SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM");
        SimpleDateFormat mess = new SimpleDateFormat ("dd/MM");
        Date primavera= mess.parse("21/09");
        Date verano= mess.parse("21/12");
        Date otoño= mess.parse("21/03");
        Date invierno= mess.parse("21/06");
        Date f;
        f = sdf.parse(fechae);
        if (f.equals(otoño) || f.after(otoño) && f.before(invierno)){
            System.out.println("Otoño");
        }
        else 
            if (f.equals(invierno) || f.after(invierno) && f.before(primavera))
                System.out.println("Invierno");
            else{
                if (f.equals(primavera) || f.after(primavera) && f.before(verano))
                    System.out.println("Primavera");
                else{
                    if (f.equals(verano) || f.after(verano) || f.before(otoño))
                        System.out.println("Verano");
                    else{
                        System.out.println("Error");
                }
            }
        }
    }
    
    public void mostrarCantDomingos () throws ParseException{
        int cont=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese una fecha 1(dd/MM/yyyy)");
        String fecha1 =scan.next();
        System.out.println("Ingrese una fecha 2(dd/MM/yyyy)");
        String fecha2 =scan.next();
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        Date f1= sdf.parse(fecha1);
        Date f2= sdf.parse(fecha2);
        Date aux=sdf.parse(fecha1);
        for (long i=f1.getTime(); i<=f2.getTime(); i=i+86400000){
            aux.setTime(i);
            if (aux.getDay()==6){
                cont=cont+1;
            }
        }
        System.out.println("La cantida de domingos es " + cont);
    }
    
    public void calcularDiferenciaDias() throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat ("dd/MM/yyyy");
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese una fecha 1(dd/MM/yyyy)");
        String fecha1 =scan.next();
        System.out.println("Ingrese una fecha 2(dd/MM/yyyy)");
        String fecha2 =scan.next();
        Date f1=sdf.parse(fecha1);
        Date f2=sdf.parse(fecha2);
        int a = (int) ((f1.getTime()-f2.getTime())/86400000);
        System.out.println("La diferencia de dias es: " + a);  
    }
    
    public void verFechaConFormato () throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese una fecha(dd/MM/yyyy)");
        String fecha1 =scan.next();
        Date f1=sdf.parse(fecha1);
        long aux=f1.getTime()+100*86400000;
        f1.setTime(aux);
        SimpleDateFormat ndia=new SimpleDateFormat("EEEE; ");
        SimpleDateFormat año=new SimpleDateFormat("yyyy");
        SimpleDateFormat mes=new SimpleDateFormat("MMMM");
        SimpleDateFormat dia=new SimpleDateFormat("dd");
        System.out.println(ndia.format(f1) + dia.format(f1) + " de " + mes.format(f1) + " de " + año.format(f1));
    }
    
}
    

