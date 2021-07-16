package md.tekwill.lesson15;

public class SmartPhone extends Phone {
    private int generation;

    public SmartPhone() {
        System.out.println("Smartphone");
    }

    public SmartPhone(int id) {
        super(id);
    }

    public SmartPhone(int id, String name) {
        super(id, name);
    }

    public SmartPhone(int id, String name, String model) {
        super(id, name, model);
    }

    public SmartPhone(int id, String name, String model, int imei) {
        super(id, name, model, imei);
    }

//    public SmartPhone(int id, String name, String model, int imei, int generation) {
//        super(id, name, model, imei);
//        this.generation = generation;
//    }

    @Override
    public void call() {
        //super.call();
        System.out.println("Smartphone is calling");
    }

    @Override
    public void sendMessage() {
        System.out.println("Phone is sending message...");
    }

    @Override
    public void playSong() {
        System.out.println("Phone is playing song...");
    }

    public int getGeneration(){
        return generation;
    }

    public void setGeneration(int generation){
        this.generation=generation;
    }

}
