import java.util.*;
public class ha{
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
            for(int j=1; j<=n-row+1; j++){
                System.out.print((char)('A'+j-1) + " ");
            }
            // print second half
            for(int j=n-row; j>=1; j--){
                System.out.print((char)('A'+j-1) + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

A B C D E D C B A 
  A B C D C B A 
    A B C B A 
      A B A 
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A  


*/