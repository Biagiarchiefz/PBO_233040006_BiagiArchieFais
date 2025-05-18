package Abstrack_Interface;

public class Burung extends Hewan implements BisaTerbang{
    public Burung(String nama){
        super(nama);
    }

    // overidde dari class hewan
    public void bersuara(){
        System.out.println("cuit - cuit");
    }

    public void terbang(){
        System.out.println(nama + " sedang terbang");
    }


}
