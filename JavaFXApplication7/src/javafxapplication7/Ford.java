
package javafxapplication7;

public class Ford extends Car {

    private String Brand = "Ford";
    private String carName = "Ford Expedition";
    private int model = 2007;
    private String color = "Bule";
    private String cylinder = "V8";
    private int horsePower = 300;
    private int fuelTankCapacity = 28;

    @Override
    public String getBrand() {
        return this.Brand;
    }

    @Override
    public String getcarName() {
        return this.carName;
    }

    @Override
    public int getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getCylinder() {
        return this.cylinder;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public int getFuelTankCapacity() {
        return this.fuelTankCapacity;
    }

    @Override
    public String toString() {

        return this.Brand + this.carName + this.model + this.color + this.cylinder + this.horsePower + this.fuelTankCapacity;

    }

    protected void ford() {
        String Brand2 = this.Brand;
        String carName2 = this.carName;
        int model2 = this.model;
        String color2 = this.color;
        String cylinder2 = this.cylinder;
        int horsePower2 = this.horsePower;
        int fuelTankCapacity2 = this.fuelTankCapacity;
        System.out.println("the brand name:" + Brand2);
        System.out.println("car name:" + carName2);
        System.out.println("car model:" + model2);
        System.out.println("car color:" + color2);
        System.out.println("cylinder:" + cylinder2);
        System.out.println("horsePower:" + horsePower2);
        System.out.println("fuelTankCapacity:" + fuelTankCapacity2);
    }

}
