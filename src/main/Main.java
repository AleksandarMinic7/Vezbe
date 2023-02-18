package main;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;






public class Main {

    public static void main(String[] args) {


//        if(!(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600)){
//            System.out.println("Tacno");
//        }
//
//        if(!(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600)){
//            System.out.println("Netacno");
//        }
//
//
//        if(!(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600)){
//            System.out.println("Netacno");
//        }else if (false) {
//            System.out.println("False");
//        }
//
//        if(!(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600)){
//            System.out.println("Netacno");
//        }else if (false) {
//            System.out.println("False");
//        }
//
//
//        if(!(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600)){
//            System.out.println("Netacno");
//        }else if (false) {
//            System.out.println("False");
//        }


//        if(!(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600)){
//            System.out.println("Netacno");
//        }else if (false) {
//            System.out.println("False");
//        }
//
//    }


        //git init -> inicijalizacija lokalnog repositorijuma

        // git branch feature/add-more-if-statements ---> kreiranje novog branch-a

        //git checkout  feature/add-more-if-statements ---> prebacivanje na novokreiranu granu
        // moze i sledece: ---> git checkout -b feature/add-more-if-statements


        //git pull ----> povuci poslednje promene sa servera - update main branch-a

        // git add . svi fajlovi su markirani za slanje na server
        // git commit -m "added new if statements to main class"

        // git push origin/feature/add-more-if-statements


//        if (5 == 5) {
//            if (10 > 5) {
//                if (20 > 10) {
//                    System.out.println("Tacno.");
//                }
//            }
//        }
//
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }


        // Vezba 14
//          int x = 523434;
//          int y = 325423;
//
//          int ostatak = x % y;
//          System.out.println(ostatak);

//        if ( ostatak == 0 ) {
//            System.out.printf("Ostatak ne postoji.");
//        } else if ( ostatak > 1000 ) {
//            System.out.println("Ostatak je veci od 1000." + " (" + ostatak + ")");
//        } else if ( ostatak < 1000 ) {
//            System.out.println("Ostatak je manji od 1000." + " (" + ostatak + ")");
//        } else {
//            System.out.println("Nije moguce izracunati.");
//        }


        // Vezba 15

//        String carMake = "Ford";
//        int doors = 4;
//
//
//        if ( carMake.equals("Ford") && doors == 4 ) {
//            System.out.println("Ford car with 4 doors.");
//        } else if ( carMake.equals("Ford") &&  doors == 2) {
//            System.out.println("Ford car with 2 doors.");
//        } else if( carMake != "Ford") {
//            System.out.println("Brand of the car unknown.");
//        } else {
//            System.out.println("Car details unavailable. ");
//        }


        // Vezba 15, nested if

//        if (carMake.equals("Ford")){
//            if (doors == 4) {
//                System.out.println("Ford car with 4 doors.");
//            }
//        } else if ( carMake.equals("Ford")){
//            if (doors == 2) {
//                System.out.println("Ford car with 2 doors.");
//            }
//        } else {
//            System.out.println("Not a Ford car.");
//        }


        // Vezba digitron

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Unesite prvi broj: ");
//        double operand1 = scanner.nextInt();
//
//        System.out.println("Unesite drugi broj: ");
//        double operand2 = scanner.nextInt();
//
//        System.out.println("Unesite operaciju: ");
//        String operator = scanner.next();
//
//        if (operator.equals("+")) {
//            System.out.println("Zbir je: " + (operand1 + operand2));
//        } else if (operator.equals("-")) {
//            System.out.println("Razlika je: " + (operand1 - operand2));
//        } else if (operator.equals("*")) {
//            System.out.println("Proizvod je: " + (operand1 * operand2));
//        } else if (operator.equals("/")) {
//            if (operand2 != 0 && operand1 != 0) {
//                System.out.println("Deljenje je: " + (operand1 / operand2));
//            } else if ((operand1 == 0 || operand2 == 0) && operator.equals("/")) {
//                System.out.println("Deljenje nulom nije dozvoljeno!");
//            }
//        } else {
//            System.out.println("Greska pri unosu");
//        }


        // Vezba Max/Min vrednost niza


//        int[] mojNiz = {55, 67, -20, 0, 88};
//        int mojNizMax = mojNiz.length;
//
//        Arrays.sort(mojNiz);
//
//
//        int min = mojNiz[0];
//        System.out.println("Minimalna vrednost niza je: " + min);
//
//        int max = mojNiz[mojNiz.length - 1];
//        System.out.println("Maksimalna vrednost niza je: " + max);


        // Vezba 18


     //    String[] reci = {"Heart", "Cherry", "Coin", "Melon", "Jocker"};
//        String reci1;
//        String reci2;
//        String reci3;
//        String reci4;
//        String reci5;


//        Random random = new Random();
//        int reci1 = random.nextInt(reci.length);
//        int reci2 = random.nextInt(reci.length);
//        int reci3 = random.nextInt(reci.length);
//        int reci4 = random.nextInt(reci.length);
//        int reci5 = random.nextInt(reci.length);
//
//        System.out.println("Combination is: " + reci[reci1] + " " + reci[reci2] + " " + reci[reci3] + " " + reci[reci4] + " " + reci[reci5]);


        // Vezba niz2d

//        int[][] niz2d = new int[][]{
//                {1, 2, 8},
//                {3, 4, 10},
//                {5, 6, 15},
//        };
        //System.out.println("Duzina niza: " + niz2d.length);

        // System.out.println(niz2d[1][2]);


//        for (int[] a : niz2d) {
//            for (int b : a) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
//
//

        // Pravougaonik
        Pravougaonik pravougaonik = new Pravougaonik();

        pravougaonik.setA(5);
        pravougaonik.setB(4);
        pravougaonik.povrsina();

        System.out.println("--------------------");


        //














    }
}






