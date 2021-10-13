import java.util.Random;
import java.util.Scanner;

public class bai2 {

	public static void nhapMang(int[] arr, int n) {
		
		Random rand = new Random();
        int ranNum;
		System.out.println("Sinh so cho mang:");
		for(int i = 0; i < n; i++) {
			ranNum = rand.nextInt(100)+1;
			System.out.print(ranNum + " ");
			arr[i] = ranNum;
		}
	}
	
	public static double Tbc(int[] arr, int n) {
		double tbc = 0;
		int s = 0;
		for(int i = 0; i < n; i++) {
			s+= arr[i];
		}
		tbc = (double)s/n;
		return tbc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu cua mang");
		n = input.nextInt();
		int[] arr = new int[n];
		
		nhapMang(arr, n);
		
		System.out.println();
		double tbc = Tbc(arr, n);
		System.out.println("Trung binh cong: " + tbc);
	}

}