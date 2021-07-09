package md.tekwill.lesson10;

public class MathExercises {
    int number;
    int total;

    int getTotal(int number) {

        for (int i = 1; i < 10; i++) {
            total += i;
        }
        return total;
    }

    String getEvenNumbers(int number) {

        String toPrint = "";
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                if (i != 0) {
                    toPrint = toPrint + ",";
                }
                toPrint = toPrint + i;
            }

        }
        return toPrint;
    }

    void printHelloXTimes(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println("Hello");
        }
    }

    String getOddNumbers(int number) {
        String toPrint = "";
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) {
                if (i != 1) {
                    toPrint = toPrint + ",";
                }
                toPrint = toPrint + i;
            }

        }
        return toPrint;
    }
}
