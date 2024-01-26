import java.util.Scanner;

/*Question 2) Take marks for 6 subjects and then find the average of their marks.
Then assign a grade to that student based on the average mark from the table below :
        90+ = A+
        85-90 = A
        79-85 = A-
        71-79 = B+
        60-71 = B-
        51-60 = B
        Below = Fail
        Test this for 5 students each having 6 subjects.
        Print the average and grade of each student.
        At last find and print the student who got the third highest grade for average marks.
*/
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int i =0;

            while(i<5) {
                System.out.println("Enter your Maths marks here");
                int maths = sc.nextInt();

                System.out.println("Enter your Social Studies marks here");
                int sst = sc.nextInt();

                System.out.println("Enter your Hindi marks here");
                int hindi = sc.nextInt();

                System.out.println("Enter your Chemistry marks here");
                int chem = sc.nextInt();

                System.out.println("Enter your Physics marks here");
                int phy = sc.nextInt();

                System.out.println("Enter your Bio marks here");
                int bio = sc.nextInt();

                int avg = (maths + sst + hindi + chem + phy + bio) / 6;
                System.out.println("Average marks" + avg);

                if (avg > 90) {
                    System.out.println("Grade is A+");
                } else if (avg < 90 && avg > 85) {
                    System.out.println("Grade is A");
                } else if (avg < 85 && avg > 79) {
                    System.out.println("Grade is A-");
                } else if (avg < 79 && avg > 71) {
                    System.out.println("Grade is B+");
                } else if (avg < 71 && avg > 60) {
                    System.out.println("Grade is B");
                } else if (avg < 60 && avg > 51) {
                    System.out.println("Grade is B-");
                } else {
                    System.out.println("Fail");
                }
                i++;
            }
    }
}
