import java.util.*;
public class rbn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();

        int num=1;

        for(int i=1; i<=l; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==l || j==1 || j==b){
                    System.out.printf("%3d",num);
                }else{
                    System.out.print("   ");
                }
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Output

  1  2  3  4  5  6  7
  8                14
 15                21
 22                28
 29 30 31 32 33 34 35  

*/