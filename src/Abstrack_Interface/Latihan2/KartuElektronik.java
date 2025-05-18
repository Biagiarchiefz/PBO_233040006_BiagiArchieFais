package Abstrack_Interface.Latihan2;

public class KartuElektronik implements Kartu {
    private String kodeBank;
    private String pin;

    // konstruktor
    public KartuElektronik(String kodeBank, String pin){
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }


    // equals() membandingkan isi dari objek (apakah dua String punya isi teks yang sama).
    // mengimplemetasikan method yang di deklarasi dari class Kartu
    // method ini mengecek apakah isi dari pin yang kita masukkan di konstruktor sama tidak dengan pin pada saat kita manggil method ini
    // kalau sama dia akau print pin ada cocok dan mengembalikan nilai true dan kalau salah akan mengembalikan nilai false
    public boolean otentikasi(String pinInput){
        if (this.pin.equals(pinInput)){
            System.out.println("pin ada cocok");
            return true;
        } else {
            return false;
        }
    }

    // mengimplementasikan method dari kelas Kartu
    public String encode(String pin){
        return null;
    }




}
