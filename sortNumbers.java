import java.util.Scanner;
public class sortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//Read three real numbers and sort them in descending order. Print each number on a new line.
         int n1 = Integer.parseInt(scan.nextLine());
         int n2 = Integer.parseInt(scan.nextLine());
         int n3 = Integer.parseInt(scan.nextLine());

         if(n1>n2 && n1>n3){
           //  System.out.println(Math.max(Math.max(n1,n2),n3));
             System.out.println(Math.max(n1,n2));
             System.out.println(Math.max(n3,n2));
             System.out.println(Math.min(n3,n2));
         }else if(n2>n1 && n2>n3){
            // System.out.println(Math.max(Math.max(n2,n3),n1));
             System.out.println(Math.max(n2,n3));
             System.out.println(Math.max(n3,n1));
             System.out.println(Math.min(n3,n1));

         }else if(n3>n1 && n3>n2){
            // System.out.println(Math.max(Math.max(n3,n2),n1));
             System.out.println(Math.max(n3,n2));
             System.out.println(Math.max(n2,n1));
             System.out.println(Math.min(n2,n1));


         }
    }
}

