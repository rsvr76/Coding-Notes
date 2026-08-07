import java.util.*;
public class ipon{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            // print first half
            for(int j=1; j<=n-i+1; j++){
                System.out.print(2*j-1 + " ");
            }
            // print second half
            for(int j=n-i; j>=1; j--){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

1 3 5 7 9 7 5 3 1 
  1 3 5 7 5 3 1 
    1 3 5 3 1 
      1 3 1 
        1 

*/