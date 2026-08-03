import java.util.*;
public class bldn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){ 
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5  

*/