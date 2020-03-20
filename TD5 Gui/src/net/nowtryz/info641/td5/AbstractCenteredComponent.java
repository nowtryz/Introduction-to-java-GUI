package net.nowtryz.info641.td5;

import javax.swing.*;

public abstract class AbstractCenteredComponent extends JPanel {
    public AbstractCenteredComponent() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
}
