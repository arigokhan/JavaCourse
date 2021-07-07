public class FourthExercise {
    String name;
    String surname;
    int age;

    FourthExercise(String name) {
        this.name = name;
    }

    FourthExercise(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    FourthExercise(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public static void main(String[] args) {
        FourthExercise a = new FourthExercise("Messi");
        System.out.println(a.name);
        System.out.println(a.surname);
        System.out.println(a.age);

        FourthExercise b = new FourthExercise("Cristiano", "Ronaldo", 36);
        System.out.println(b.name);
        System.out.println(b.surname);
        System.out.println(b.age);
    }
}
// 4. One class with three overloaded constructors using "this()".
// Use "this" to assign the passed parameters to class properties.