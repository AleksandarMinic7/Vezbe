package Ocene;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {

    private String ime;
    private String prezime;
    private int ocena;


    public Student(String ime, String prezime, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocena = ocena;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getOcena() {
        return ocena;
    }


    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocena=" + ocena +
                '}';
    }

//    public void polozenIspit() {
//        System.out.println("Student " + ime + " " + prezime + ", je polozio ispit sa ocenom: " + ocena + " .");
//    }
//
//
//
//
//
//
//
//    public void studentOcene() {
//
//        System.out.println("Student: " + ime + " " +  prezime + " ," + "Ocena: " + " "  + ocena);
//    }
}
