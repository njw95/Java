import java.util.Arrays;
import java.util.Scanner;

public class cf758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int s = 0;
        
        for(int i=0; i<n; i++) {
            a[i] =  sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);

        for(int i=n-2; i>=0; i--) {
            s += (a[n-1] - a[i]);
        }
        System.out.println(s);
    }
}