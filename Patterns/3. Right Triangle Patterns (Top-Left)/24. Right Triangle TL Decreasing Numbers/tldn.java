import java.util.*;
public class tldn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){              // Also Possible
            for(int j=n; j>n-i; j--){         // for(j=1;j<=i;j++)
                  System.out.print(j + " ");  // cout<<n-j+1
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 
Output

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1    

*/
