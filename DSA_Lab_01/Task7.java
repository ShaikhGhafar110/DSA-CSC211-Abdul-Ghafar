/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task7;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="lake";
        String s2="mtsn";
        char c1[]=s1.toCharArray();
            char c2[]=s1.toCharArray();
            Arrays.sort(c1);
         Arrays.sort(c2);
    boolean result=Arrays.equals(c1, c2);
    if(result==true){
        System.out.println("String is anagram");
    }
    else
    { System.out.println("String is not anagram");
    }
    }
   
}

  
    

