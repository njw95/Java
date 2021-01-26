import java.util.Scanner;
public class cf791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //L Weight
        int b = sc.nextInt(); //B weight
        sc.close();
        int i = 1;
        
        while(a*Math.pow(3,i) <= b*Math.pow(2,i)) {
            i++;
        }
        System.out.println(i);
    }
}