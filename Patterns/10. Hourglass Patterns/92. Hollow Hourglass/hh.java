import java.util.*;
public class hh{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){

            int row = Math.min(i,2*n-i);

            for(int j=1; j<=2*n-1; j++){
                if(row==j || row==1 || row+j==2*n){
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

* * * * * * * * * 
  *           *   
    *       *     
      *   *       
        *         
      *   *       
    *       *     
  *           *   
* * * * * * * * *   

*/