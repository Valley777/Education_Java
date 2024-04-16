package uprajnenia;
import java.util.Scanner;
public class division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// n number of integer numbers are given in the range [1 … 1000]. 
		//Some percent of them p1 are below 200, percent p2 are from 200 to 399, percent p3 are from 400 to 599, 
		//percent p4 are from 600 to 799 and the rest are p5 percent above 800 (inclusive). 
		//Write a program that calculates and prints the percentages p1, p2, p3, p4, and p5 on the console.
			
		double n = Double.parseDouble(scan.nextLine());
		double sum1 = 0.0; //counters
		double sum2 = 0.0;
		double sum3 = 0.0;
	 
		for (int i = 1; i <= n; i++) {
			int sequence = Integer.parseInt(scan.nextLine());
			if (sequence %2==0) {
				sum1 ++;
			} 
             if (sequence %3==0) {
				sum2 ++;
			} 
            if (sequence %4==0) {
				sum3 ++;
			} 	 
			}
		 
		 //proverki - broj kum vseki range
		//System.out.println(sum1);
	    // System.out.println(sum2);
	    // System.out.println(sum3);
	   
	double	p1 =  (sum1/n)*100 ;  //   >> percentage
	double 	p2 =  (sum2/n)*100;
	double 	p3 = (sum3/n)* 100;
 
		
		 System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n",p1,p2,p3);
  

}
}
