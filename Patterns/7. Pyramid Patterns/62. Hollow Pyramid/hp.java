import java.util.*;
public class hp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1; j++){
                if(i+j==6 || j-i==4 || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
Output

        *         
      *   *       
    *       *     
  *           *   
* * * * * * * * * 

*/