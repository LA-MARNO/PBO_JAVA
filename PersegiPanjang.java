package polimorpishmeLaMarno;

public class PersegiPanjang extends BangunDatar{
    private int panjang, lebar;

    PersegiPanjang ( int panjang, int lebar ){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    @Override
    public double getluas() {
        return panjang*lebar;
    }
    public double getluas(int panjang){
        return panjang*lebar;
    }
    public double getluas(int panjang, int lebar){
        return panjang*lebar;
    }
}
