package Abstrack_Interface.Latihan2;

public interface Kartu {

    // method ini wajib di impelemtasi di class yang implement class Kartu ini
    // kalau salah satu tidak di impelemtasikan akan error
    public boolean otentikasi(String pin);
    public String encode(String pin);
}
