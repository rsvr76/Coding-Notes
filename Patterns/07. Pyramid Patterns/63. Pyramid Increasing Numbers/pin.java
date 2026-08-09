import java.util.*;
public class pin{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // print first half
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            // print second half
            for(int j=i-1; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

*/