/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_02;

/**
 *
 * @author User
 */
public class task5 {
    public static void main(String[] args) {
        
    
   int[] nums1={2,3,2};
           int[] nums2={1,2};
       int[] ans = {0,0};
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count++;
                    break;
                }
            }
        }
        ans[0]=count;
        count=0;
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    count++;
                    break;
                }
            }
        }
        ans[1]=count;
      
}
}



