import java.util.Scanner;

/* Question 1) Check whether a number is single digit, double digit or three digit number
and then print if it's single, double or three digit number.
If the number has more than 3 digits then print "invalid number".
If the number is negative, then also print "Invalid number".
You can create a variable and then assign any value of your choice and then ToLearn on that number.
*/
public class Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int counter = 0;
//        x = 10//10
        if (x<0)
        {
            System.out.println("Number is Invalid");
        } else if (x==0) {
            System.out.println("Number is 1 digit long");
        } else {
            while (x > 0) {
                counter++;
                x = x / 10;
            }
            System.out.println("x is " + counter + " digit long");
        }

    }

}
