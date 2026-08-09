import java.util.*;
public class hdn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){

            int row = Math.min(i,2*n-i);
            
            // print spaces
            for(int j=1; j<=row-1; j++){
                System.out.print("  ");
            }
            // print first half
            for(int j=n; j>=row; j--){
                System.out.print(j + " ");
            }
            // print second half
            for(int j=row+1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

5 4 3 2 1 2 3 4 5 
  5 4 3 2 3 4 5 
    5 4 3 4 5 
      5 4 5 
        5 
      5 4 5 
    5 4 3 4 5 
  5 4 3 2 3 4 5 
5 4 3 2 1 2 3 4 5 


*/