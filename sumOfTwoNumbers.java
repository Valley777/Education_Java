import java.util.Scanner;
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()); //начало на интервала
        int m = Integer.parseInt(scan.nextLine()); //край на интервала
        int magicNum= Integer.parseInt(scan.nextLine()); //търсено число
        int sum = 0 ; // counter
        int num1=0; //nachalo
        int num2=0; //kraj
        boolean notFound  = (false);
        for (int i=n;i<=m;i++){
            for (int j=n;j<=m;j++){
                sum++;
              if((i+j)==magicNum) {
                  num1 = i;
                  num2 = j;
                  System.out.printf("Combination N:%d (%d + %d = %d)",sum, num1,num2,magicNum);
                  return; //!
              }else{
               notFound = true;
             }
     }
            }
       if(notFound) {
           System.out.printf("%d combinations - neither equals %d", sum, magicNum);
       }
    }}


