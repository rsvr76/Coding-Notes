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
            for(int j=i; j>0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

Output

        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1  

*/
