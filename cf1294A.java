import java.util.Scanner;
public class cf1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int sum = a + b + c + n;
            System.out.println((sum%3!=0 || a > sum/3 || b > sum/3 || c > sum/3 ) ? "NO" : "YES");
        }
        sc.close();
    }
}