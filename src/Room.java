public class Room {
    double temp;
    double area;
    boolean airCond;
    private final double minTemp = 18;


    Room(double area, double temp, boolean airCond) {
        this.area = area;
        this.temp = temp;
        this.airCond = airCond;

    }

    void tempDown() {
        if (airCond == true && temp >= minTemp) {
            this.temp = temp - 1;
            System.out.println("Czy udało się obniżyć temperaturę?: " + true);
        }
        if (airCond == false || temp <= minTemp) {
            System.out.println("W pokoju nie ma klimatyzatora lub osiągnięto temperaturę graniczną. " + "Komunikat: " + false);
        }
    }

    void showStatus() {

        System.out.println(temp);
    }
}

