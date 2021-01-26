import java.util.Scanner;

public class cf1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
           int n = sc.nextInt();
           if(n%4 == 0) {
               System.out.println("YES");
               for(int i=1; i<=n/2; i++) System.out.print(i*2 + " ");
               for(int i=1; i<n/2; i++) System.out.print(i*2-1 + " ");
               //By comparing coefficients excluding the last number
               //inside the even part, LHS has (n/2 -1) more than RHS
               //thus the last missing odd number is n + n/2 - 1
               System.out.println(n + n/2 -1);
           }
           else System.out.println("NO");
        }
    }
}