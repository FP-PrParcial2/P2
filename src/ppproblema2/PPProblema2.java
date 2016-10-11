/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema2;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int m;
       double y,mi,p,Resultados;
       y=.9144401829;
       mi=1609.34;
       p=0.3048;
       m= solicitarMetros();
    }
    public static int solicitarMetros(){
        int m;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce metros");
        m= entrada.nextInt();
        return m;
    }
    public static void op(){
        double operaciones;
        System.out.println("Metros a yardas");
        operaciones = m * y; 
    } 
    public static void RES(){
    
    
    
    }


   
}
