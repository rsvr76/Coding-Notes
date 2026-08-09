import java.util.*;
public class prrn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // print stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
Output

        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 

Another Method (Matrix form) using if-else:

    System.out.print("Enter a Number : ");
    int p = sc.nextInt();

    for(int i=1; i<=p; i++){
        for(int j=1; j<=2*p-1; j++){
            if(j>=p-i+1 && j<=p+i-1){
                System.out.print(i + " ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

*/