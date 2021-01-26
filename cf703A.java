import java.util.Scanner;

public class cf703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mc = 0;

        while(n-- > 0) {
            int m = sc.nextInt();
            int c = sc.nextInt();

            if(m > c) mc++;
            if(m < c) mc--;
        }
        sc.close();

        System.out.println(mc>0 ? "Mishka" : (mc<0) ? "Chris" : "Friendship is magic!^^");
    }
}