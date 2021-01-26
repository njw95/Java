import java.util.Scanner;
public class cf266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;
        sc.close();

        for(int i=1; i<n; i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                c++;
            }
        }
        System.out.println(c);
    }
}
