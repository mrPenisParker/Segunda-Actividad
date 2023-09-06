/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4n12;
import java.util.Scanner;
public class EJ4N12 {
    public static void main(String[] args) {
        String name;
        int NH, HE, HEE;
        double value, pay;
        
        System.out.println("Ingrese el nombre del trabajador");
        Scanner entrada1 = new Scanner(System.in);
        name = entrada1.nextLine();
        
        System.out.println("Ingrese las horas trabajadas");
        Scanner entrada2 = new Scanner(System.in);
        NH = entrada2.nextInt();
        
        System.out.println("Ingrese el valor por hora de trabajo");
        Scanner entrada3 = new Scanner(System.in);
        value = entrada3.nextDouble();
        
        if (NH > 40){
            HE = NH - 40;
            if (HE > 8){
                HEE= HE - 8;
                pay = (40*value)+(16*value)+(HEE*value*3);
            }
            else {
                pay = (40*value)+(HE*2*value);
            }
        }
        else {
            pay = NH*value;
                    }
            
        System.out.println("El trabajador " + name + " recibe: $" + pay);   
        
    }
    
}
