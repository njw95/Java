import java.util.Scanner;

public class cf151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //num friends
        int k = sc.nextInt(); //num bottles
        int l = sc.nextInt(); //volume in each bottle
        int c = sc.nextInt(); //num lime
        int d = sc.nextInt(); //num of slice per lime
        int p = sc.nextInt(); // total gram of salt
        int nl = sc.nextInt(); //each drink needs this volume
        int np = sc.nextInt(); //each drink needs this gram of salt
        sc.close();
        System.out.println(Math.min(Math.min(k*l/nl, c*d), p/np) / n);
    }
}