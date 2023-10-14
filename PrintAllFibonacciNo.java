import java.util.Scanner;

public class PrintAllFibonacciNo {
    public static void main(String[] args) {
        //Print all the fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number unto printing the fibonacci number ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i<num; i++)
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
