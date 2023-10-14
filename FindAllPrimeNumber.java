import java.util.Scanner;

public class FindAllPrimeNumber {
    public static void main(String[] args) {
        // Print weather the supplied rang of numbers is prime or not
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int n = low; n <= high; n++)
        {
            int count = 0;
            for(int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
                if(count ==0)
                {
                    System.out.println(n);
                }
            }
        }

    }

