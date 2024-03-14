public class Main {
    public static void main(String[] args) {
        /*
        kintamieji+
        salyginiai sakiniai
        ciklai
        funkcijos(metodai)
        klases (OOP)
        interfeisai
         */
//        byte manoAmzius = 34;
//        System.out.println(manoAmzius);
//        manoAmzius = 33;
//        System.out.println(manoAmzius);
//        short sortai = 14532;
        int teisingasSkaicius = 2147000000;
        long ilgasSkaicius = 6412682981986298636L;
        float kaina = 40.46F;
        double PI = 3.1417286486841;
        boolean willWeLearnSomething = true;
        boolean willItBeEasy = false;
//        char aLetter = 'a';
//        char numberChar = '7';
        String manoVardas = "Naglis";
        String miestas = "Kaunas";
        String darbas = "Lektorius";
        System.out.println("labas " + "labas" + ilgasSkaicius + " " + miestas);
        System.out.println( 7 + 5 + " skaicius ");//75 skaicius; 12 skaicius;
        System.out.println(" skaicius " + 7 + 5);//skaicius 75
        System.out.println(" skaicius " + (7 + 5));// skaicius 12
        System.out.println("as esu " + manoVardas + ". mano darbas: " + darbas + " mieste:" + miestas);

        if(willWeLearnSomething){
            System.out.println("sako tiesa");
        }else{
            System.out.println("sako netiesa");
        }
        if( 5 > 7){
            System.out.println("taip");
        }else{
            System.out.println("ne");
        }

        int num1 = 85;
        int num2 = 685;

        if(num1 > num2){
            System.out.println("if. skaicius " + num1 + " yra didesnis uz " +num2);
        }else if(num1 < num2){
            if(true){
                if(false){

                }else{
                    if (true){
                        System.out.println("kosmosas.....");
                    }
                }
            }
            System.out.println("else. skaicius " + num2 + " yra didesnis uz " +num1);
        }else{
            System.out.println("skaiciai " + num1 + " yra vienodi");
        }

        if(num1 > num2){
            System.out.println("if. skaicius " + num1 + " yra didesnis uz " +num2);
        }

        if(num1 < num2){
            System.out.println("else. skaicius " + num2 + " yra didesnis uz " +num1);
        }

        if(num1 == num2){
            System.out.println("skaiciai " + num1 + " yra vienodi");
        }

        int a = 10;
        int b = 20;

        if(a > b){
            System.out.println(a + " yra daugiau uz " + b);
        }
        if(a >= b){
            System.out.println(a + " yra daugiau lygu uz " + b);
        }
        if(a < b){
            System.out.println(a + " yra maziau uz " + b);
        }
        if(a <= b){
            System.out.println(a + " yra maziau lygu uz " + b);
        }
        if(a != b){
            System.out.println(a + " yra daugiau arba maziau uz " + b);
        }
        if(a == b){
            System.out.println(a + " yra lygu " + b);
        }

        if(a > b || a < b){ // ARBA. pasileis, jei BENT VIENA salyga yra true
            System.out.println(a + " yra daugiau arba maziau uz " + b);
        }

        int minAge = 18;
        int maxAge = 80;
        int personsAge = 46;

        if(personsAge >= minAge && personsAge < maxAge){ // IR. pasileis, jei ABI salygos yra true
            System.out.println("sitas asmuo gali vairuoti");
        }
//  random skaicius nuo 0 iki 4

        int rndNum = (int) Math.round( Math.random() * 4);
        int rndNum1 = (int) Math.round( Math.random() * 4);


        //                     10 +             0.0 * 20 = 0; = 10;
        //                     10 +             0.99 * (20 - 10) = 10; = 20;
//  random skaicius nuo iki
        int min = 10;
        int max = 20;
        System.out.println( min +  Math.round( Math.random() * (max - min))    ) ;

//
//        if(){}
//        else(){}
//        for(){}
//        while(){}
//        function(){}
//        switch(){}


        System.out.println("sveiki");

        System.out.println("1mor msg");










    }
}