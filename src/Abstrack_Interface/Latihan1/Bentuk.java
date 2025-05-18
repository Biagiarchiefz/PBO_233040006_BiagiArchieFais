package Abstrack_Interface.Latihan1;

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2){
//        super();
        this.jari2 = jari2;
    }

    // method abstrak dari kelas abstrak bentuk
    // method ini wajib di impelemntasikan di class subclassnya karna dia berbentuk abstrak
    public abstract double luas();

    public int getJari2(){
        return jari2;
    }

    public void setJari2(int jari2){
        this.jari2 = jari2;
    }



}
