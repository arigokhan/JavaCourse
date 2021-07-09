package md.tekwill.lesson13;

public class ThirdExercise {
    String name;
    String surname;
    int age;

    ThirdExercise(String name) {
        this.name = name;
    }

    ThirdExercise(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    ThirdExercise(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {

        ThirdExercise a = new ThirdExercise("Messi");
        System.out.println(a.name);
        System.out.println(a.surname);
        System.out.println(a.age);


        ThirdExercise b = new ThirdExercise("Cristiano", "Ronaldo", 36);
        System.out.println(b.name);
        System.out.println(b.surname);
        System.out.println(b.age);
    }

}
// 3. One class with three overloaded constructors.
// Use "this" to assign the passed parameters to class properties.
