package md.tekwill.lesson10;

public class MathExercisesTest {

    public static void main(String[] args) {
        MathExercises exercises = new MathExercises();
        exercises.number = 10;

        System.out.println(exercises.getTotal(exercises.number));

        System.out.println(exercises.getEvenNumbers(exercises.number));

        exercises.printHelloXTimes(exercises.number);

        System.out.println(exercises.getOddNumbers(exercises.number));

    }

}
