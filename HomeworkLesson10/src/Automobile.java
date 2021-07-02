import java.time.LocalDate;

public class Automobile {
    String carBrand;
    String carModel;
    String carColor;
    int carProductionYear;
    char carSegment;
    boolean isDiesel;
    double engineCapacity;

    int getCarAge(int carAge) {
        int currentYear = 0;
        LocalDate currentDate = LocalDate.now();
        currentYear = currentDate.getYear();
        carAge = currentYear - carAge;
        return carAge;
    }

    void carName(String getCarBrand, String getCarModel) {
        carBrand = getCarBrand;
        carModel = getCarModel;
        System.out.println(carBrand+" "+carModel);

    }

    String getCarColor() {
        return carColor;
    }

    int getCharSegmentNumber(char carSegment){
        int segmentNumber = Character.getNumericValue(carSegment);
        return segmentNumber;
    }


}
