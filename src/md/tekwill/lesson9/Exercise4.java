package md.tekwill.lesson9;

public class Exercise4 {
    public static void main(String[] args) {
        int number = 10;

        System.out.print("Cifrele impare pana la " + number + " sunt: ");
        for (int j = 1; j < number; j += 2) {
            if (j != 1) {
                System.out.print(",");
            }
            System.out.print(j);

        }
    }
}
