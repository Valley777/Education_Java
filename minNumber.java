package uprajnenia;
import java.util.Scanner;
public class minNumber {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n = Integer.parseInt(scan.nextLine());	
		 int min = Integer.MAX_VALUE;
		 for (int i = 1; i <= n ; i++) {
			 	
			 int sequence = Integer.parseInt(scan.nextLine());
			 if(n<min) {
				min =n;
			}
		 }
		System.out.println(min);
		
	}

}
