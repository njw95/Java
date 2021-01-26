import java.util.Scanner;
public class cf112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        int sol = s1.compareToIgnoreCase(s2);
        System.out.println(sol < 0 ? -1 : (sol > 0 ? 1 : 0));
    }
}