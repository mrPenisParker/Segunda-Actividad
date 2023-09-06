/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ep4n24;
import java.util.Scanner;
public class EP4N24 {

    public static void main(String[] args) {
        String J;
        int a, b, c, M;
        System.out.println("Ingrese el peso de la esfera A");
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B");
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextInt();
        
        System.out.println("IIngrese el peso de la esfera C");
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextInt();
        
        if ((a >= b) && (a >= c)){
            M = a;
            J = "A";
        }
        else if ((b >= a) && (b >= c)){
            M = b;
            J = "B";
        }
        else{
            M =c;
            J = "C";
        }
        System.out.println("La esfera con mayor peso es la "+ J);
    }
    
}
