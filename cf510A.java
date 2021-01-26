import java.util.Scanner;

public class cf510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //num row
        int m = sc.nextInt(); //num column
        sc.close();
        String hexes = "#".repeat(m);
        String dothex = ".".repeat(m-1) + "#";
        String hexdot = "#"+ ".".repeat(m-1);
        Boolean atEnd = true;

        for(int i=0; i<n; i++) {
            if(i%2==0) System.out.println(hexes);
            else {
                System.out.println(atEnd ? dothex : hexdot);
                atEnd = !atEnd;
            }
        }
    }
}