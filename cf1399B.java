import java.util.Scanner;

public class cf1399B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
            long moves = 0;

            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                minA = Math.min(minA, a[i]);
            }
            for(int i=0; i<n; i++) {
                b[i] = sc.nextInt();
                minB = Math.min(minB, b[i]);
            }
            for(int i=0; i<n; i++) {
                moves += Math.max(a[i] - minA, b[i] - minB);
            }
            System.out.println(moves);
        }
    }
}