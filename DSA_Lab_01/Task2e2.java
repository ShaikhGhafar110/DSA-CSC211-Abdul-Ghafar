/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2e2;

/**
 *
 * @author User
 */
public class Task2e2 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
int [] arr = new int [6];
arr[0]=100;
arr[1]=200;
arr[2]=300;
arr[3]=400;
arr[4]=500;
System.out.println("Arrays before insertion");
for(int i=0;i<arr.length;i++){
System.out.println(i+":"+arr[i]);}
int newelement =250;
int position =2;
for(int i=arr.length-1;i>position;i--){
arr[i]=arr[i-1];}
arr[position]=newelement;
System.out.println("After adding in index");
for(int i=0;i<arr.length;i++){
System.out.println(+i+":"+arr[i]);
}}}
