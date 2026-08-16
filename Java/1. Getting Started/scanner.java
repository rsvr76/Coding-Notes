import java.util.Scanner; // to use Scanner function - to recieve i/p from the user
public class scanner {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // creating a scanner object with Scanner class with reference variable sc


        System.out.print("Enter a Name : ");
        String name = sc.nextLine(); // to store single word, use sc.next(), for more than two words, use sc.nextLine()

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = sc.nextDouble();

        System.out.print("Are you a Student? (true/false)");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is " + gpa);

        if(isStudent){
            System.out.println("You are a Student");
        }else{
            System.out.println("You are not a Student");
        }

        System.out.print("Enter a colour : ");
        sc.nextLine(); // why because, int, double, booelan, has \n by default after the user enters the input, for eg: 76\n, this \n gets consumed by the string input, to avoid this, consume the \n using the sc.nextLine() and receive input string from the user
        String color = sc.nextLine();
        System.out.println("Your colour is " + color);

        sc.close(); // to close the scanner function after it is being used, it's doesn't affect the program usually, but its best to close it
    }    
}

/* Output:

Your name is Vishnu Ram
Your age is 20
Your gpa is 8.22
You are a Student
Your colour is blue

 */