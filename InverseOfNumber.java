import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        // Find inverse of a number like 21453 -> 23154
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sca.nextInt();
        int inv = 0;
        int op = 1;
        while(num != 0)
        {
            int od = num % 10;
            int id = op;
            int ip = od;

            // make change to inv using ip and id
            inv = inv + id * (int)Math.pow(10,ip-1);

            num = num / 10;
            op++;
        }
        System.out.println("Inverted Number is: "+inv);
    }
}
