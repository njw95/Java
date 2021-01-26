import java.util.Scanner;

public class cf749A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/2);
        System.out.println(n%2==0? "2 ".repeat(n/2) : "2 ".repeat((n-2)/2) + "3".repeat(n%2));
    }
}