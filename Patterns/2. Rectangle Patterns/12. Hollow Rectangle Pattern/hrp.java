import java.util.*;
public class hrp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();

        for(int i=1; i<=l; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==l || j==1 || j==b){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Output

* * * * * * * 
*           * 
*           * 
*           * 
* * * * * * *  

*/