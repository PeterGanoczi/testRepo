package sk.itsovy.ganoczi.family;

public class Person {

    private String name;
    private int age;
    private boolean gender; // T....man, F...woman
    private double height;
    private int weight;
    private char status; // S....single, M....married, D....divorced, W....widow
    private Mobile mobile;
    private Car car;
    private Calculator calculator;


    public Person() {

    }

    public Person(String name, int age, boolean gender, double height, int weight, char status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.status = status;

    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void about() {
        System.out.println("Hello my name is " + name);
    }

    public double calculateBMI() {
        double bmi;
        bmi = weight / (height * height);
        return bmi;
    }

    public String getStatusBMI() {

        if (calculateBMI() < 20)
            return "underweight";
        if (calculateBMI() < 25)
            return "normal";
        if (calculateBMI() < 30)
            return "overweight";

        return "obesity";
    }

    public int getBirthYear() {
        int thisYear = 2019;
        int birthYear;

        birthYear = thisYear - age;
        return birthYear;
    }

    public void setName(String meno) {

        name = meno;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public char getStatus() {
        return status;
    }

    public boolean hasMobilePhone() {
        if (mobile == null)
            return false;
        else
            return true;
    }

    public boolean hasCar() {
        if (car == null)
            return false;
        else
            return true;
    }

    public boolean hasCalculator() {
        return calculator != null;
    }

    public boolean i;

    public void print() {
        System.out.println("--------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height/weight: " + " / " + weight);
        System.out.println("BMI: " + calculateBMI() + "(" + getStatusBMI() + ")");
        System.out.println("Gender: " + gender);
        System.out.println("Status: " + status);
        if (hasMobilePhone()) {
            System.out.println("Phone: " + mobile.getPhoneNumber());
        } else {
            System.out.println("Has no phone");
        }
        System.out.println("______________________");
        if (hasCar()) {
            System.out.println("Car: " + car.getBrand());
            System.out.println("Model: " + car.getModel());
            System.out.println("Evidence number: " + car.getEvidenceNumber());
            System.out.println("Color: " + car.getColor());
            System.out.println("HP: " + car.getHorsePower());
            System.out.println("Engine: " + car.getEngineCapacity());
            System.out.println("Gas consumption: " + car.getGasConsumption());
        } else {
            System.out.println("Has no car");
        }
    }
}



