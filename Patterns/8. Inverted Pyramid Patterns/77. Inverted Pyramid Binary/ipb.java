import java.util.*;
public class ipb{
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
                System.out.print(j%2 + " ");
            }
            // print second half
            for(int j=n-i; j>=1; j--){
                System.out.print(j%2 + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

1 0 1 0 1 0 1 0 1
  1 0 1 0 1 0 1
    1 0 1 0 1
      1 0 1
        1 

*/