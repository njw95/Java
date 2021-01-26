import java.util.Scanner;
public class cf467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;

        while(n-->0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q - p >= 2) c++;
        }
        sc.close();
        System.out.println(c);
    }
}