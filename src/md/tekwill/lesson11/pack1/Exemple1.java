package md.tekwill.lesson11.pack1;

import md.tekwill.lesson11.pack2.Exemple2;

public class Exemple1 {

    private void privateMethod() {
        System.out.println("This is private method in package1.Exemple1");
    }

    void defaultMethod() {
        System.out.println("This is default method in package1.Exemple1");
    }

    public void publicMethod() {
        System.out.println("This is public method in package1.Exemple1");
    }

    public static void main(String[] args) {
            Exemple2 test = new Exemple2();
            test.publicMethod();
    }


}
