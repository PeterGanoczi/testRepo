package sk.itsovy.ganoczi.family;
import sk.itsovy.ganoczi.other.FreeClass;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        FreeClass greeting= new FreeClass();

        person1.setName("Dominik");
        person2.setName("Lucia");
        person1.setAge(25);
        person2.setAge(18);
        person1.setHeight(1.84);
        person1.setWeight(110);
        person1.setStatus('S');

        Mobile mobile1 = new Mobile();

        mobile1.setBrand("Huawei");
        mobile1.setModel("P30");
        mobile1.setPhoneNumber("+421903256421");

        Mobile mobile2 = new Mobile("Samsung", "S10", "0902253265");

        Car car1 = new Car("Ford", "Focus", "SP-584OA", "Blue", 120, 1.9, 7.5);

        Calculator casio = new Calculator("casio");
        person1.setCar(car1);

        person1.setMobile(mobile1);
        person1.setCalculator(casio);

        person1.about();
        System.out.println("Your BMI is: " + person1.calculateBMI());
        System.out.println("Result: " + person1.getStatusBMI());
        System.out.println("Birthyear: " + person1.getBirthYear());
        System.out.println("Person 1 is " + person1.getAge() + " years old.");
        System.out.println("Person 1 mobile is " + person1.getMobile().getPhoneNumber());

        Person student = new Person("Oliver", 19, true, 1.82, 92, 'S');
        Person student2 = new Person("Marek", 25, true, 1.75, 85, 'S');

        student.setMobile(mobile2);

        person2.print();

        if (person1.hasCalculator()) {
            person1.getCalculator().toggle();
            System.out.println(person1.getCalculator().changeInchtoCm(40) + " Inch");
            int dec=54;
            System.out.println(person1.getCalculator().calculateAverage(7,8,14));
            System.out.println(person1.getCalculator().calcBallCapacity(25));
            System.out.println(person1.getCalculator().calcSurfaceQuads(10,10,10));
            System.out.println(greeting.roundNumber(257));
            //greeting.sayNHello(13);
            //greeting.sayHello();
            greeting.calcLoan(12,10.0,1000);
            System.out.println("_____________HOMEWORK____________");
            greeting.hW1();
            System.out.println(" ");
            System.out.println("uloha 2 ");
            greeting.hW2();
            System.out.println("");

            greeting.hW3();
            System.out.println();
            greeting.hW4();
            System.out.println();
            greeting.hW5();
            System.out.println();
            greeting.hW6();
            System.out.println("");
            System.out.println("Faktorial of 7");
            greeting.hW7();
            System.out.println("");
            greeting.hW8();
            System.out.println();
            System.out.println("All multiplies of number 91");
            greeting.hW9();
            System.out.println();
            System.out.println("All palindroms from 5 digit numbers");
            greeting.hW10();
            System.out.println(" ");
            System.out.println("TASK 11");
            greeting.hW11();
            System.out.println("TASK 12");
            System.out.println();
            greeting.hW12();
            System.out.println();
            System.out.println("TASK 13");

            greeting.hW13();
            System.out.println("");
            greeting.hW14();
            System.out.println("");
            greeting.hW15();
        } else {

            System.out.println("NULL");
        }
    }



}
