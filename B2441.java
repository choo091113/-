import java.util.Scanner;

public class B2441 { // 별 찍기 - 4

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		int x = 0;
		int y = 0;
		
		while (true) {
		
			for (int j = a-x; j < a; j++) {
				System.out.print(" ");
		}
		
			
			for (int z = 0+y; z < a; z++) {
				System.out.print("*");
			}
			
			System.out.println();
			x++;
			y++;
			count++;
			if(a == count) break;
	}
}
}

