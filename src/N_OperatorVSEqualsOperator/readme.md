## Operator = vs Equals Operator ==

### Example #1

What's wrong with this code.

    int newValue = 50;
    if (newValue = 50){
        System.out.println("This is an error");
    }

You get an error message, because at the if statement it says `=` instead of `==`.

Correct code.

    int newValue = 50;
    if (newValue == 50) {
        System.out.println("This is true");
    }

### Example #2

What's wrong with this code.

    boolean isCar = false;
    if (isCar = true) {
        System.out.println("This is not supposed to happen");
    }

You don't get an error + the code is running while it's not correct. <br/>
This is due to `boolean`, which is connected to true or false. When it says `=` it always turns it. When it says `==` it checks if it's `true`.

Correct code.

    boolean isCar2 = false;
    if (isCar2 == true) {
        System.out.println("This is right");
    }
