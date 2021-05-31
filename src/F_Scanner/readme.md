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

step 6: give feedback to the user

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


## Challenge

Write a Java program that takes three numbers as input to calculate and print the average of the numbers.