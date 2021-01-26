import java.util.Scanner;

public class cf1389A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int l = sc.nextInt(); //diff between l and r must be greater than l
            int r = sc.nextInt(); //else we can never find lcm between l and r
            System.out.println((r-l < l) ? "-1 -1" : l + " " + 2*l );
        }
        sc.close();
    }
}