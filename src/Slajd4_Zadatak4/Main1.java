package Slajd4_Zadatak4;



public class Main1 {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Milka chocolate", "512342", 120, "20%", 100);

        System.out.println(chocolate);
        chocolate.ispis();
        chocolate.cenaProizvoda();


        Wine wine = new Wine("Red Spanish wine", "456789", 300, "20%", "0.75l", "10%");


        System.out.println(wine);
        wine.ispis();
        wine.vinoCena();


        Chocolate chocolate1 = new Chocolate("Nestle chocolate", "789654", 200, "20%", 200);
        System.out.println(chocolate1);
        chocolate1.ispis();
        chocolate1.cenaProizvoda();















    }
}
