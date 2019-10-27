/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Queue<String> j  = new LinkedList<>();
       Scanner jan = new Scanner (System.in);
       for (int a = 1; a> 0; a++) {
           System.out.println("Enter Element: ");
           String x = jan.next();
           String[] c = x.split("");
           for(String IA :c){
            j.add(IA);
            
           }
       int z = j.size() -1;
       String s = j.peek();
       for(int y = 0; y<z; y++){
       j.remove();
       }
       String b = j.peek();
       if(s.equals(b)) {
           System.out.println("The Word "+x+" is a Palindrome");
       }else{
           System.out.println("The Word "+x+" is not a Palindrome");
       }
       
       }
       
       
       
       
       j.remove();
       
               
           }
       }
       
    
    

