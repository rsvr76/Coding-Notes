import java.util.*; // * imports all necessary functions including Scanner
public class _05_if_else {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You are Eligible to Vote");
        }else if(age==18){
            System.out.println("You are Eligible to vote");
        }else{
            System.out.println("You are not Eligible to vote");
        }

        sc.close();
    }
}

/* Output:

Enter your age: 18
You are Eligible to vote

 */
