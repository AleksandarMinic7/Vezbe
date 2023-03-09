package Radnici;



import java.util.Scanner;

public abstract class Radnik {




    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected  String ziroRacun;
    protected double plata;

    public Radnik(String ime, String prezime, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
    }

    protected void isplatiPlatu(){
        System.out.println("Radniku: " + ime + " " + prezime + " JMBG: " + jmbg + " " + " na racun " + ziroRacun + " isplaceno je: " + plata );
    }





}
