/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

/**
 *
 * @author User
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr ={8,16,24,32,40};
            
        int index=2;
        
        for(int i=index; i<arr.length -1;i++){
        arr[i]=arr[i +1];
        }
    arr[arr.length -1]=0;
        System.out.println("array after deletion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
   
}
