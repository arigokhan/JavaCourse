import java.util.Arrays;
import java.util.Optional;

public class FifthExercise {

    public void methodToBeCalled(FifthExerciseTest param1){
       //do something with param1
        System.out.println(param1);

    }

}

class FifthExerciseTest{

    public void testingMethod(){
        FifthExercise testObject = new FifthExercise();
        testObject.methodToBeCalled(this);
    }

    public static void main(String[] args) {
        FifthExerciseTest test = new FifthExerciseTest();
        test.testingMethod();
    }

}

//5. One class with a method that has a parameter.
// When calling the method, it should be possible to pass "this" as parameter.