package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Bentuk l = new Lingkaran();
        Bentuk T = new Tabung();

        Lingkaran l1 = new Lingkaran();

        l.gambar();

        T.gambar();
        l1.gambar();
        l1.hitungLuas();
    }
}
