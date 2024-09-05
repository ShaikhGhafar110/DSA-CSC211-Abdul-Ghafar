/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_02;

/**
 *
 * @author User
 */
public class task3 {
    public static void main(String[] args) {
        
    
    
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max=0;
        for(String str:sentences)
        {
            String words[]=str.split(" ");
            max=Math.max(max,words.length);
        }      
        
        
    }

    
}

