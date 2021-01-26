import java.util.Scanner;
public class cf41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder(t);
        t =  sb.reverse().toString();
        System.out.println(s.equals(t) ? "YES" : "NO");
    }
}