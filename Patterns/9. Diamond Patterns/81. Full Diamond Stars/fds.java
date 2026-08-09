import java.util.*;
public class fds{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        // pyramid
        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Pyramid
        for(int i=1; i<n; i++){
            // print spaces
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=2*(n-i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *


Another Method using if-else:

    int row=1;

    for(int i=1; i<=2*n-1; i++){
        if(i<=n){
            row = i;
        }else{
            row = 2*n-i;
        }
        // print spaces
        for(int j=1; j<=n-row; j++){
            System.out.print("  ");
        }
        // print stars
        for(int j=1; j<=2*row-1; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

*/