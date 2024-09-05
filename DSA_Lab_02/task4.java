/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_02;

/**
 *
 * @author User
 */
public class task4 {
    public static void main(String[] args) {
        int[] nums= {1,2,2,1};
                
         int k=1 ;
    int[] arr =  new int[101];
        int count = 0;
        for(int i: nums) {
            arr[i]++;
        }
        for(int i=0; i+k<101; i++) {
            count += arr[i]*arr[i+k];
        
    }    
    }

    }

