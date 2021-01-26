import java.util.Scanner;
public class cf1372A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            System.out.println("1 ".repeat(n));
        }
        sc.close();
    }
}
