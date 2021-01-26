import java.util.Arrays;
import java.util.Scanner;

public class cf1399A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean s;

        while(t-- > 0) {
            s = true; //assume solution is valid first
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            for(int i=1; i<n; i++) {
                if(a[i] - a[i-1] > 1 ) {
                    s = false;
                    break;
                }
            }
            System.out.println(s ? "YES" : "NO");
        }
    }
}