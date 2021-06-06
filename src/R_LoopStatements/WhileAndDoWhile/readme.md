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
Create a method called `isEvenNumber` that takes a parameter of type `int`. <br/>
Its purpose is to determine if the argument passed to the method is an even number or not. <br/>
Return true if an even number, otherwise return false. <br/>

### Challenge 2
Modify the while code above. <br/>
Make it also record the total number of even numbers it has found and break once 5 are found and at the end, display the total number of even numbers found.