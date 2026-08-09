import java.util.*;
public class fdcn{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int num=1,row=1;

        for(int i=1; i<=2*n-1; i++){
            if(i<=n){
                row = i;
            }else{
                row = 2*n-i;
            }
            // print spaces
            for(int j=1; j<=n-row; j++){
                System.out.print("   ");
            }
            // print first half
            for(int j=1; j<=row; j++){
                System.out.printf("%3d",num);
                num++;
            }
            // print second half
            for(int j=row-1; j>=1; j--){
                System.out.printf("%3d",num);
                num++;
            }
            System.out.println();
        }
        
    }
}

/*
Output

        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
  1 2 3 4 3 2 1 
    1 2 3 2 1 
      1 2 1 
        1 

*/