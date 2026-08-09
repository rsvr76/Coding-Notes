import java.util.*;
public class tlon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                    System.out.print(2*j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 
Output

2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10   

*/
