import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int sum = 0;
 /* Possible solution:
  -  calculating 1 to 9 Factorial numbers -
 -   read the number as char using for Loop and add to each corresponding number value
 -   sum it up and then to evaluate result and print it out:
 Factorial numbers:
     1 = 1
     2 = 2*1 = 2
     3 = 3*2*1 = 6
     4 = 4*3*2*1 = 24
     5 = 5*4*3*2*1 = 120
     6 = 6*5*4*3*2*1= 720
     7 = 7*6*5*4*3*2*1= 5040
     8 = 8*7*6*5*4*3*2*1= 40320
     9 = 9*8*7*6*5*4*3*2*1= 362880
    */
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                sum += 1;
            } else if (n.charAt(i) == '2') {
                sum += 2;
            } else if (n.charAt(i) == '3') {
                sum += 6;
            } else if (n.charAt(i) == '4') {
                sum += 24;
            } else if (n.charAt(i) == '5') {
                sum += 120;
            } else if (n.charAt(i) == '6') {
                sum += 720;
            } else if (n.charAt(i) == '7') {
                sum += 5040;
            } else if (n.charAt(i) == '8') {  //+1
                sum += 40321;
            } else if (n.charAt(i) == '9') {
                sum += 362880;
            }
        }
      //converting sum to String compare both numbers and print result
       // System.out.println( sum);  //checks for the sum



        String str1 = Integer.toString(sum);
       // System.out.println(str1);  //checks for the conversion
       // System.out.println(n);    //initial value

       if(str1.equals(n)){
           System.out.println("yes");
       }
       if(!str1.equals(n)){
           System.out.println("no");
       }


    }}
