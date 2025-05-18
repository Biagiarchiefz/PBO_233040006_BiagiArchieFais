package Inheritance.Tugas;

public class Hewan {
    protected String nama;
    public Hewan(String nama){
        this.nama = nama;
    }

    public void suara(){
        System.out.println(nama + " mengeluarkan suara");
    }
}
