package net.nowtryz.info641.td5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExC extends AbstractCenteredComponent implements ActionListener {
    private static String EXA = "Exercice A", EXB = "Exercice B";

    private JLabel label = new JLabel("Vous n'avez effectuez aucune action");
    private JButton button = new JButton("Cliquez sur le bouton");
    private String mode = EXA;
    private int count = 0;

    public ExC() {
        super();

        button.addActionListener(this);


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

        JButton closeButton = new JButton("Sortir");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null, "Voulez-vous sortir ?");
                if (answer == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        this.add(new Selector());
        this.add(label);
        this.add(button);
        this.add(red);
        this.add(yellow);
        this.add(green);
        this.add(closeButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.mode == EXA) {
            if (e.getSource().equals(button)) {
                this.count++;
                this.label.setText("Vous avez cliquez " + count + " fois.");
            }
        } else {
            this.label.setText("Vous avez sélectionné le " + e.getActionCommand());
        }
    }

    private class Selector extends AbstractCenteredComponent implements ActionListener{
        public Selector() {
            super();

            JRadioButton
                    exA = new JRadioButton(EXA),
                    exB = new JRadioButton(EXB);

            exA.setSelected(true);

            exA.setActionCommand(EXA);
            exB.setActionCommand(EXB);

            exA.addActionListener(this);
            exB.addActionListener(this);

            ButtonGroup bg = new ButtonGroup();
            bg.add(exA);
            bg.add(exB);

            this.add(new JLabel("Choisissez un mode de fonctionnement"));
            this.add(exA);
            this.add(exB);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            mode = e.getActionCommand();
            if (EXA.equals(mode)) button.setEnabled(true);
            else button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        JFrame frame = Utils.basicFrame("Exercice C");
        frame.add(new ExC());
        frame.setVisible(true);
    }
}
