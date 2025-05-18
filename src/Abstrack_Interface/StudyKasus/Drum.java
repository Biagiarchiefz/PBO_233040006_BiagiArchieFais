package Abstrack_Interface.StudyKasus;

public class Drum extends Musik implements Dimainkan {

    // mengimplementasikan class yang di deklarasikan dari class interface Dimainkan
    public void play(){
        System.out.println("drum dimainkan dengan cara dipukul");
    }
}
