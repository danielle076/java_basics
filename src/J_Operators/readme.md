## Operators

Operators are used to perform operations on variables and values.

- `+` Adds together two values x + y
- `-` Subtracts one value from another x - y
- `*` Multiplies two values x * y
- `/` Divides one value by another x / y
- `%` Returns the division remainder x % y
- `++` Increases the value of a variable by 1 ++x
- `--` Decreases the value of a variable by 1 --x

`+`

    int intResult = 1 + 2;
    System.out.println("1 + 2 = " + intResult); // 1 + 2 = 3

    int previousResult = intResult;
    System.out.println("previousResult = " + previousResult); // previousResult = 3

`-`

    intResult = intResult - 1;
    System.out.println("3 - 1 = " + intResult); // 3 - 1 = 2

`intResult` is updated to 2, but `previousResult` is updated to 3.

    System.out.println("previousResult = " + previousResult); // previousResult = 3

`*`

    intResult = intResult * 10;
    System.out.println("2 * 10 = " + intResult); // 2 * 10 = 20

`/`

    intResult = intResult / 5;
    System.out.println("20 / 5 = " + intResult); // 20 / 5 = 4

`%` it retains the remainder of two operands

    intResult = intResult % 3;
    System.out.println("4 % 3 = " + intResult); // the remainder of (4 % 3) = 1

`++` `intResult` = `intResult` + 1;

    intResult++;
    System.out.println("1 + 1 = " + intResult); // 1 + 1 = 2

`--` `intResult` = `intResult` - 1;

    intResult--;
    System.out.println("2 - 1 = " + intResult); // 2 - 1 = 1

`+=` `intResult` = `intResult` + 2;

    intResult += 2;
    System.out.println("1 + 2 = " + intResult); // 1 + 2 = 3

`*=` `intResult` = `intResult` * 10;

    intResult *= 10;
    System.out.println("3 * 10 = " + intResult); // 3 * 10 = 30

`/=` `intResult` = `intResult` / 3;

    intResult /= 3;
    System.out.println("30 / 3 = " + intResult); // 30 / 3 = 10

`-=` `intResult` = `intResult` - 2;

    intResult -= 2;
    System.out.println("10 - 2 = " + intResult); // 10 - 2 = 8
