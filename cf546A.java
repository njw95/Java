import java.util.Scanner;

public class cf546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //price of first banana
        int n = sc.nextInt(); //initial cash he has
        int w = sc.nextInt(); //num of banana he wants
        sc.close();
        double tc = (w/2.0) * (2*k + (w-1)*k);
        System.out.println(tc>n ? (int)(tc-n) : 0);
    }
}
