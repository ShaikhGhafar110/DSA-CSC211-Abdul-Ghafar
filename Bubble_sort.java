package DSA_Lab_06;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Bubble_sort {
    
public void Bubble_sort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
    for(int j=0; j<arr.length-1; i++){
    if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        System.out.println("Bilal");
    }
    }
    }
}
    public static void main(String[] args) {
        Bubble_sort b=new Bubble_sort();
        
        int[] arr = {2,4,1,6};
        
        b.Bubble_sort(arr);
        System.out.println("done");
        
//        Scanner src=new Scanner(System.in);
//        System.out.print("Enter Number here: ");
//        int size=src.nextInt();
//        int[] arr=new int[size];
//        for(int i=0; i<size; i++){
//            arr[i]=src.nextInt();
//        }
//        System.out.println("Before Swapping");
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//        }
//         b.Bubble_sort(arr);
//          System.out.println("After Swapping");
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]+" ");
//        }
    }
}
