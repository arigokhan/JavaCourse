public class FirstExercise {

    public void methodOne() {
        System.out.println("Method 1");
        this.methodTwo();
        this.methodThree();
    }

    public void methodTwo() {
        System.out.println("Method 2");
    }

    public void methodThree() {
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        FirstExercise test = new FirstExercise();
        test.methodOne();
    }

}

// 1. One class with two or three methods.
// In the first method call the second and third method with "this" keyword.
