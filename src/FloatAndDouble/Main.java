package FloatAndDouble;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue); // 1.4E-45
        System.out.println("Float maximum value = " + myMaxFloatValue); // 3.4028235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue); // 4.9E-324
        System.out.println("Double maximum value = " + myMaxDoubleValue); // 1.7976931348623157E308

        // double is accepted as the default. So with float you must set an f or (float) with double you may set a d
        // double is most commonly used
        float myFloatValue = 5.25f;
        float myFloatValue2 = (float) 5.25;
        double myDoubleValue = 5.25d;

        // double is more precise then float
        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println("myInt = " + myInt); // 1
        System.out.println("myFloat = " + myFloat); // 1.6666666
        System.out.println("myDouble = " + myDouble); // 1.6666666666666667

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi); // 3.1415927
        System.out.println(anotherNumber); // 3000000.456789
    }
}
