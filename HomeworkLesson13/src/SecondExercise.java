public class SecondExercise {

//    public void calculateSum(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public void calculateSum(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public void calculateSum(int a, int b, double c) {
//        System.out.println(a + b + c);
//    }
//
//    public static void main(String[] args) {
//        SeceondExercise test = new SeceondExercise();
//        test.calculateSum(1,5);
//        test.calculateSum(1,5,10);
//        test.calculateSum(1,5,5.5);
//    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateSum(int a, int b, byte c) {
        return a + b + c;
    }

    public static double calculateSum(int a, int b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(200, 500));
        System.out.println(calculateSum(200, 500, 1));
        System.out.println(calculateSum(200, 500, 5.5));

    }
}

//2. One class with 3 overloaded methods.