import java.util.Scanner;

public class cf1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n, s, i, clone;

        while(t-- > 0) {
            n = sc.nextInt();
            clone = n;
            s = 0;
            i = 1;

            while(clone!=0) {
                if(clone%10 != 0) s++; //min number of summand
                clone /= 10;
            }
            System.out.println(s);
            while(n!=0) {
                if(n%10!=0) System.out.print(n%10 * i + " ");
                n/=10;
                i*=10;
            }
            System.out.println();
        }
    }
}