import java.util.Random;
import java.util.Scanner;
public class bai3 {

	public static void NhapMangInt(int[] arr, int n) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
        int ranNum;
		System.out.println("Sinh so cho mang:");
		for(int i = 0; i < n; i++) {
			ranNum = rand.nextInt(100)+1;
			System.out.print(ranNum + " ");
			arr[i] = ranNum;
		}
	}
	
	public static void NhapMangDouble(double[] arr, int n) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
        double ranNum;
        
		System.out.println("Sinh so cho mang:");
		for(int i = 0; i < n; i++) {
			ranNum = rand.nextDouble();
			System.out.print(ranNum + " ");
			arr[i] = ranNum;
		}
	}
	
	public static double Tbc(int[] arrInt, double[] arrDouble, int n) {
		double result = 1;
		double sum = 0;
		double temp;
		for(int i = 0; i < n; i ++) {
			temp = arrInt[i] * arrDouble[i];
			sum += temp;
		}
		result = sum / n;
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu cua mang");
		n = input.nextInt();
		int[] arrInt = new int[n];
		double[] arrDouble = new double[n];
		
		NhapMangInt(arrInt, n);
		NhapMangDouble(arrDouble, n);
		
		double s = Tbc(arrInt, arrDouble, n);
		
		System.out.println("trung binh cong la`: " + s);
	}
}