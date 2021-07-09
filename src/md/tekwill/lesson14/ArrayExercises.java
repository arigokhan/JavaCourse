package md.tekwill.lesson14;

import com.sun.source.util.SourcePositions;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] numRange = {1, 2, 3, 5, 6, 7, 9, 10};
        int evens[] = getEven(numRange);
        for (int a : evens
        ) {
            System.out.println(a);

        }

        char[] charRange = {'c','b','a','x','y','z'};
        System.out.println(getString(charRange));

    }

    public static int[] getEven(int[] numRange) {

        int a = 0;
        for (int b = 0; b < numRange.length; b++) {
            if (numRange[b] % 2 == 0) {
                a++;
            }
        }
        int[] evenNumbers = new int[a];
        int indexForSecondRange = 0;
        for (int i = 0; i < numRange.length; i++) {
            if (numRange[i] % 2 == 0) {
                evenNumbers[indexForSecondRange] = numRange[i];
                indexForSecondRange++;
            }

        }
        return evenNumbers;
    }


    public static String getString(char[] charRange) {
//        String a = "a";
//        for (int i = 0; i < charRange.length; i++) {
//            a = a + charRange[i];
//        }

        String a = new String(charRange);
        return a;
    }

}