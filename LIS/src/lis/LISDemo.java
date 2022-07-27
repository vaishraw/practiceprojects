package lis;


import java.util.Scanner;

public class LISDemo {
	public static void main(String[] args) {
		System.out.println("enter number of elements: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int omax = 0;
		int omi = 0;
		int[] dp = new int[n];

		for (int i = 0; i < dp.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (dp[j] > max) {
						max = dp[j];
					}
				}
			}
			dp[i] = max + 1;
			if (dp[i] > omax) {
				omax = dp[i];
				omi = i;
			}

		}
		System.out.println(omax);
	}
}
