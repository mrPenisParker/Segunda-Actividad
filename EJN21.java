/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejn21;
import java.util.Scanner;

public class EJN21 {
    public static void main(String[] args) {
        double a, b, c, P, S, A;
        
        System.out.println("Ingrese el valor del lado a");
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();
        
        System.out.println("Ingrese el valor del lado b");
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();
        
        System.out.println("Ingrese el valor del lado c");
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextDouble();
        
        P = a+b+c;
        S= P/2;
        A= Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("El perimetro del triangulo es "+ P);
        System.out.println("El semiperimetro del triangulo es "+ S);
        System.out.println("El area del triangulo es "+ A);
    }
    
}
