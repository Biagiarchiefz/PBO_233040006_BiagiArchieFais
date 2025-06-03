package StudyKasus;

public class InfoMain {

    public static void main(String[] args) {

        Mobil mobil = new Mobil();
        mobil.tampilkanJenis();
        mobil.jalan();
        mobil.berhenti();
        mobil.roda();

        System.out.println();

        Sepeda sepeda = new Sepeda();
        sepeda.tampilkanJenis();
        sepeda.jalan();
        sepeda.berhenti();
        sepeda.roda();
    }
    }

