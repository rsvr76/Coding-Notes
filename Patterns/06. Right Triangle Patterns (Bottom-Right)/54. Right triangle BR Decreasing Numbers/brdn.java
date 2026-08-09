import java.util.*;
public class brdn{
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
            for(int j=n; j>=i; j--){
                System.out.print(j + " ");
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

5 4 3 2 1 
  5 4 3 2 
    5 4 3 
      5 4 
        5   

*/
