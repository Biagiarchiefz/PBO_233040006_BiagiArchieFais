package Tugas_Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame { //1

    private JLabel label; //2

    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Hallo Dunia!");
        add(label);
        setTitle("Program pertama");
        setSize(600, 300);
    }
}