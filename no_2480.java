package Stage2;

import java.util.Scanner;
public class no_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c= sc.nextInt();
		
		if(a == b && b == c)
			System.out.print(10000 + a * 1000);
		else if(a == b)
			System.out.print(1000 + a * 100);
		else if(b == c)
			System.out.print(1000 + b * 100);
		else if(c == a)
			System.out.print(1000 + c * 100);
		else {
			if( a > b && b > c || a > c && c > b)
				System.out.print(a * 100);
			else if(b > a && a > c || b > c && c > a)
				System.out.print(b * 100);
			else
				System.out.print(c * 100);
		}
	}	

}
