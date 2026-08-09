import java.util.*;
public class ipcn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int num=1;

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("   ");
            }
            // print first half
            for(int j=1; j<=n-i+1; j++){
                System.out.printf("%3d",num);
                num++;
            }
            // print second half
            for(int j=n-i; j>=1; j--){
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

*/