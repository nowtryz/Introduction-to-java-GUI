package net.nowtryz.info641.td5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExB extends AbstractCenteredComponent implements ActionListener {

    private JLabel label = new JLabel("Vous n'avez pas chosi de couleur");
    public ExB() {
        super();

        String greenString = "Vert", redString = "Rouge", yellowString = "Jaune";
        JRadioButton
                red = new JRadioButton(redString),
                green = new JRadioButton(greenString),
                yellow = new JRadioButton(yellowString);

        red.setActionCommand(redString);
        green.setActionCommand(greenString);
        yellow.setActionCommand(yellowString);

        red.addActionListener(this);
        green.addActionListener(this);
        yellow.addActionListener(this);

        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(green);
        bg.add(yellow);

        this.add(label);
        this.add(red);
        this.add(yellow);
        this.add(green);
    }

    public static void main(String[] args) {
        JFrame frame = Utils.basicFrame("Exercice B");
        frame.add(new ExB());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText("Vous avez sélectionné le " + e.getActionCommand());
    }
}
