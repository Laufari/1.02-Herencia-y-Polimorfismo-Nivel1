public class Car
{
    static final String brand = "Aston Martin";
    static String model;
    final int power;

    public Car(int power)
    {
        this.power = power;
    }

    public static void brake()
    {
        System.out.println("the vehicle is braking");
    }
    public void accelerate()
    {
        System.out.println("the vehicle is accelerating");
    }
}
