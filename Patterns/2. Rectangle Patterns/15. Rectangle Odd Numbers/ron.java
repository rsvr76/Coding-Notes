import java.util.*;
public class ron{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();

        for(int i=1; i<=l; i++){
            for(int j=1; j<=b; j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Output

1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13   

*/