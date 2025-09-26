package cars;

import cars.interfaces.*;

public class VolvoV70 implements StreetLeagal, Loadable {

    @Override
    public void turn(double angle) {
        System.out.printf("svänger %f grader%n", angle);
    }

    @Override
    public void accelerate(int amount) {
        System.out.printf("accelererar %d%n", amount);
    }

    @Override
    public void decelerate(int amount) {
        System.out.println("bromsar");
    }

    @Override
    public void shiftGear(int gear) {
        System.out.println("växlar");
    }

    @Override
    public void turnOnLights() {
        System.out.println("På med ljusen och två extraramper med belysning.");
    }

    @Override
    public void blinkLeft() {
        System.out.println("blink blink vänster");
    }

    @Override
    public void blinkRight() {
        System.out.println("blink blink höger");
    }

    @Override
    public void load(int stuff) {

    }

    @Override
    public void unload(int stuff) {

    }
    
}
