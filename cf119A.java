import java.util.Scanner;

public class cf119A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int turn = 0;
        while(n != 0) {
            if(turn%2==0) n-=gcd(a,n);
            else n-=gcd(b,n);
            turn++;
        }
        if(turn%2==1) System.out.println("0");
        else System.out.println("1");
    }

    public static int gcd(int x, int y) {
        int z = x%y;
        if(z==0) return y;
        else return gcd(y, z);
    }
}