package Abstrack_Interface.Latihan1;

public class Tabung extends Bentuk{
    private int tinggi;

    // konstruktor
    public Tabung(){
        super(0);
    }

    // kontruktor dengan parameter
    public Tabung(int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }


    // method luas() yang wajib di impelemtasikan dari class Bentuk Abstrak
    public double luas(){
        return 2*PHI*jari2*(jari2 + tinggi);
    }


    // getter dan setter
    public int getTinggi(){
        return this.tinggi;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }




}
