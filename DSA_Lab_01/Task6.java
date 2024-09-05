/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task6;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Task6 {

 /**
  * @param args the command line arguments
 */
public static void main(String[] args) {
Scanner i=new Scanner(System.in);
System.out.println("Write down the String");
String name=i.nextLine();
String reverse= new StringBuilder(name).reverse().toString();
if(name.equalsIgnoreCase(reverse)){
System.out.println("String is palindrome:");
}else{
System.out.println("String is not Palindrome:");
}}}
    
