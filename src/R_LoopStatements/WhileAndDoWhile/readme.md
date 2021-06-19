## While and Do While

When you don't know how many times you want to loop, you use the while statement.

### While statement compare with for statement

While statement.

    int count = 1;

    while (count != 6) {
        System.out.println("While count value is " + count);
        count++; // difference with for loop is that you have to do the counting manually outside the method
    }

For statement.

    for (int i = 1; i != 6; i++) {
        System.out.println("For count value is " + i);
    }

### While statement written differently

    count = 1;

    while (true) { // while(true) means an infinite loop, processing forever
        if (count == 6) { // when we get to 6 we want to break out of the loop
            break;
        }
        System.out.println("While count value is " + count);
        count++;
    }

### This while loop does not work because the expression is equal to the beginning number

    int count2 = 6;
    
    while (count2 != 6) {
        System.out.println("Count value is " + count);
        count++;
    }

### Do while example same as while and for

Do while, advantage that it will always execute at least once.

    count = 1;
    
    do {
        System.out.println("Do while count value was " + count);
        count++;
    } while (count != 6);

### Do while counts from 6 to 100

    count = 6;
    
    do {
        System.out.println("Do-while count value was " + count);
        count++;
    
        if (count > 100) {
            break;
        }
    } while (count != 6);

## Challenges

### Challenge 1

Create a while loop. This while loop should run for as long as and until the counter reaches 10. Each time the counter is incremented it should be printed out.

Given Code.

    public class Counter {
        public static void main(String[] args) {
            int counter = 0;
        }
    }

### Challenge 2

Create a while loop. Make sure to reduce the number of candies.

Given Code.

    public class Candy {
    
        public static void main (String[] args) {
            int numberOfCandies = 22;
    
            // This code is commented out because the code does not compile without modification.
            /*while() { // Add the conditional statement here in the brackets.
                System.out.println("There are still " + numberOfCandies + " candies left over. Time to eat one more.");    
            }*/
    
            System.out.println("The candies are gone.");
        }
    }

### Challenge 3

Create a while loop. This while-loop should run as long as and until the counter reaches 10. Print out only the even numbers!

Given Code.

    public class EvenCounter {
        public static void main(String[] args) {
            int counter = 0;
        }
    }

### Challenge 4

Create a while loop. This while-loop should run as long as and until the counter reaches 10. Print out only the odd numbers!

Given Code.

    public class OddCounter {
        public static void main(String[] args) {            
            int counter = 0;
        }
    }

### Challenge 5

Look at the while loop below. Make sure the while loop stops at line 22.

    public class StopTwentyTwo {
        public static void main(String[] args) {
            int counter = 1;
            while(counter < 100) { // This rule may not be modified
                System.out.println("Number: " + counter);
                counter = counter + 1;
            }
        }
    }