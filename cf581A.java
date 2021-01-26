import java.util.Scanner;

public class cf581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(Math.min(a,b) + " " + (a+b - 2*Math.min(a,b))/2);
    }
}