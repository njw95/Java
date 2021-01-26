import java.util.Scanner;
public class cf266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        sc.close();

        while(t-- > 0) {
            s = s.replace("BG", "GB");
        }
        System.out.println(s);
    }
}