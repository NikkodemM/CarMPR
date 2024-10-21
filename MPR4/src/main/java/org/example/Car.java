package org.example;

public class Car {
    private int battery;
    private int fuelAmount;
    private int fuelCapacity;
    private double fuelConsumption;
    private int distanceTravelled;

    public Car(int battery, int fuelAmount, int fuelCapacity, double fuelConsumption, int DistanceTravelled) {
        this.battery = battery;
        this.fuelAmount = fuelAmount;
        this.fuelCapacity = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.distanceTravelled = DistanceTravelled;
    }



    public boolean turnOn() {
        if(battery > 10 && fuelAmount > 15) {
            return true;
        } else {
            return false;
        }
    }

    public boolean refuel(int addFuel) {
        if (addFuel > 0) {
            if (fuelAmount + addFuel <= fuelCapacity && fuelAmount > 0) {
                fuelAmount += addFuel;
                return true;
            } else if (fuelAmount + addFuel > fuelCapacity) {
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean drive(int distanceDriven) {
        if (distanceDriven > 0) {
            distanceTravelled += distanceDriven;
            if (turnOn() && fuelAmount > 0) {
                fuelAmount -= (int) (distanceDriven * (fuelConsumption / 100));
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        distanceTravelled = distanceTravelled;
    }
}
