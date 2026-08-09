import java.util.*;
public class ipen{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("   ");
            }
            // print first half
            for(int j=1; j<=n-i+1; j++){
                System.out.printf("%3d",2*j);
            }
            // print second half
            for(int j=n-i; j>=1; j--){
                System.out.printf("%3d",2*j);
            }
            System.out.println();
        }
    }
}

/*
Output

  2  4  6  8 10  8  6  4  2
     2  4  6  8  6  4  2
        2  4  6  4  2
           2  4  2
              2

*/