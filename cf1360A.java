import java.util.Scanner;

public class cf1360A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;

        while(t-- > 0) {
            a = sc.nextInt(); //length or width
            b = sc.nextInt(); //length or width
            System.out.println((int)Math.pow(Math.max(Math.min(a,b)*2, Math.max(a,b)),2));
        }
    }
}