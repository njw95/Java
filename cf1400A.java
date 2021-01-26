import java.util.Scanner;

public class cf1400A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(String.valueOf(s.charAt(n-1)).repeat(n));
        }
        sc.close();
    }
}