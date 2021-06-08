package gaurav.java.lab1;

import java.util.Scanner;

public class Lab1Exe6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer - ");
		int num = sc.nextInt();
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (i = 1; i <= num; i++) {
			sum1 += i * i;
		}
		System.out.println("sum of the squares " + sum1);
		for (i = 1; i <= num; i++) {
			sum2 += i;
		}
		System.out.println("The square of the sum " + sum2);
		sum3 = sum1 - (sum2 * sum2);
		System.out.println("Difference is " + sum3);
	}
}
