package cars;

import cars.interfaces.*;

public class TheStig {
    public static void testDrive(Driveable car) {
        car.accelerate(100);
        car.shiftGear(2);
        car.accelerate(100);
        car.shiftGear(4);
        car.accelerate(100);
        car.shiftGear(6);
        car.decelerate(300);
        car.turn(20);
        car.turn(-20);
        car.decelerate(1000);
        car.shiftGear(1);
    }

    public static void streetTest(StreetLeagal car) {
        car.accelerate(200);
        car.shiftGear(2);
        car.blinkLeft();
        car.turn(-45);
    }
}
