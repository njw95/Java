import java.util.Arrays;
import java.util.Scanner;

public class cf707A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean color = false;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                char c = sc.next().charAt(0);
                if(c=='C' || c=='M' || c=='Y') {
                    color = true;
                    break;   
                }
            }
        }
        sc.close();
        System.out.println(color ? "#Color" : "#Black&White");
    }
}