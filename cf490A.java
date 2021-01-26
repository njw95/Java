import java.util.Scanner;

public class cf490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[4]; //we wont use 0
        int[][] pos = new int[4][5001];

        for(int i=1; i<=n; i++) {
            int t = sc.nextInt(); //1,2,3 prog , math, pe
            count[t]++;
            pos[t][count[t]] = i; //1-indexed position, note 2D start from 1
        }

        int mi = Math.min(count[1], Math.min(count[2], count[3]));
        System.out.println(mi);
        
        for(int i=1; i<=mi; i++) {
            System.out.println(pos[1][i] + " " + pos[2][i] + " " + pos[3][i]);
        }
        sc.close();
    }
}