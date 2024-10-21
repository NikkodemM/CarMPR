import org.example.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void carTurnsOnWhenItHasBatteryAndFuel(){
        Car car = new Car(30, 50, 50,0, 0);

        boolean expected = car.turnOn();


        assertTrue(expected);
    }

    @Test
    public void carTurnsOnWhenItHasBatteryAndNoFuel(){
        Car car = new Car(30, 5, 50,0, 0);

        boolean expected = car.turnOn();

        assertFalse(expected);

    }

    @Test
    public void carHasMoreFuelIfCapacityIsAdded(){
        Car car = new Car(30, 10, 50,0, 0);

        boolean expected = car.refuel(20);


        assertFalse(expected);
        assertEquals(30, car.getFuelAmount());
    }


    @Test
    public void carHasMoreFuelIfCapacityIsAddedOverCapacity(){
        Car car = new Car(30, 50, 50,0, 0);

        boolean expected = car.refuel(75);


        assertFalse(expected);
        assertEquals(car.getFuelCapacity(), car.getFuelAmount());
    }

    @Test
    public void carFuelDoesntChangeWhenRefueledWithANegativeValue(){
        Car car = new Car(30, 0, 50,0, 0);

        boolean expected = car.refuel(-20);


        assertFalse(expected);
        assertEquals(0, car.getFuelAmount());
    }
}
