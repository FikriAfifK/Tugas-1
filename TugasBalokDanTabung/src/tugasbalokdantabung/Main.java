package tugasbalokdantabung;

/**
 *
 * @author HP
 */

//mengimport scanner ke program
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dekrarasi variabel
        double panjang, lebar, tinggi, jari;
        char loop = 'y';
        int pilihan;
        
        //membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        while (loop == 'y' || loop == 'Y'){
            System.out.println("Menu: ");
            System.out.println("------------");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Exit");
            System.out.println("------------");
            System.out.print("Pilihan Menu: ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1:
                    //input nilai
                    System.out.print("Input Panjang = ");
                    panjang = input.nextDouble();
                    System.out.print("Input Lebar = ");
                    lebar = input.nextDouble();
                    System.out.print("Input Tinggi = ");
                    tinggi = input.nextDouble();
                    //membuat object balok
                    Balok balok = new Balok(tinggi, panjang, lebar);
                    //output hasil
                    System.out.println("Luas Persegi Panjang = " + balok.luas());
                    System.out.println("Keliling Persegi Panjang = " + balok.keliling());
                    System.out.println("Volume Balok = " + balok.volume());
                    System.out.println("Luas Permukaan Balok = " + balok.luasPermukaan());
                    break;
                    
                case 2:
                    //input nilai
                    System.out.print("Input Jari-jari = ");
                    jari = input.nextDouble();
                    System.out.print("Input Tinggi = ");
                    tinggi = input.nextDouble();
                    //membuat object tabung
                    Tabung tabung = new Tabung(tinggi, jari);
                    //output hasil
                    System.out.println("Luas Lingkaran = " + tabung.luas());
                    System.out.println("Keliling Lingkaran = " + tabung.keliling());
                    System.out.println("Volume Tabung = " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.luasPermukaan());
                    break;
                
                case 3:
                    break;
            }
            if(pilihan == 3){
                break;
            }
            System.out.print("Kembali ke menu awal? (y/n): ");
            loop = input.next().charAt(0);
        }
    }
    
}
