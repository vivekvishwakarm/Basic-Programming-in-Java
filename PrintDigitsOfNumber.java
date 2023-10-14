import java.util.Scanner;

public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        // Print Digits of a number (Left -> Right)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp != 0)
        {
            temp = temp/10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        while (div != 0)
        {
            int q = num/div;
            System.out.print(q + " ");
            num = num % div;
            div = div / 10;
        }
    }
}
