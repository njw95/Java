import java.util.Scanner;
public class cf9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int m = Math.max(y, w);
        if(m==1) System.out.println("1/1");
        else if(m==3) System.out.println("2/3");
        else if(m==4) System.out.println("1/2");
        else if(m==5) System.out.println("1/3");
        else System.out.println(6-m+1 +"/"+ 6);
        sc.close();
    }
}
