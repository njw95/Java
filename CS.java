import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //scan integer
        String s = sc.next(); //scan until space
        String sl = sc.nextLine(); //scans the whole line including spaces
       
        //String length uses s.length()

        //Scanning in integer inputs
        int n = 5; //if we know the size
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        //Reverse a string and check if same code = edoc
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder(b);
        b = sb.reverse().toString(); //b is now reversed
        System.out.println(a.equals(b)); //check if equals

        //Compare string lexicographically ignoring upper/lowercase
        String s1 = sc.next();
        String s2 = sc.next();
        int sol = s1.compareToIgnoreCase(s2); //0 if same, -1 if s1 is before s2, 1 otherwise

        //String to uppercase lowercase
        System.out.println(s1.toUpperCase() + s2.toLowerCase());

        //Char is upper or lowercase after scanning string s2
        int upperCount = 0, lowerCount = 0;
        for(char c : s2.toCharArray()) {
            if(Character.isUpperCase(c)) upperCount++;
            else lowerCount++;
        }

        //Matrix flipping until center, give 5x5 size
        int k = 0;
        int t = sc.nextInt();
        while(t!=1) {
            k++; //count number of 0
            t = sc.nextInt();
        }
        System.out.println(Math.abs(k%2 - 2) + Math.abs(k/5 -2));

        //Sorting a string of number "3+2+1" -> "1+2+3"
        String[] s3 = sc.nextLine().split("\\+");
        Arrays.sort(s3);
        System.out.println(String.join("+", s));

        //Uppercase the first char in a String
        String s4 = sc.next();
        System.out.println(s4.substring(0,1).toUpperCase() + s4.substring(1));

        //Set distinct number of characters
        Set<Character> st = new HashSet<>();
        String s5 = sc.nextLine();
        for(int i=0; i<s5.length(); i++) st.add(s5.charAt(i));
        System.out.println(st.size());

        //distinct number of characters with curly braces s={a,b,c} as input
        for(Character c : s.toCharArray()) {
            if(Character.isLetter(c)) st.add(c); //add into set
        }
        System.out.print(st.size()); //checksize

        //Sum of AP series eg.(2,4,6,8,10)
        int num_ele = sc.nextInt();
        double tc = (num_ele/2.0) * (2*first_term + (num_ele - 1)*first_term);

        //jump 1 to 5 steps at a time, find min steps to reach n
        System.out.println(--n/5 + 1);

        //boy girl swap given string s2
        s2 = s2.replace("BG", "GB"); //let Girl move in front

        //beautiful year, every number is an integer is distinct
        int y = sc.nextInt(); //the year eg 2016
        int a, b, c, d;
        do {
            y++;
            a = y/1000;
            b = (y/100)%10;
            c = (y%100)/10;
            d = y%10;
        }while(a==b || a==c || a==d || b==c || b==d || c==d);
        System.out.print(y); //the next distinct year

        //Magnets 10 and 01, find num of disjoint sections
        int num = sc.nextInt() - 1; //num of magnets minus 1
        int prev = sc.nextInt(); //first magnet
        int g = 1;//disjoint counter

        while(n-- > 0) {
            int curr = sc.nextInt();
            if(curr!=prev) {
                g++;
                prev = curr;
            }
        }
        System.out.println(g);

        //Calculating function -1+2-3+4..... +(-1^n)n
        long n1 = sc.nextLong();
        System.out.println(n%2==0 ? n1/2 : ++n1/-2);

        //insomnia cure, find undivisible
        int k, l, m, n, d, u=0;//where u is unharmed count
        for(int i=1; i<=d; i++) {
            if(i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0) u++;
        }
        System.out.println(d-u);

        //General game where max at first, min at last regardless of other positions 
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


        //Divisibility problem, given 2 integers a and b, each move we can a+=1
        //find minimum num of move to make a divisible by b
        System.out.println((b-(a%b)) % b);

        //Addition, given secret number a,b,c, mixed to create a+b, a+c, b+c, a+b+c
        //find a,b,c
        //Find max, then minus each of the numbers to find remaining 3 numbers

        //Minimum number of bills {1,5,10,20,100} given integer n
        int n = sc.nextInt();
        System.out.println(n/100 + (n%100 /20) + (n%20 /10) + (n%10 /5) + n%5);

        //Add 2 strings, sort compare 2 arrays
        char[] a = (sc.next() + sc.next()).toCharArray();
        char[] b = sc.next().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
        
        //Sum of round numbers (eg 5009 equals to 5000 + 9)
        int t = sc.nextInt();
        int n, s, i, clone;
 
        while(t-- > 0) {
            n = sc.nextInt();
            clone = n;
            s = 0;
            i = 1;
 
            while(clone!=0) {
                if(clone%10 != 0) s++; //min number of summand
                clone /= 10;
            }
            System.out.println(s);
            while(n!=0) {
                if(n%10!=0) System.out.print(n%10 * i + " ");
                n/=10;
                i*=10;
            }
            System.out.println();

            //cumulative cost, questions before midnight
            int[] dp = new int[] {5, 15, 30, 50, 75, 105, 140, 180, 225, 275};
    
            for(int i=0; i<10; i++) {
                if(240 - k < dp[i]) {
                    System.out.println(Math.min(i, n));
                    break;
                }
            }
        }

        //two integer , obtain b from a, in each move a+=k or a-=k where k =[1 to 10];
        //find min number of moves
        System.out.println((Math.abs(a-b) + 9) / 10 );


        //shovel
        int k = sc.nextInt(); //price
        int r = sc.nextInt(); //1-coins
        sc.close();
        int m = 1;
 
        while(true) {
            if((m*k)%10==0 || (m*k -r)%10==0) {
                System.out.println(m);
                break;
            }
            m++;
        }

        //Create array first half are all even, second half all odd
        //total sum on each half must be the same
        int t = sc.nextInt();
 
        while(t-- > 0) {
           int n = sc.nextInt();
           if(n%4 == 0) {
               System.out.println("YES");
               for(int i=1; i<=n/2; i++) System.out.print(i*2 + " ");
               for(int i=1; i<n/2; i++) System.out.print(i*2-1 + " ");
               //By comparing coefficients excluding the last number
               //inside the even part, LHS has (n/2 -1) more than RHS
               //thus the last missing odd number is n + n/2 - 1
               System.out.println(n + n/2 -1);
           }
           else System.out.println("NO");
        }

        //eat candies
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
            long moves = 0;
 
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                minA = Math.min(minA, a[i]);
            }
            for(int i=0; i<n; i++) {
                b[i] = sc.nextInt();
                minB = Math.min(minB, b[i]);
            }
            for(int i=0; i<n; i++) {
                moves += Math.max(a[i] - minA, b[i] - minB);
            }
            System.out.println(moves);
        }

        //Required remainder
        while(t-- > 0) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            long n = sc.nextInt();
            //k%x == y
            System.out.println(((n-y)/x)*x +y);
        }
        sc.close();
        
        //unstable array
        while(t-- > 0) {
            int n = sc.nextInt(); //length
            int m = sc.nextInt(); //sum
            System.out.println(Math.min(2, n-1) * m);
        }

        //sum prime
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/2);
        System.out.println(n%2==0? "2 ".repeat(n/2) : "2 ".repeat((n-2)/2) + "3".repeat(n%2));

    }
}
