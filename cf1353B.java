import java.util.Arrays;
import java.util.Scanner;

public class cf1353B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int sum = 0;
            for(int i=0; i<k; i++) {
                sum += Math.max(a[i], b[n-1-i]);
            }
            for(int i=k; i<n; i++) {
                sum += a[i];
            }
            System.out.println(sum);
        }
    }
}