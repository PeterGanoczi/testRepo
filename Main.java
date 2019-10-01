package sk.itsovy.eurocalculator;

public class Main {

    public static void main(String[] args) {

        final double rateUsd=1.11;
        final double rateHuf=332.51;
        final double rateUkr=10.25;
        final double rateChr=5.36;

        double eur= 15;
        double dollar= eur *rateUsd;
        double forint= eur * rateHuf;
        double hrivna= eur*rateUkr;
        double kuna= eur*rateChr;

        System.out.println( "USD : " + dollar);
        System.out.println( "HUF : " + forint);
        System.out.println( "HRIVNA : " + hrivna);
        System.out.println( "KUNA : " + kuna);
    }

}
