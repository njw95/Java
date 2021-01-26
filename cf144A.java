import java.util.Scanner;
public class cf144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = 0;
        int mi = 101;
        int p=0; //index of first max
        int q=0; //index of last min

        for(int i=0; i<n; i++) {
            int c = sc.nextInt();
            if(c > ma) {
                ma = c;
                p = i; //save index of first instance max
            }
            if(c <= mi) {
                mi = c;
                q = i; //save index of last instance min
            }
        }
        //Only two situation exist, neutral or min is before max
        //for neutral just find index to respective places
        //for min before max, move max first, then move min discounted by 1 step
        System.out.println((p <= q) ? p+n-1-q : p+(n-1-q-1));
        //System.out.println(p+n-q-1-(p>q ? 1 : 0));
    }
}