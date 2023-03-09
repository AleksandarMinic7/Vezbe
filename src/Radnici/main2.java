package Radnici;
import java.util.Scanner;

public abstract class main2 {


    public static void main(String[] args) {



        PoSatu radnikPoSatu = new PoSatu("Pera", "Peric", "12431515156", "1241541515155", 100, 300);

        PoDanu radnikPoDanu = new PoDanu("Marko", "Djukic", "12431515156", "1241541515155", 15, 2500);

        Fiksno radnikFiksno = new Fiksno("Zika", "Petrovic", "12431515156", "1241541515155", 100);


        radnikPoSatu.isplatiPlatu();
        radnikPoDanu.isplatiPlatu();
        radnikFiksno.isplatiPlatu();









    }




}



