package Ocene;


import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Student> sviStudenti = new ArrayList<>();
        List<Student> studentiPolozili = new ArrayList<>();
        Student student;

        while (true) {
            System.out.println("Unestite podatke o studentu: ");
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            if (ime.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Unesite prezime studenta: ");
            String prezime = scanner.next();
            if (prezime.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Unesite ocenu studenta: ");
            int ocena = scanner.nextInt();
            if ((ocena + "").equalsIgnoreCase("quit")){
                break;
            }

            student = new Student(ime, prezime, ocena);

            sviStudenti.add(student);


        }

        for (int i =0; i < sviStudenti.size(); i++) {
            if (sviStudenti.get(i).getOcena() > 5) {
                studentiPolozili.add(sviStudenti.get(i));
            }

            System.out.println("Svi studenti : " + sviStudenti);
            System.out.println("Studenti koji si polozili: " + studentiPolozili);

        }






        }










    }



