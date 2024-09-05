/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_02;
import java.util.*;
/**
 *
 * @author User
 */
public class Task2 {
    public static void main(String[] args) {
        
 
String[] words={"abc","bcd","aaaa","cbc"};
char x='e';
         List<Integer> result = new ArrayList<>();
         
     for(int i= 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }

  
}
 
}
