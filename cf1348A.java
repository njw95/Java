import java.util.Scanner;

public class cf1348A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int a=0, b=0;
            for(int i=1; i<(n/2); i++) {
                a += Math.pow(2, i);
            }
            a += Math.pow(2,n);

            for(int i=n/2; i<n; i++) {
                b += Math.pow(2, i);
            }
            System.out.println(a-b);
        }
        sc.close();
    }
}