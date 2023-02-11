package main;

import java.util.Scanner;



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
          int x = 523434;
          int y = 325423;

          int ostatak = x % y;
//          System.out.println(ostatak);

        if ( ostatak == 0 ) {
            System.out.printf("Ostatak ne postoji.");
        } else if ( ostatak > 1000 ) {
            System.out.println("Ostatak je veci od 1000." + " (" + ostatak + ")");
        } else if ( ostatak < 1000 ) {
            System.out.println("Ostatak je manji od 1000." + " (" + ostatak + ")");
        } else {
            System.out.println("Nije moguce izracunati.");
        }


                // Vezba 15

        String carMake = "Ford";
        int doors = 4;


        if ( carMake.equals("Ford") && doors == 4 ) {
            System.out.println("Ford car with 4 doors.");
        } else if ( carMake.equals("Ford") &&  doors == 2) {
            System.out.println("Ford car with 2 doors.");
        } else if( carMake != "Ford") {
            System.out.println("Brand of the car unknown.");
        } else {
            System.out.println("Car details unavailable. ");
        }














    }
}




