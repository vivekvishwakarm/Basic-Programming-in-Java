import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        //Find reverse of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.print("Reverse number : ");
        while (num != 0)
        {
            int rem = num % 10;
            System.out.print(rem + " ");
            num = num/10;
        }
    }
}
