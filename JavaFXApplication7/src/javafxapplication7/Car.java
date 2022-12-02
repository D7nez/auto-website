
package javafxapplication7;

public abstract class Car {

    private String Brand;
    private String carName;
    private int model;
    private String color;
    private String cylinder;
    private int horsePower;
    private int fuelTankCapacity;
    public Car() {

    }

    public abstract String getBrand();

    public abstract String getcarName();

    public abstract int getModel();

    public abstract String getColor();

    public abstract String getCylinder();

    public abstract int getHorsePower();

    public abstract int getFuelTankCapacity();
    


    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

}