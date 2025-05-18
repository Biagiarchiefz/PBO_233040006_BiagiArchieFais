package Abstrack_Interface.StudyKasus;

public class Gitar extends Musik implements Dimainkan {

    // mengimplementasikan method yang wajib digunakan dari kelas interface Dimainkan
    public void play(){
        System.out.println("gitar dimainkan dengan cara dipetik");
    }

    // mengoverride method info dari class music
    public void info(){
        System.out.println("gitar merupakan alat musik yang paling populer");
    }

}
