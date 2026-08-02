import java.util.*;
public class rap{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();

        for(int i=1; i<=l; i++){
            for(int j=1; j<=b; j++){
                System.out.print((char)('A'+j-1) + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}

/*
Output

A B C D E F G 
A B C D E F G 
A B C D E F G 
A B C D E F G 
A B C D E F G  

*/