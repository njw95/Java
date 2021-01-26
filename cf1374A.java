import java.util.Scanner;

public class cf1374A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            long n = sc.nextInt();
            //k%x == y
            System.out.println(((n-y)/x)*x +y);
        }
        sc.close();
    }
}