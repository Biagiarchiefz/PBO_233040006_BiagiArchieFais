package Abstrack_Interface.Latihan2;

public class InterfaceMain {
    public static void main(String[] args) {
        // menjalankan program yang kita buat yang menerapkan kelas interface
        KartuElektronik kartu = new KartuElektronik("IF11", "12345");

        System.out.println("Otentikasi = " + kartu.otentikasi("12345"));

    }
}
