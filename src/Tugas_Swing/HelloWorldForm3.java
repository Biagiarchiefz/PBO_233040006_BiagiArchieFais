package Tugas_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm3 extends JFrame implements ActionListener {

    private JLabel label; //2
    private JButton button;

    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello world!");

        button = new JButton("Klik Mel");
        button.addActionListener(this);

        setLayout(new GridLayout(2, 1));
        add(label);
        add(button);

        setTitle("My First Program");
        setVisible(true);
        setSize(300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunial");
    }
}