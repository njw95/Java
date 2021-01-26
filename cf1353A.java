import java.util.Scanner;

public class cf1353A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt(); //length
            int m = sc.nextInt(); //sum
            System.out.println(Math.min(2, n-1) * m);
        }
        sc.close();
    }
}