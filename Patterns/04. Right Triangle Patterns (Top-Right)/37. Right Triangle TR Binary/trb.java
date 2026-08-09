import java.util.*;
public class trb{
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
                System.out.print(j%2 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

Output

        1 
      1 0 
    1 0 1 
  1 0 1 0 
1 0 1 0 1   

*/
