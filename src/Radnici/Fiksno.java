package Radnici;

public class Fiksno extends  Radnik {





    public Fiksno(String ime, String prezime, String jmbg, String ziroRacun, double plata) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plata = plata;
    }

    public double obracunajPlatu (){
        return plata;
    }


    @Override
    protected void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();

    }
}
