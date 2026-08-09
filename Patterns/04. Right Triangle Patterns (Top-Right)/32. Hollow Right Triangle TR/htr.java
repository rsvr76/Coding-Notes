import java.util.*;
public class htr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=i; j++){
                if(i==n || j==1 || i==j){ // write down each iteration & you know why
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

Use (i+j>=n+1) logic for less code & easier understanding.
I only used for loops to strengthen my knowledge in it. 

Output

        * 
      * * 
    *   * 
  *     * 
* * * * *   

*/
