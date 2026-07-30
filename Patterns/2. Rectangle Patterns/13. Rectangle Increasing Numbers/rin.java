import java.util.*;
public class rin{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();

        for(int i=1; i<=l; i++){
            for(int j=1; j<=b; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Output

1 2 3 4 5 6 7 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 

*/