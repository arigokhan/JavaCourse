import java.net.SocketOption;

public class AutomobileTest {
    public static void main(String[] args) {

        Automobile car1 = new Automobile();

        int carAge=car1.getCarAge(2019);
        System.out.println("Maşina are "+carAge+" ani");

        car1.carName("Ford","Fusion");

        car1.carColor="Black";
        System.out.println(car1.getCarColor());

        car1.carSegment = 'D';
        System.out.println(car1.getCharSegmentNumber(car1.carSegment));

    }
}
