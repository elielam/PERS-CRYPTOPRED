package fr.ELBase.cryptopred.dashboard.View;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JTabbedPane panel = new MainTabbed();

    public MainFrame () {

        // Frame title
        this.setTitle("CryptoPred");

        // Frame sizing fullscreen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Frame fullscreen with no border
        this.setUndecorated(true);

        // Add panel
        this.setContentPane(this.panel);

        // Frame visible?
        this.setVisible(true);

    }
}
