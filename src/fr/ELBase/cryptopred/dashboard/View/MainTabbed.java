package fr.ELBase.cryptopred.dashboard.View;

import fr.ELBase.cryptopred.dashboard.View.Component.ExchangeRatesComponent;
import fr.ELBase.cryptopred.dashboard.View.Component.MarketSummaryComponent;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MainTabbed extends JTabbedPane {

    // Icon et Objet Exchange Rates
    private ImageIcon exchangeRatesIcon = null;
    private JComponent exchangeRates = new ExchangeRatesComponent();

    // Icon et Objet Market Summary
    private ImageIcon marketSummaryIcon = null;
    private JComponent marketSummary = new MarketSummaryComponent();

    public MainTabbed () {

        // TabbedPanel ajout du JPanel
        this.addTab("Exchange Rates", exchangeRatesIcon ,exchangeRates,"Get last exchange rates !");
        // Appel mnémonique pour touche clavier
        this.setMnemonicAt(0, KeyEvent.VK_1);

        // TabbedPanel ajout du JPanel
        this.addTab("Market Summary", marketSummaryIcon ,marketSummary,"All market summary !");
        // Appel mnémonique pour touche clavier
        this.setMnemonicAt(1, KeyEvent.VK_2);

    }

}
