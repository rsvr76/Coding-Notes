import java.util.*;
public class blon{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
                System.out.print(2*(j-i+1)-1 + " "); // write each iteration & you know why
            }
            System.out.println();
        }

        sc.close();
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

1 3 5 7 9 
1 3 5 7 
1 3 5 
1 3 
1  

*/