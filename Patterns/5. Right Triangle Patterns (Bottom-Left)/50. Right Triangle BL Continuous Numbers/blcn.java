import java.util.*;
public class blcn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int num=1;

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
                System.out.printf("%3d",num); 
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

  1  2  3  4  5
  6  7  8  9
 10 11 12
 13 14
 15  

*/