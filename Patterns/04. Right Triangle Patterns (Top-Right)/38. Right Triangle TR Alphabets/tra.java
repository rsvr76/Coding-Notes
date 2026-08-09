import java.util.*;
public class tra{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=i; j++){
                System.out.print((char)('A'+j-1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

Output

        A 
      A B 
    A B C 
  A B C D 
A B C D E    

*/
