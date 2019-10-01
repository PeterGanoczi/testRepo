package sk.itsovy.ganoczi.other;

public class FreeClass {

    /*
        !!!!!!
        if(x>8); NIKDY ZA IF, FOR, WHILE NEJDE ; bodkociarka !!
        if(a=7) jedno = znamena priradenie t.j. vzdy TRUE, if(a==7)
        zlozeny prikaz
        if(logika){
            sout(A);
            sout(B);
            sout(C):
        } sout(D);
        !!!!!!

        for(inicializacia cyklu i=7; podmienka opakovania i<=20; iteracia (dalsi krok opakovania) i++) {
            TELO CYKLU
        }
        FOR cyklus ak poznam pocet opakovani
        WHILE cyklus ak nepoznam pocet opakovani

        for(j=7, k=80; j<k; k++, j=j*2){
            sout("Hello")
            1.cyklus j=7 k=80...hello
            2.cyklus j=14 k=81...hello
            3.cyklus j=28 k=82..hello
            4.cyklus j=56 k=83...hello
               j=112 k=84 podmiemka neplati cyklus skoncil !
        }
     */
    public void test() {
        /*
        for(int i=10; i<=99; i++){
            System.out.print(i + " "); // system.out.print !! bez ln aby vypisalo v riadku
        }

        for(int j=10; j<=99; j=j+2 ){
            System.out.print(j+ " ");
        }
        //vsetky cisla neparne od najvacsieho najmensie

        for (int k=99; k>10; k=k-2){
            System.out.print(k + " ");
        }

        //Vsetky 3 ciferne cisla delitelne 11-kou

        for(int l=100; l<=999; l++){
            if(l % 11 == 0){
                System.out.println();
            }
        }
        */
        //vsetky 3 ciferne cisla delitelne 11-kou ale niesu delitelne 3-kou
/*
        for(int x=100; x<=999; x++){
            if (x%11==0 && x%3!=0){
                System.out.print(x + " ");
            }
        }

    //Vsetky dvojciferne cisla ktore su delitelne 2kou alebo 3kou

        for(int i=10; i<100; i++){
            if( i%2==0 || i%3==0){
                System.out.print(i + " ");
            }
        }
        //Vsetky dvojciferne ktore su del 2kou alebo 3kou ale nie 10kou

        for(int i=10; i<100; i++){

                if ((i % 2 == 0 || i % 3 == 0) && i % 10 != 0) {
                    System.out.print(i + " ");
            }
        }
     //vypis vsetky pekne 3cif cislo .. pekne je vtedy ak ciferny sucet je 10

        for (int i=109; i<910; i++){
            int a= i%10;
            int b= (i/10)%10;
            int c=(i/100)%10;
            if (a+b+c==10){
                System.out.print(i + " ");
            }

        }


    //vypis vsetky 3cif cisla ktore su pekne ak aspon dve cislice sa rovnaju

        for(int i=100; i<1000; i++){
            int a= i%10;
            int b= (i/10)%10;
            int c=(i/100)%10;
            if (a==b || b==c || c==a){
                System.out.print(i + " ");
            }
        }

    //vypis vsetky 3cif cisla ktore su pekne ak prave 2 cifry sa rovnaju

        for (int i=100; i<1000; i++){
            int a= i%10;
            int b= (i/10)%10;
            int c=(i/100)%10;
            if ((a==b && a!=c) || (a==c && a!=b) || (b==c && a!=b)){
                    System.out.print(i + " ");
                }
            }
        //vsetky 3cif cisla s roznymi ciframi

        for(int i=100; i<1000; i++){
            int a= i%10;
            int b= (i/10)%10;
            int c=(i/100)%10;
            if (a!=b && b!=c && c!=a){
                System.out.print(i + " ");
            }
        }

    //vypisat kolko je peknych cisel.. tj neparne ktoreho ciferny sucet je menej ako 6

        for( int i=1; i<1000; i++){

            if(i%2!=0){
                int a= i%10;
                int b= (i/10)%10;
                int c=(i/100)%10;
                if((a+b+c) < 6){

                    System.out.print(i+ " ");
                }

            }

        }

        //kolko delitelov ma cislo 870

        int count = 0;
        int j = 870;
        for (int i = 1; i <= 870; i++) {
            if (j % i == 0) {
                count++;

            }
            System.out.print(count);
        }

    //nasobky cisla
    for (int i=1; i<1000000000; i=i*2){
        System.out.print(i + " ");
    }

    for (int i=2000; i<9999; i++){

            int a= i%10;
            int b= (i/10)%10;
            int c=(i/100)%10;
            int d=(i/1000)%10;

            if (i%12==0 && a<d && c%2==0){

                    System.out.print(i+" ");
                }

            }


    int time =514623; //kolko je to dni hodin minut sekund

        int day= time/86400;
        time=time%86400;
        int hour=time/3600;
        time=time%3600;
        int min=time/60;
        int sec=time%60;
        System.out.println(time);


    }
    */
/*
        // 1+2+3+4+5+6+7.....+158
        int sum=0;
        for (int i= 1; i<159; i++ ){
            sum=sum+i;
            System.out.println(sum);


        }
        // to iste co here ale vzorec bez cyklu
        int a= ((1+158)*158)/2;
        System.out.println(a);


        //kazdy den dostanes peniaze, prvy den 1cent druhy 2centy a kazdy dalsi dvojnasobok predchadzajuceho
        int sum=0;
        int value=1;
        for(int i=1; i<=30; i++){
            sum=sum+value;
            value=value*2;
        }
        System.out.println(sum/100);



        double n = 1;
        double sum = 0;
        for (double i = 1; i <= 100; i++) {
            sum += n / i;
            //sum =sum +n;
            //n=(double)1/i;
        }
        System.out.println(sum);
*/
    }


