package Abstrack_Interface.Latihan1;

public class Lingkaran extends Bentuk {

    // konstruktor
    public Lingkaran(int jari2){
        super(jari2);
    }

    // mengimplementasikan method luas() abstrak dari kelas abstark Bentuk
    // wajib di implementasikan
    public double luas(){
        return PHI*jari2*jari2;
    }

//    public int getJari2() {
//        return this.jari2;
//    }

}
