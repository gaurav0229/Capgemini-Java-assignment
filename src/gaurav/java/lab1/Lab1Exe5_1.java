package gaurav.java.lab1;

import java.util.Scanner;

public class Lab1Exe5_1 {
	public static int calculateSum(int n) {
		int sum = 0;
		int count = 0;
		int k = 1;
		while (n > 0) {

			for (int i = 1; i <= k; i++) {

				if ((i % 3 == 0) || (i % 5 == 0)) {
					sum = sum + i;
					count++;

				}
				if (count == n) {
					return sum;
				} else {
					k++;
				}

			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range : ");
		int range = sc.nextInt();
		int result = calculateSum(range);
		System.out.println("Sum  of natural Number dividedby 3 or 5 = " + result);
	}
}