    //1.Výpis všetkých štvorciferných čísel deliteľných číslom 615
    public void hW1() {
        for (int i = 1000; i <= 9999; i++) {
            if (i % 615 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //2.Výpis pekných trojciferných čísel. Číslo je pekné ak cifry klesajú, napr: 543, 951, 421, 862, 943, ... atd
    public void hW2() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (c > b && b > a) {
                System.out.print(i + " ");
            }
        }
    }

    //3. Scitat vsetky dvojciferné čísla deliteľné číslom 3, teda vypísať ich súčet
    public void hW3() {
        int count = 0;
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (0 == i % 3) {
                count++;
                sum += i;
                System.out.print(i + " ");

            }

        }
        System.out.println(" ");
        System.out.println("pocet cisel " + count + " sucet cisel  " + sum);
    }

    //4. Zistiť a vypísať počet deliteľov čísla 1000000 (milion)
    public void hW4() {
        int count = 0;
        for (int i = 1; i <= 1317; i++) {
            if (1317 % i == 0) {
                count++;
                System.out.println(i);

            }
        }
        System.out.print(count + " ");
    }

    //5. Vypocitat povrch a objem kvadra. Strany su 45, 87, 37
    public void hW5() {
        int a = 45;
        int b = 87;
        int c = 37;
        double area = (double) 2 * (a * b + b * c + a * c);
        double capacity = (double) a * b * c;
        System.out.println("Area of block " + area + " Capacity of block " + capacity);

    }

    //6. Vypísat cisla od 10 do 2 s krokom 0,5 , teda: 10 9.5 9 8.5 8  .......3 2.5 2
    public void hW6() {
        for (double i = 10; i >= 2; i = i - 0.5) {
            System.out.print(i + " ");
        }
    }

    //7. Vypocitat faktorial cisla 7!, teda 7*6*5*4*3*2*1  cez cyklus for
    public void hW7() {
        int result = 1;
        for (int i = 1; i <= 7; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    //8. vypisat vsetky trojciferne neparne cisla, ktore su delitelne cislom 27 a nie su delitelne cislom 13.
    public void hW8() {
        for (int i = 100; i <= 999; i++) {
            if (i % 2 != 0) {
                if (i % 27 == 0 && i % 13 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    //9. vypisat vsetky nasobky cisla 91 az do 10000, teda: 91,  182,, 273, .......
    public void hW9() {
        for (int i = 91; i <= 10000; i = i + 91) {
            System.out.print(i + " ");
        }
    }

    //10. vypisat vsetky 5 ciferne cisla, ktore su palindromy, cize odpredu aj odzadu rovnako citatelne, napr:  45854, 30903, 11111, 22722, ...
    public void hW10() {
        for (int i = 10000; i <= 99999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a == e && b == d) {
                System.out.print(i + " ");
            }

        }
    }

    public void hW11() {
        int i = 10000;


        while (i <= 99999) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a + b + c + d + e == 43) {
                System.out.println(i);
            }
            i++;
        }

    }
    //najvacsie 5cif cislo, ktore je delitelne cislom 613

    public void hW12() {
        int i = 99999;
        while (i % 613 != 0) {   //i=99999 - (99999 % 613 )
            i--;
        }
        System.out.print(i);
    }

    public void hW13() {
        int a = 6;
        int b = 8;
        int x = 1;
        while ((a * x) % b != 0) {
            x++;
        }
        System.out.println(a * x);

    }

    public void hW14() {
        int a = 54;
        int b = 87;
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println(a + " " + b);

        }

    }

    public void hW15() {
        int a = 48;
        int b = 88;
        int c = 0;

        if (a < b) {
            c = a;
            a = b;
            b = c;
        }
        while (a % b != 0) {
            c = b;
            b = a - b;
            a = c;

            if (a < b) {
                c = a;
                a = b;
                b = c;
            }
        } System.out.println(b);

    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayNHello(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("Hello"); //cyklus for
            i++;
        }
        System.out.println(); //odriadkovanie na konci vypisu

    }

    public void sayHi() {
        System.out.println("Hi");
    }

    public void sayNHi(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("Hi");
            i++;
        }
        System.out.println();
    }

    public int roundNumber(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            return a + 1;

        }
    }

    public void calcLoan(int months, double interestRate, double amountOfMoney) {
        double monthRate = interestRate / 12;
        double monthlyInterest = (((amountOfMoney / months) / 100) * monthRate);
        double monthlyPayment = amountOfMoney / months + monthlyInterest; // mesacna splatka + urok
        double paymentTotal = monthlyPayment * months;
        System.out.println("Your monthly payment will be " + monthlyPayment + "$, and total you wil pay " + paymentTotal);

    }
}
