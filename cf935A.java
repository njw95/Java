import java.util.Scanner;

public class cf935A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = 0;
        
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) ans++; //find divisors
        }
        System.out.println(ans);
    }
}