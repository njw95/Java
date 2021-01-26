import java.util.Scanner;

public class cf750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        
        //cumulative cost
        int[] dp = new int[] {5, 15, 30, 50, 75, 105, 140, 180, 225, 275};

        for(int i=0; i<10; i++) {
            if(240 - k < dp[i]) {
                System.out.println(Math.min(i, n));
                break;
            }
        }
    }
}