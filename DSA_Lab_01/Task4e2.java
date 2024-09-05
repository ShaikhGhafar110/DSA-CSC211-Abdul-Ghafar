/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4e2;

/**
 *
 * @author User
 */
public class Task4e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [] arr={4,6,2,8,10};
    
    int search=8;
    
    boolean found=false;
    
    for(int i=0; i<arr.length; i++){
    if(arr[i] == search){
        System.out.println("Element "+ search+ " found at index "+i);
        found=true;
        
    }
    }
    
    }
    
}
