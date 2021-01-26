import java.util.Scanner;
public class cf1433A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            int len = s.length();
            int num = s.charAt(0) - '0';
            int sol = (num-1)*10 + (len*(len+1)/2);
            System.out.println(sol);
        }
        sc.close();
    }
}