package Radnici;

public class PoDanu extends  Radnik {



    private double brojDana;
    private double cenaDana;


    public PoDanu(String ime, String prezime, String jmbg, String ziroRacun, double brojDana, double cenaDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.brojDana = brojDana;
        this.cenaDana = cenaDana;
    }

    public double obracunajPlatu (){
        return cenaDana * brojDana;
    }


    @Override
    protected void isplatiPlatu() {
        plata = cenaDana * brojDana;
        super.isplatiPlatu();


    }
}
