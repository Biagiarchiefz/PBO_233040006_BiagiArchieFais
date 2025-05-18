package Abstrack_Interface.Latihan1;

public class Lingkaran extends Bentuk {

    public Lingkaran(int jari2){
        super(jari2);
    }

    public double luas(){
        return PHI*jari2*jari2;
    }

//    public int getJari2() {
//        return this.jari2;
//    }

}
