package OperatorVSEqualsOperator;

public class Main {

    public static void main(String[] args) {
        // what's wrong with this code
//        int newValue = 50;
//        if (newValue = 50){
//            System.out.println("This is an error");
//        }
        // you get an error message, because at the if statement it says = instead of ==

        // correct code
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        // what's wrong with this code
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }
        // you don't get an error + the code is running while it's not correct
        // this is due to boolean, which is connected to true or false. When it says = it always turns it. When it says == it checks if it's true

        // correct code
        boolean isCar2 = false;
        if (isCar2 == true) {
            System.out.println("This is right");
        }
    }
}
