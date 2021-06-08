package gaurav.java.lab1;

import java.util.Scanner;

public class Lab1Exe1 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer - ");
		int num = sc.nextInt();
		
		int i;
		int sum=0;
	System.out.println("number divisible by 3 and 5");
		for (i=1;i<=num;i++) {
			if (i%3==0 || i%5==0)
		        sum+=i;
		}
		sc.close();
		System.out.println(sum);
		
		}
	}

