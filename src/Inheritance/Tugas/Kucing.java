package Inheritance.Tugas;

public class Kucing extends Hewan {
    private String warna;

    public Kucing(String nama, String warna){
        super(nama);
        this.warna = warna;
    }

    // override
    public void suara(){
        System.out.println(nama + " berwarna " + warna + " mengeong");
    }
}
