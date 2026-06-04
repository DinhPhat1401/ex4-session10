//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.printInfo(car.accelerate());
        car.printInfo(car.accelerate(20));
        car.printInfo(car.accelerate(10, 2));

    }
}