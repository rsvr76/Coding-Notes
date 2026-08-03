import java.util.*;
public class trdn{
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
            for(int j=n; j>=n-i+1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

Output

        5 
      5 4 
    5 4 3 
  5 4 3 2 
5 4 3 2 1   

*/
