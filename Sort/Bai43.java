package Sort;

import java.util.Scanner;

public class Bai43 {
    public static int[] selectionSort(int[] a){
        for(int i=0; i<a.length; i++) {
            int minIndex = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;    
            }
        }
        return a;
    }
    public static void printArray(int[] a){
        for(int i=0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] input(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = input(sc);
        a = selectionSort(a);
        printArray(a);
    }
}