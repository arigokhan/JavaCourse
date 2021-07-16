package md.tekwill.lesson15;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone(5,"Iphone","12",339875638);
        smartPhone.setGeneration(7);
        smartPhone.call();
        System.out.println(smartPhone.getId() +" "+ smartPhone.getName() +" "+ smartPhone.getModel()+" "+ smartPhone.getImei()+" "+ smartPhone.getGeneration());



    }
}
