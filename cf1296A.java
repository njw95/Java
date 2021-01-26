import java.util.Scanner;

public class cf1296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, a;

        while (t-- > 0) {
            int sum = 0;
            n = sc.nextInt();
            boolean hasOdd = false, hasEven = false;
            for(int i=0; i<n; i++) {
                a = sc.nextInt();
                sum += a;
                if(a%2==0) hasEven = true;
                else hasOdd = true;
            }
            
            System.out.println(((hasOdd && hasEven) || (sum%2==1)) ? "YES" : "NO");
        }
        sc.close();
    }
}