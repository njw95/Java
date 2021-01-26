import java.util.Scanner;

public class cf492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0; //height
        int t = 0; //total cubes so far

        while(t <= n) {
            h++;
            t += h*(h+1)/2;
        }
        System.out.println(h-1);
    }
}