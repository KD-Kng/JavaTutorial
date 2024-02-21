/*Question 1) create the following pattern using the for loop. pattern is:
        *    1
        **   21
        ***
        ****
        ***** */
public class Loop {

    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

