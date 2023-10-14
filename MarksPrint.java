import java.util.Scanner;

public class MarksPrint {
    public static void main(String[] args) {
        /*
        1. You are given an input makes of a student
        2. Display an appropriate message vase on th following rules
        2.1 For marks above 90, print Excellent
        2.2 For marks above 80 and less than and equal to 90, print good
        2.3 For marks above 70 and less than and equal to 80, print fair
        2.4 For marks above 60 and less than and equal to 70, print meets expectation
        2.5 For marks less than and equal to 60, print below par
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if(marks > 90)
        {
            System.out.println("Excellent");
        } else if (marks > 80 && marks <=90 ) {
            System.out.println("Good");

        }else if (marks > 70 && marks <=80 ) {
            System.out.println("Fair");

        }else if (marks > 60 && marks <=70 ) {
            System.out.println("Meets Expectation");
        }else if (marks <=60 ) {
            System.out.println("Below Par");
        } else {
            System.out.println("You're not entered marks");
        }
    }
}
