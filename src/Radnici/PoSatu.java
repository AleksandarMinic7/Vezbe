package Radnici;

public  class PoSatu extends  Radnik {


    private double cenaSata;
    private double brojSati;
    public PoSatu(String ime, String prezime, String jmbg, String ziroRacun, double cenaSata, double brojSati) {
        super(ime, prezime, jmbg, ziroRacun);
        this.cenaSata = cenaSata;
        this.brojSati = brojSati;
    }

    public double obracunajPlatu (){
        return cenaSata * brojSati;
    }

    @Override
    protected void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();

    }
}
