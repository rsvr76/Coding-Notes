import java.util.*;
public class fda{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

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
            // print first half
            for(int j=1; j<=row; j++){
                System.out.print((char)('A'+j-1)+ " ");
            }
            // print second half
            for(int j=row-1; j>=1; j--){
                System.out.print((char)('A'+j-1) + " ");
            }
            System.out.println();
        }
        
    }
}

/*
Output

        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
  A B C D C B A 
    A B C B A 
      A B A 
        A

*/