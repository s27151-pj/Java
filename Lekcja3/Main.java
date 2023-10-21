public class Main {
    public static void main(String[] args){

        Car Car1 = new Car("WW", "Golf", "4",Car.Car_class.PREMIUM);
        Car Car2 = new Car("BMW", "X", "1",Car.Car_class.NORMAL);
        Car Car3 = new Car("FORD", "FOCUS", "4",Car.Car_class.SUP_EXCLUSIVE);

        Magazine.addCar(Car1);
    }
}
//
////class
//Rental service
