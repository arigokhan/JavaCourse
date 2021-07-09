package md.tekwill.lesson9;

public class Exercise2 {
    public static void main(String[] args) {
        int number = 10;

        System.out.print("Cifrele pare pana la " + number + " sunt: ");
        for (int j = 0; j < number; j += 2) {
            if (j != 0) {
                System.out.print(",");
            }
            System.out.print(j);

        }
    }
}
