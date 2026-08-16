/*
Primitive - simple value stored directly in memory (stack)
Reference - memory address (stack) that points to the (heap)

Primitive vs Reference
---------    ---------
int          string
double       array
char         object
boolean

*/

public class Variables{
    public static void main(String [] args){
        int age = 5; 
        double year = -20.56; // int with decimals
        char ram = 'V'; // remember char - charizard
        boolean isStudent = true; // boolean contains only true or false

        System.out.println(age);
        System.out.println(year);
        System.out.println(ram);
        System.out.println(isStudent);

        if(isStudent){ // if condition runs if it is true
            System.out.println("You are a Student");
        }else{
            System.out.println("You are not a Student");
        }

        String name = "Vishnu Ram"; // String is a series of characters
        System.out.println("My name is " + name); 

        System.out.print("I am " + name + " and " + age + " years old");

    }
}

/* Output:

5
-20.56
V
true
You are a Student
My name is Vishnu Ram
I am Vishnu Ram and 5 years old

*/