/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4n11;
import java.util.Scanner;
public class EJ4N11 {
    public static void main(String[] args) {
        int a, b, c, M;
        System.out.println("Ingrese el primer numero");
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextInt();
        
        System.out.println("Ingrese el tercer numero");
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextInt();
        
        if ((a >= b) && (a >= c)){
            M = a;
        }
        else if ((b >= a) && (b >= c)){
            M = b;
        }
        else{
            M =c;
        }
        System.out.println("El numero de mayor valor es "+ M);
        
    }

}
