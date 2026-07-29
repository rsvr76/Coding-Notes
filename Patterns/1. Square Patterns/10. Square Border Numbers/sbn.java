import java.util.*;
public class sbn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int num=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.printf("%3d" ,num); // for output
                }else{
                    System.out.print("   ");
                }
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Output

  1  2  3  4  5
  6          10
 11          15
 16          20
 21 22 23 24 25 

*/