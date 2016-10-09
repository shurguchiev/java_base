package meanmail.stepic.java.tests;

import java.util.Arrays;

/**
 * Created by meanmail on 30.09.2016.
 */
public class Assertions {

    public static void assertEquals(int value, int expected, String msg) {

        if (value != expected)
            System.out.printf("%s: Error! Expected %d, got %d.\n", msg, expected, value);
        else
            System.out.printf("%s: Ok\n", msg);
    }

    public static <T> void assertEquals(T[] value, T[] expected, String msg) {

        if (!Arrays.equals(value, expected))
            System.out.printf("%s: Error! Expected %s, got %s.\n", msg, Arrays.toString(expected), Arrays.toString(value));
        else
            System.out.printf("%s: Ok\n", msg);
    }

    public static void assertEquals(int[] value, int[] expected, String msg) {

        if (!Arrays.equals(value, expected))
            System.out.printf("%s: Error! Expected %s, got %s.\n", msg, Arrays.toString(expected), Arrays.toString(value));
        else
            System.out.printf("%s: Ok\n", msg);
    }


    public static void assertEquals(Class<?> value, Class<?> expected, String msg) {

        if (value == null || !value.equals(expected))
            System.out.printf("%s: Error! Expected class %s, got %s.\n", msg, expected, value);
        else
            System.out.printf("%s: Ok\n", msg);
    }
}