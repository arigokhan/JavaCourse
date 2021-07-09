package md.tekwill.lesson11.pack2;

import md.tekwill.lesson11.pack3.Exemple3;

public class Exemple2 {

    private void privateMethod() {
        System.out.println("This is private method in package2.Exemple2");
    }

    void defaultMethod() {
        System.out.println("This is default method in package2.Exemple2");
    }

    public void publicMethod() {
        System.out.println("This is public method in package2.Exemple2");
    }

    public static void main(String[] args) {
        Exemple3 test = new Exemple3();
        test.publicMethod();
    }

}
