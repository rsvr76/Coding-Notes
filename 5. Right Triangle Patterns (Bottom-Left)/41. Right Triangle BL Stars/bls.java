import java.util.*;
public class bls{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

* * * * * 
* * * * 
* * * 
* * 
* 

*/