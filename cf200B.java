import java.util.Scanner;
public class cf200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for(int i=0; i<n; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum/n);
    }
}