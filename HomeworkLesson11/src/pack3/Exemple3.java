package pack3;

import pack1.Exemple1;
import pack2.Exemple2;

public class Exemple3 {

    private void privateMethod() {
        System.out.println("This is private method in package3.Exemple3");
    }

    void defaultMethod() {
        System.out.println("This is default method in package3.Exemple3");
    }

    public void publicMethod() {
        System.out.println("This is public method in package3.Exemple3");
    }

    public static void main(String[] args) {
        pack1.Exemple1 test = new Exemple1();
        test.publicMethod();
    }
}
