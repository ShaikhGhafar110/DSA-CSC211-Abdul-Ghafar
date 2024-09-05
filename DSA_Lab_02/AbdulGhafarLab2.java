/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA_Lab_02;

/**
 *
 * @author User
 */
public class AbdulGhafarLab2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     //Task no 01    
     int[] nums={1,2,1};   
        int[] num = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            num[i+nums.length]= nums[i];
        }
       
    
    }
    
    
    
    }
    


