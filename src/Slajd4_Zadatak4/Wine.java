package Slajd4_Zadatak4;

public class Wine extends Product{

    protected String zapreminaBoce;
    protected String dodatniPorez;

    private double vinoCena;

    public Wine(String nazivProizvoda, String barKod, int osnovnaCena, String porez, String zapreminaBoce, String dodatniPorez) {
        super(nazivProizvoda, barKod, osnovnaCena, porez);
        this.zapreminaBoce = zapreminaBoce;
        this.dodatniPorez = dodatniPorez;

        vinoCena = cenaProizvoda + ( cenaProizvoda * 0.10);





    }

    @Override
    public void cenaProizvoda() {
        super.cenaProizvoda() ;

    }

    public void vinoCena() {
        System.out.println(vinoCena);
    }

    @Override
    public String toString() {
        return "Product" +
                " name: " + nazivProizvoda + ',' +
                " Bottle volume: " + zapreminaBoce + ',' +
                " Barcode: " + barKod + ',' +
                " Base price: " + osnovnaCena + "," +
                " Tax: " + porez + ',' +
                " New price: " + cenaProizvoda + "," +
                " Additional tax: " + dodatniPorez + ',' +
                " Final price: " + vinoCena +
                '.';
    }
}
