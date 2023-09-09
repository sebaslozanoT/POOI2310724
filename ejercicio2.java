/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.en.grupo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 *
 *
 * @author Alumno
 */
public class ejercicio2 {
    
    private static final Scanner scanner= new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N % 2!=0){
            System.out.println("Luna");
        }else if(N >= 2 && N <= 5){
            System.out.println("Sol");
        }else if(N >= 6 && N <=20){
            System.out.println("Tierra");
        }else{
            System.out.println("Galaxia");
        }
        scanner.close();
    }
}






        
        
        
        
