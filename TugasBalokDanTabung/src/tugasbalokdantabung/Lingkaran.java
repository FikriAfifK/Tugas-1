package tugasbalokdantabung;

/**
 *
 * @author HP
 */
public class Lingkaran implements MenghitungBidang{
    double jari;
    
    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    
    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jari;
    }
    
}
