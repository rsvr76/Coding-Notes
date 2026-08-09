import java.util.*;
public class trrrn{
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
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

Output

        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5    

*/
