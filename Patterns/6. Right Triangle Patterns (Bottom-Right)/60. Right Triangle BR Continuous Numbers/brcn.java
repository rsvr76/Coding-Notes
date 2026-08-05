import java.util.*;
public class brcn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int num=1;

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<i; j++){
                System.out.print("   ");
            }
            // print stars
            for(int j=1; j<=n-i+1; j++){
                System.out.printf("%3d",num);
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output

  1  2  3  4  5
     6  7  8  9
       10 11 12
          13 14
             15 

*/
