package gaurav.java.lab1;

import java.util.Scanner;

public class Lab1Exe7 {
	public static void main(String[] args) {
		int number;
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		number = scanner.nextInt();
		int curr_num = number % 10;
		number = number / 10;
		while (number > 0) {
			if (curr_num <= number % 10) {
				flag = true;
				break;
			}
			curr_num = number % 10;
			number = number / 10;
		}

		if (flag) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
	}
}
