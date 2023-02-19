package Slajd4_Zadatak4;

public class Product {

    protected String nazivProizvoda;
    protected String barKod;
    protected int osnovnaCena;

    protected String porez;

    public double cenaProizvoda;



    public Product(String nazivProizvoda, String barKod, int osnovnaCena, String porez) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;
        this.porez = porez;



        cenaProizvoda = (this.osnovnaCena * 0.20) + this.osnovnaCena;



    }

    public void ispis() {
        System.out.println("Cena proizvoda je: ");

    }



    public void cenaProizvoda() {
        System.out.println(cenaProizvoda);
    }

    @Override
    public String toString() {
        return "Product:" +
                " " + nazivProizvoda + ',' +
                " Barcode:  " + barKod + ',' +
                " Base price: " + osnovnaCena +
                " Tax: " + porez + ',' +
                " Final price: " + cenaProizvoda +
                " .";
    }
}
