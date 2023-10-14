import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        // Count how many of digits of number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to knowing how many of number there... ");
        long num = sc.nextInt();
        int count = 0;
        while (num>0)
        {

            num = num/10 ;
            count++;

        }
        System.out.println(count);
    }
}
