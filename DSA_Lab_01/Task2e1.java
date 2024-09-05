/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2e1;

/**
 *
 * @author User
 */
public class Task2e1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
int [] arr = new int [6];
arr[0]=12;
arr[1]=24;
arr[2]=36;
arr[3]=48;
arr[4]=60;
System.out.println("Arrays before insertion");
for(int i=0;i<arr.length;i++){
System.out.println(+i+":"+arr[i]);}
int newelement =6;
for(int i=arr.length-1;i>0;i--){
arr[i]=arr[i-1];}
arr[0]=newelement;
System.out.println("After adding in index");
for(int i=0;i<arr.length;i++){
System.out.println(+i+":"+arr[i]);
}}}
