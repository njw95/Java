import java.util.Scanner;

public class cf1325A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int x = sc.nextInt();
            System.out.println("1 " + (x-1));
        }
        sc.close();
    }
}