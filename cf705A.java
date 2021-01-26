import java.util.Scanner;
public class cf705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print("I hate");

        for(int i=1; i<n; i++) {
            System.out.print(((i&1)==1) ? " that I love" : " that I hate");
        }
        System.out.print(" it");
    }
}