import java.util.Scanner;

public class cf472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2==0) System.out.println("4 " + (n-4));
        else System.out.println("9 " + (n-9));
    }
}