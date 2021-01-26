import java.util.Arrays;
import java.util.Scanner;
public class cf1385A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int[] num = new int[3];
            num[0] = sc.nextInt();
            num[1] = sc.nextInt();
            num[2] = sc.nextInt();
            Arrays.sort(num);
            if(num[1] != num[2]) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.println("1 " + num[0] + " " + num[2]); //Solution accepts any permutation
            }
        }
        sc.close();
    }
}