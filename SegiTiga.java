package polimorpishmeLaMarno;

public class SegiTiga extends BangunDatar{
    private int alas, tingi;

    SegiTiga ( int alas, int tinggi){
        this.alas=alas;
        this.tingi=tinggi;
    }

    @Override
    public double getluas() {
        return 0.5 * alas*tingi;
    }
}
