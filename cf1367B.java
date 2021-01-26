import java.util.Scanner;

public class cf1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            //only count odd n even out of place
            int o = 0;
            int e = 0;
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
                if(i%2==0 && a%2!=0) o++;
                else if(i%2==1 && a%2==0) e++;
            }
            System.out.println(o==e ? o : -1);
        }
        sc.close();
    }
}