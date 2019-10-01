package sk.itsovy.ganoczi.family;

public class Calculator {

    private String name;
    private boolean power;

    public Calculator(String name, boolean power) {
        this.name = name;
        this.power = power;
    }

    public Calculator(String casio) {
    }

    public int add(int a, int b) {
        if (isPower()) {
            return a + b;
        } else {
            return 0;
        }
    }

    public String getName() {

        return name;
    }

    public boolean isPower() {

        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public int calculateSquareArea(int a) {
        if (isPower()) {
            return a * a;
        } else {
            return 0;
        }
    }

    public double changeInchtoCm(double a) {
        if (isPower()) {
            return a * 2.54;
        } else {
            return 0;
        }
    }

    public double changeCmtoInch(double a) {
        if (isPower()) {
            return a / 2.54;
        } else {
            return 0;
        }
    }

    public double calculateDiagonalInRectangle(int a, int b) {
        // double c=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); Math.sqrt metoda na odmocninu , Math.pow metoda na mocninu a na kolko ?
        double c = Math.sqrt((a * a) + (b * b));
        if (isPower()) {
            return c;
        } else {
            return 0;
        }
    }

    public double calculateAreaCircle(int r) {
        double area = Math.PI * Math.pow(r, 2);
        if (isPower()) {
            return area;
        } else {
            return 0;
        }

    }

    public double calculateAverage(int a, int b, int c){
        if(isPower()){
            return (double)(a+b+c)/3;
            //return (a+b+c)/3.0;
        } else {
            return 0;
        }
    }

    public double calcBallCapacity(int r){
        if(isPower()) {
            return (4.0 / 3) * (Math.PI * (r * r * r));
        } else {
            return 0;
        }
    }

    public double calcSurfaceQuads(int a, int b, int c){
        if(isPower()){
            return 2*(a*b+b*c+a*c);
        } else {
            return 0;
        }
    }
    public void toggle() {
        power = !power;

        /* if(isPower())
                turnOff();
                else
                turnOn();

         */
    }
}
