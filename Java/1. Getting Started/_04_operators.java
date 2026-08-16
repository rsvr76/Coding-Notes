import java.util.Scanner;
public class _04_operators{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x, y = 5; // x have no value, only y has value 5
        x = 10;
        System.out.println(x);
        System.out.println(y);

        x = x+y;
        x+=y; // same as x = x+y, this operator is called Augmented Assignment Operators
        System.out.println(x);

        /* Augmented Assignment Operators
        x+=y, x-=y, x*=y, x/=y, x%=y

        Increment Operator: x++ -> x=x+1
        Decrement Operator: y-- -> y=y-1
        */

        System.out.println(x++);
        System.out.println(y--);

        // Order of Operations: [P-E-M-D-A-S] , from left to right

        double result = 3 + 4 * (7 - 5) / 2.0 ;
        System.out.println(result);

        sc.close();
    }
}

/* Output:

10
5
20
20
5
7.0

 */