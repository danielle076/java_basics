## Logical Operators

- `Logical AND` Operator(`&&`): This operator returns true when both the conditions under consideration are satisfied or are true. If even one of the two yields false, the operator results false.
- `Logical OR` Operator(`||`): This operator returns true when one of the two conditions under consideration are satisfied or are true. If even one of the two yields true, the operator results true. To make the result false, both the constraints need to return false.
- `Logical NOT` Operator(`!`): Unlike the previous two, this is a unary operator and returns true when the condition under consideration is not satisfied or is a false condition. Basically, if the condition is false, the operation returns true and when the condition is true, the operation returns false.

### Examples

`&&` = logical AND <br/>
Both tests need to be true to print the message

    int topScore = 100;
    int secondTopScore = 60;
    if (topScore > secondTopScore && topScore < 110) {
        System.out.println("Greater than second top score and less than 110");
    }

The `()` makes it easier to read the code, and you understand more quickly what it means

    int thirdTopScore = 60;
    if ((topScore > thirdTopScore) && (topScore < 110)) {
        System.out.println("Greater than third top score and less than 110");
    }

`||` = logical OR <br/>
One of the conditions must be true, not both need to be true to print a message

    if ((topScore > 90) || (secondTopScore <= 90)) {
        System.out.println("Either or both of the conditions are true");
    }

`!` = logical NOT<br/>
If a condition is true then logical NOT operator will make false

    int x = 5;
    System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
