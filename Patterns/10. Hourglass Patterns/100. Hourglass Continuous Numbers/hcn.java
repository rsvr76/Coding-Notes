import java.util.*;
public class hcn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int num=1;

        for(int i=1; i<=2*n-1; i++){

            int row = Math.min(i,2*n-i);
            
            // print spaces
            for(int j=1; j<=row-1; j++){
                System.out.print("   ");
            }
            // print first half
            for(int j=1; j<=n-row+1; j++){
                System.out.printf("%3d",num);
                num++;
            }
            // print second half
            for(int j=n-row; j>=1; j--){
                System.out.printf("%3d",num);
                num++; 
            }
            System.out.println();
        }
    }
}

/*
Output

  1  2  3  4  5  6  7  8  9
    10 11 12 13 14 15 16
       17 18 19 20 21
          22 23 24
             25
          26 27 28
       29 30 31 32 33
    34 35 36 37 38 39 40
 41 42 43 44 45 46 47 48 49


*/