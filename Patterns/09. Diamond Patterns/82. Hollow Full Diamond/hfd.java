import java.util.*;
public class hfd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                if(i+j==n+1 || j-i==n-1 || i-j==n-1 || i+j==3*n-1){
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
*               * 
  *           *   
    *       *     
      *   *       
        *   

Another approach using an extra vaiable row

    for(int i=1; i<=2*n-1; i++){

        int row = Math.min(i,2*n-i);

        for(int j=1; j<=2*n-1; j++){
            if(row+j==n+1 || j-row==n-1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

*/