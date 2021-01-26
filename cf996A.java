import java.util.Arrays;
import java.util.Scanner;

public class cf996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(n/100 + (n%100 /20) + (n%20 /10) + (n%10 /5) + n%5);
    }
}