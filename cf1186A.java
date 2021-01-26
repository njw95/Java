import java.util.Scanner;

public class cf1186A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        System.out.println(Math.min(m, k) < n ? "No" : "Yes");
    }
}