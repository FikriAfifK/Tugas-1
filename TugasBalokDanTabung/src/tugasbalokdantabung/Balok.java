package tugasbalokdantabung;

/**
 *
 * @author HP
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    
    @Override
    public double volume() {
        return super.luas()*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*(super.luas()+(super.panjang*tinggi)+(super.lebar*tinggi));
    }
    
}
