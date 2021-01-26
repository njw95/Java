import java.util.Scanner;

public class cf263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0;
        int t=sc.nextInt();
        
        while(t!=1) {
            k++;
            t = sc.nextInt();  //abs(9%5 -2) + abs(9/5 - 2)
        }
        System.out.println(Math.abs(k%5 -2) + Math.abs(k/5 -2));
    }
}
