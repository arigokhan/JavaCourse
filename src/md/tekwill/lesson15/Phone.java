package md.tekwill.lesson15;

public class Phone {

    private int id;
    private String name;
    private String model;
    private int imei;


    public Phone() {

    }

    public Phone(int id) {
        this();
        this.setId(id);
    }

    public Phone(int id, String name) {
        this(id);
        this.setName(name);
    }

    public Phone(int id, String name, String model) {
        this(id, name);
        this.setModel(model);
    }

    public Phone(int id, String name, String model, int imei) {
        this(id, name, model);
        this.setImei(imei);
    }

    protected void call() {
        System.out.println("Phone is calling...");
    }

    public void sendMessage() {
        System.out.println("Phone is sending message...");
    }

    public void playSong() {
        System.out.println("Phone is playing song...");
    }


    // Getter - Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }
}
