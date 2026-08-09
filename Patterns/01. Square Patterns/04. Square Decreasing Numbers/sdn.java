import java.util.*;
public class sdn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=n; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Output

5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/