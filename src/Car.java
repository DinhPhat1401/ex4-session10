public class Car {
    private int currenSpeed = 0;

    public int accelerate() {
        System.out.println("Car accelerates by default: +10 km/h");
        return currenSpeed += 10;
    }
    public int accelerate(int speed) {
        System.out.println("Car accelerates by " + speed + " km/h");
        return currenSpeed += speed;
    }
    public int accelerate(int speed, int times) {
        int increase = speed * times;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
        return currenSpeed += increase;
    }
    public void printInfo(int currenSpeed) {
        System.out.println("Current speed: " + currenSpeed + " km/h");
        System.out.println();
    }
}
