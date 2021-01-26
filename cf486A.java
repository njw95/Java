import java.math.BigInteger;
import java.util.Scanner;
public class cf486A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println((n%2==0) ? n/2 : ++n/-2 );
    }
}