// Random - Automatically generated an random number based on the range
// It's default range is -2 billion to +2 billion

import java.util.Random;
public class _06_random {
    public static void main(String [] args){
        Random r = new Random(); // creating an Random object and reference variables 'r'

        int number = r.nextInt(); // here, the user is not giving i/p. the random object gives the i/p
        System.out.println(number); // each time the output will be different

        int n1= r.nextInt(1,6); // we are setting a range (x,y) -> y won't be included similar to for loop in python
        System.out.println(n1);

        double n2 = r.nextDouble(1,10);
        System.out.println(n2);

        boolean ram = r.nextBoolean();
        System.out.println(ram);
        
    }
}

/* Output

-662168804
5
8.448670449900487
false

*/
