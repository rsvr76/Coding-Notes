import java.util.*;
public class sasan{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j%2!=0){
                    System.out.print("* ");
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Output

* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 

*/