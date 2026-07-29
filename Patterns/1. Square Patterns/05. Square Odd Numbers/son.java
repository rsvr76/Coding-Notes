import java.util.*;
public class son{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Output

1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9  

*/