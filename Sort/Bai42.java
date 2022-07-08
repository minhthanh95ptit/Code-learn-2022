package Sort;

import java.util.Scanner;

public class Bai42 {
    public static int[] insertionSort(int[] a){
        for(int i=1; i<a.length; i++) {
            int ai = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
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
        a = insertionSort(a);
        printArray(a);
    }
}
