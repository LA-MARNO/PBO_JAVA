package polimorpishmeLaMarno;

public class MainPolimorphisme {

    public static void main(String[] args) {
       PersegiPanjang y = new PersegiPanjang(20, 50 );
        System.out.println(y.getluas());
        System.out.println(y.getluas(30));
        System.out.println(y.getluas(30, 60 ));
    }
}
