package Abstrack_Interface.Latihan1;

public class Main {
    public static void main(String[] args) {

        Lingkaran l1 = new Lingkaran(9);
        System.out.println("==== Lingkaran ====");
        System.out.println("jari jari = " + l1.jari2);
        System.out.println("Luas = " + l1.luas());


        Tabung t1 = new Tabung(10,5);
        System.out.println("==== Tabung ====");
        System.out.println("jari jari = " + t1.jari2);
        System.out.println("Luas = " + t1.luas());
    }


}
