import java.util.Scanner;
public class cf1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;

        while(n-- > 0) {
            c += sc.nextInt();
        }
        sc.close();
        System.out.print(c>0 ? "HARD" : "EASY");
    }
}