import java.util.Scanner;
public class cf61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        for(int i=0; i<a.length(); i++) {
            System.out.print((a.charAt(i)-'0') ^ (b.charAt(i)-'0'));
        }
    }
}