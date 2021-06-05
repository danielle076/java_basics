## Scanner (Java User Input)

The Scanner class is used to get user input, and it is found in the `java.util` package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.

### Input types

- `next()` Reads every value from the user
- `nextBoolean()` Reads a boolean value from the user
- `nextByte()` Reads a byte value from the user
- `nextDouble()` Reads a double value from the user
- `nextFloat()` Reads a float value from the user
- `nextInt()` Reads a int value from the user
- `nextLine()` Reads a String value from the user
- `nextLong()` Reads a long value from the user
- `nextShort()`	Reads a short value from the user

### Example #1 - let a user type in a number and give the number back

Step 1: make a variable and gives it a value of 0 (default value).

    int number = 0;

Step 2: ask the user to enter something.

    System.out.println("Geef een nummer invoer op");

Step 3: include the user's input into the program by using Scanner. (this is a standard sentence).

    Scanner userInteraction = new Scanner(System.in);

Step 4: use the variable from Scanner and ask the user to type in a number. (when typing in abc, the system crashes). With `nextInt` you ask what you expect from the user.

    userInteraction.nextInt();

Step 5: we want the value of `number` (which is now 0) to have the value of what the user puts in it (overwrite).

    number = userInteraction.nextInt();

step 6: give feedback to the user.

    System.out.println("Uw invoer was: " + number);

### Example #2 - let a user type in text and give the text back

Step 1: ask the user to enter something.

    System.out.print("Wat is uw naam: ");

Step 2: include the user's input into the program by using Scanner (this is a standard sentence).

    Scanner userInteraction = new Scanner(System.in);

Step 3: use the variable from Scanner and ask the user to type something. We made a String right away, we could also have made a separate String.

    String userName = userInteraction.next();

Step 4: give feedback to user.

    System.out.println("Uw naam is: " + userName);

### Example #3 user input birth year and name

<i>UserInput.java</i>

Step 1: `scanning`: the variable we are going to use. `new keyword`: we are creating a new object of type scanner. `System.in`: allows you to put info into the console, which then gets returned back to the program.

    Scanner scanning = new Scanner(System.in);

Step 2: ask to enter their year of birth.

    System.out.println("Enter your year of birth:");

Step 3: what is put in `scanning.nextInt()` by the user is stored in `yearOfBirth`.

    int yearOfBirth = scanning.nextInt();

Step 4: when we relate a number from the scanner, we press the Enter key on the keyboard. Doing that ends the line, and you can not add your name. Recommended after a next enter, to call .nextLine again without assigning it to a variable (applies only to numbers that ends the program)

    scanning.nextLine();

Step 5: ask to enter their name, create a `name` object and calculate the age.

    System.out.println("Enter your name: ");
    String name = scanning.nextLine();
    int age = 2021 - yearOfBirth;

Step 6: give back the name and age.

    System.out.println("Your name is " + name + ", and you are " + age + " years old.");

Step 7: close the scanner after you are done with it.

    scanning.close();

#### Full code UserInput.java

    package F_Scanner.Example3;
    
    import java.util.Scanner;
    
    public class UserInput {
        public static void main(String[] args) {
            Scanner scanning = new Scanner(System.in);
    
            System.out.println("Enter your year of birth:");
            int yearOfBirth = scanning.nextInt();
            scanning.nextLine();
    
            System.out.println("Enter your name: ");
            String name = scanning.nextLine();
            int age = 2021 - yearOfBirth;
    
            System.out.println("Your name is " + name + ", and you are " + age + " years old.");
    
            scanning.close();
        }
    }

### Example #3 user input birth year and name problems and solutions

- what if the user enters a negative number for the year of birth
- what will happen to the user if they enter some letters instead of only numbers

<i>ProblemsAndSolutions.java</i>

Step 1: `has.NextInt` checks to see if the input entered is a number, in this case an Integer.

    Scanner scanning = new Scanner(System.in);
    
    System.out.println("Enter your year of birth:");

    boolean hasNextInt = scanning.hasNextInt();

Step 2: check to see if the boolean `.hasNextInt` is true.

    if (hasNextInt) {
        int yearOfBirth = scanning.nextInt();
        scanning.nextLine();
    
        System.out.println("Enter your name: ");
        String name = scanning.nextLine();
        int age = 2020 - yearOfBirth;
        } else {
            System.out.println("Unable to parse year of birth.");
    }

Step 3: check a valid range: age range of 0 to 100 and if the age is not in that range, error message.

     if (age >= 0 && age <= 100) {
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
     } else {
        System.out.println("Invalid year of birth");
     }

#### Full code ProblemsAndSolutions.java

    package F_Scanner.Example3;
    
    import java.util.Scanner;
    
    public class ProblemsAndSolutions {
        public static void main(String[] args) {
            Scanner scanning = new Scanner(System.in);
    
            System.out.println("Enter your year of birth:");
    
            boolean hasNextInt = scanning.hasNextInt();
    
            if (hasNextInt) {
                int yearOfBirth = scanning.nextInt();
                scanning.nextLine();
    
                System.out.println("Enter your name: ");
                String name = scanning.nextLine();
                int age = 2020 - yearOfBirth;
    
                if (age >= 0 && age <= 100) {
                    System.out.println("Your name is " + name + ", and you are " + age + " years old.");
                } else {
                    System.out.println("Invalid year of birth");
                }
            } else {
                System.out.println("Unable to parse year of birth.");
            }
    
            scanning.close();
        }
    }


## Challenge

Write a Java program that takes three numbers as input to calculate and print the average of the numbers.