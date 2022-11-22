package stage3;

import java.util.Scanner;
public class no_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cost = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}
		
		if(sum == cost)
			System.out.print("Yes");
		else
			System.out.print("No");

	}

}
