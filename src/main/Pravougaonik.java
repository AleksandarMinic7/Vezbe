package main;

public class Pravougaonik extends Predmet{

    double a;
    double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void povrsina() {
        super.povrsina();
        System.out.println(a*b);
    }
}
