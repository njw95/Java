import java.util.Scanner;

public class cf116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, ma = 0;
        while(n-->0) {
            c -= sc.nextInt();
            c += sc.nextInt();
            ma = Math.max(ma, c);
        }
        sc.close();
        System.out.println(ma);
    }
}
