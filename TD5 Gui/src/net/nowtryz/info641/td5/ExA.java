package net.nowtryz.info641.td5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExA extends AbstractCenteredComponent implements ActionListener {
    private int count = 0;
    private JLabel label = new JLabel("Vous n'avez pas cliquez sur le bouton");

    public ExA() {
        super();

        JButton button = new JButton("Cliquez sur le bouton");
        button.addActionListener(this);

        this.add(label);
        this.add(button);
    }

    public static void main(String[] args) {
        JFrame frame = Utils.basicFrame("Exercice A");
        frame.add(new ExA());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.count++;
        this.label.setText("Vous avez cliquez " + count + " fois.");
    }
}
