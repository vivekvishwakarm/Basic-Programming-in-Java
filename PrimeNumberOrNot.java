import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        // Check your entered number is prime or not
        Scanner sca = new Scanner(System.in);
        int t = sca.nextInt();

        for (int i=0; i<t; i++)
        {
            int n = sca.nextInt();
            int count = 0;


            for (int div = 2; div < n; div++)
            {
                if(n%div == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
        }
    }
}
