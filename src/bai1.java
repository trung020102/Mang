
import java.util.Iterator;
import java.util.Scanner;

public class bai1 {
	public static void nhapMang(int[] arr, int n) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap mang:");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + " ");
			arr[i] = scan.nextInt();
		}
	}
	
	public static double Tbc(int[] arr, int n) {
		double tbc = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		tbc = (double)sum/n;
		return tbc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		nhapMang(arr, n);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		double tbc = Tbc(arr, n);
		System.out.println("Trung binh cong: " + Tbc(arr, n));
	}

}