package sk.itsovy.ganoczi.family;

public class Car {

    private String brand;
    private String model;
    private String evidenceNumber;
    private String color;
    private int horsePower;
    private double engineCapacity;
    private double gasConsumption;

    public Car(String brand, String model, String evidenceNumber, String color, int horsePower, double engineCapacity, double gasConsumption) {
        this.brand = brand;
        this.model = model;
        this.evidenceNumber = evidenceNumber;
        this.color = color;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.gasConsumption = gasConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEvidenceNumber() {
        return evidenceNumber;
    }

    public void setEvidenceNumber(String evidenceNumber) {
        this.evidenceNumber = evidenceNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }
}
