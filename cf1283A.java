import java.util.Scanner;

public class cf1283A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int hh = sc.nextInt();
            int mm = sc.nextInt();
            System.out.println(1440 - (hh*60 + mm));
        }
        sc.close();
    }
}