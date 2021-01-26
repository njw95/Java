import java.util.Scanner;

public class cf268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[30];
        int[] g = new int[30];
        int c = 0, i, j;

        for(i=0; i<n; i++) {
            h[i] = sc.nextInt();
            g[i] = sc.nextInt();
        }

        for(i=0; i<n; i++) {
            for(j=0; j<n; j++) {
                if(i!=j && h[i]==g[j]) c++;
            }
        }
        sc.close();
        System.out.println(c);
    }
}