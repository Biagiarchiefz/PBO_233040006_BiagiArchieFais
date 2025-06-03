package Abstrack_Interface.StudyKasus;


//Kita punya beberapa alat musik seperti Gitar dan Drum. Semua alat musik harus punya cara untuk bermain (play) .
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Gitar ===");
        Gitar G = new Gitar();
        G.info();
        G.play();

        System.out.println("\n");
        System.out.println("=== Drum ===");
        Drum D = new Drum();
        D.info();
        D.play();
    }
}
