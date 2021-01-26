import java.util.Scanner;
public class cf110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int c = 0; //count

        while(n>0) {
            if(n%10==4 || n%10==7) c++;
            n/=10;
        }
        
        System.out.println((c==4 || c==7) ? "YES" : "NO");
    }
}