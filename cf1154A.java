import java.util.Scanner;

public class cf1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int ma = 0;

        for(int i=0; i<4; i++) {
            x[i] = sc.nextInt();
            ma = Math.max(ma, x[i]); //find max
        }

        sc.close();

        for(int curr : x) {
            if(curr!=ma) System.out.print(ma-curr + " ");
        }
    }
}