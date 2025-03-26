//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car.model = "Vantage";

        Car car1 = new Car(665);
        Car car2 = new Car(660);

        Car.brake();

        car1.accelerate();
        car2.accelerate();

        System.out.println("Brand: " + Car.brand);
        System.out.println("Model: " + Car.model);
        System.out.println("Power car1: " + car1.power);
        System.out.println("Power car2: " + car2.power);

        }
}