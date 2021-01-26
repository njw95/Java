import java.util.Scanner;
public class cf136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[101];

        for(int i=1; i<=n; i++) {
            int p = sc.nextInt(); //person i gives to person p
            a[p] = i; //person p receives from person i
        }
        sc.close();

        for(int i=1; i<=n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}