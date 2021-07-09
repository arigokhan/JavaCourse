package md.tekwill.lesson11.pack1;

public class PrivateModifier {

    public void a(){
        b();
        c();
    }

    private void b(){
        System.out.println("test b");
    }

    private void c(){
        System.out.println("test c");
    }

}
