import java.util.*;
public class pa{
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
                System.out.print((char)('A'+j-1) + " ");
            }
            // print second half
            for(int j=i-1; j>=1; j--){
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

*/