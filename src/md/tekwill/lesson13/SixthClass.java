package md.tekwill.lesson13;

public class SixthClass {

    public SixthClass getType() {
        return this;
    }

    public static void main(String[] args) {
        SixthClass test = new SixthClass();
        System.out.println(test.getType());
    }
}


//6. One class with a method or two that return a type of the current class.
// Hint: using "this".