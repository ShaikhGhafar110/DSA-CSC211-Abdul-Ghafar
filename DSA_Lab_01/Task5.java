package task5;
public class Task5 {

    public static void main(String[] args) {
        int[] originalArray = {1, 3, 5, 7, 9};
        int[] reversedArray = reverseArray(originalArray);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        } }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n]; 
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        
        return reversed;
    }
}
