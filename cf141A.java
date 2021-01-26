import java.util.Arrays;
import java.util.Scanner;

public class cf141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = (sc.next() + sc.next()).toCharArray();
        char[] b = sc.next().toCharArray();
        sc.close();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "YES" : "NO");
    }
}