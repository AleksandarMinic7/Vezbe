package Slajd4_Zadatak4;


public class Chocolate extends Product{

    protected int tezina;



    public Chocolate(String nazivProizvoda, String barKod, int osnovnaCena, String porez, int tezina) {
        super(nazivProizvoda, barKod, osnovnaCena, porez);
        this.tezina = tezina;

    }


    @Override
    public String toString() {
        return "Product " +
                "name: " + nazivProizvoda + ',' +
                " Weight:  " + tezina + "g" + "," +
                " Barcode: " + barKod + ',' +
                " Base price: " + osnovnaCena + "," +
                " Tax: " + porez + ',' +
                " Final price: " + cenaProizvoda +
                '.';
    }
}
