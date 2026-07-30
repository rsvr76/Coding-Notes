import java.util.*;
public class rdp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();

        for(int i=1; i<=l; i++){
            for(int j=b; j>=1; j--){ // we are printing j, so don't need to change the order of i
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Output

7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
*/