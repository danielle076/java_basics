## If then else

### Example #1 - if else

    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;
    
If the if-statement is not true then print the else-statement

    if (score < 5000) {
        System.out.println("Your score was less than 5000");
    } else {
        System.out.println("Great job"); // Great job
    }

![img.png](img.png)

### Example #2 - if-elseif-else statement

    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    if (score < 5000 && score > 1000) {
        System.out.println("Your score was less than 5000 but greater than 1000");
    } else if (score < 1000) {
        System.out.println("Your score was less than 1000");
    } else {
        System.out.println("Nice try"); // Nice try
    }

![img_1.png](img_1.png)

### Example #3 - accessing {}

Within the `{}` you can access outside variables...

    if (gameOver == true) {
        int finalScore = score + (levelCompleted * bonus); // 5000 (5 * 100)
        System.out.println("Your final score was " + finalScore); // Your final score was 5500
    }

![img_2.png](img_2.png)

...however, you cannot call a variable within the `{}`, it will give an error.

    int savedFinalScore = finalScore;

![img_3.png](img_3.png)

## Challenge

Create a decision structure (if/else) below.

When someone is older than 17 print the message: "You may buy a state lottery ticket."

When someone is 17 or younger, print the message, "You may not buy a state lottery ticket."

Given code.

    import java.util.Scanner;
    
    public class Lottery {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
    
            System.out.println("What is your age?");
            int userAge = userInput.nextInt();    
        }
    }

## Challenge2

In the Netherlands, you are allowed to buy alcoholic beverages from the age of 18. However, you must be able to show ID until you are 25.

In the terminal the user has entered his age. It is up to you to print the following messages:
- When the user is under 18: You are not allowed to buy alcohol.
- When the user is 25 or older: You may purchase alcohol without restrictions.
- When the user is between 18 and 25: You may buy alcohol, but you must show your ID.

Create the decision structure (if/else if/else) with the given code below.

    import java.util.Scanner;
    
    public class AgeVerification {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
    
            System.out.println("What is your age?");
            int givenAge = userInputScanner.nextInt();            
        }
    }

## Challenge3

In the console, the user has entered their gender. Using a decision tree (if/else), print the following messages:
- When the user is a man: Hello sir.
- When the user is a woman: Hello madam.
- In all other cases: Hello person.

Bonus: Can you manage to make the code so that capital letters are ignored?

    import java.util.Scanner;
    
    public class Gender {
        public static void main(String[] args) {
            Scanner userInputScanner = new Scanner(System.in);
    
            System.out.println("What is your gender?");
            String gender = userInputScanner.nextLine();           
        }
    }

## Challenge4

Below is the purchase amount entered. The idea is that you determine the discount and calculate the new amount.

If the amount entered is below 75, the customer will not receive a discount. Print out: "The customer will not receive a discount. The purchase amount remains -HERE THE AMOUNT-"

When the amount entered is 75.00 or higher, but less than or equal to 300.00 the customer will receive a 10% discount. Print out: "The customer receives a 10% discount. The purchase amount is now: -HERE'S THE DISCOUNT-"

If the amount entered is 300.01 or higher, the customer will receive a 16% discount. Print out: "The customer receives a 16% discount. The purchase amount is now: -HERE'S THE DISCOUNT-"

    import java.util.Scanner;
    
    public class Discount {
        public static void main(String[] args) {
            Scanner userInputScanner = new Scanner(System.in);
        
                System.out.println("What is the purchase amount?");
                double purchaseAmount = userInputScanner.nextDouble();
        }
    }