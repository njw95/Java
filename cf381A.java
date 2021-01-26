import java.util.Scanner;

public class cf381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int s = 0; //score
        int d = 0; //score
        int l = 0; //left index
        int r = n-1; //right index
        int curr = 0; //current largest
        int i = 0; //count number of moves

        while(i != n) {
            if(a[l] > a[r]) curr = a[l++];
            else curr = a[r--];
            if(i%2==0) s += curr;
            else d += curr;
            i++; //next step
        }
        System.out.println(s + " " + d);
    }
}