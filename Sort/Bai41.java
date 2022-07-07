package Sort;

import java.util.Scanner;

public class Bai41 {
    public static void bbsort(int a[],int n){
        for (int i = n-1; i >= 1; i--){
		boolean swapped= true;
		for (int j = 0; j < i; j++){
			if (a[j] > a[j+1]){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				swapped = false;
			}
		}
		if (swapped){
			break;
		}
	}        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();            
        }
        bbsort(a, n);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}