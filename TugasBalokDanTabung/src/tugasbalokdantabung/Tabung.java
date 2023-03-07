package tugasbalokdantabung;

/**
 *
 * @author HP
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    
    @Override
    public double volume() {
       return super.luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return super.keliling()*(super.jari + tinggi);
    }
    
}
