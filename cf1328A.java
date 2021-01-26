import java.util.Scanner;

public class cf1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;

        while(t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println((b-(a%b))%b);
        }
        sc.close();
    }
}