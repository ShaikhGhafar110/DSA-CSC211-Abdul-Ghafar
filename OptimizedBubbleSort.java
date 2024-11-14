package DSA_Lab_06;
public class OptimizedBubbleSort {
public static void main(String[] args) {
int[] arr = {64, 34, 25, 12, 22, 11, 90};
System.out.println("Original array:");
printArray(arr);
earlyStopBubbleSort(arr);
System.out.println("Sorted array:");
printArray(arr);}
public static void earlyStopBubbleSort(int[] arr) {
boolean swapped;
int n=arr.length;
for (int i = 0; i < n - 1; i++) {
swapped = false;
for (int j = 0; j < n - 1 - i; j++) {
if(arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
swapped=true;}}


if(!swapped) {
break;}}}
public static void printArray(int[] arr) {
for(int num : arr) {
System.out.print(num + " ");}
System.out.println();}}
  

