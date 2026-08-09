import java.util.*;
public class bren{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=n-i+1; j++){
                System.out.print(2*j + " ");
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

2 4 6 8 10 
  2 4 6 8 
    2 4 6 
      2 4 
        2    

*/
