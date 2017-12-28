package fr.ELBase.cryptopred.dashboard.View.Component;

import fr.ELBase.cryptopred.dashboard.Model.Class.Market;
import fr.ELBase.cryptopred.dashboard.Model.Class.Ticker;
import fr.ELBase.cryptopred.dashboard.Model.ExchangeRates;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExchangeRatesComponent extends JPanel implements ActionListener {

    private JLabel title = new JLabel("Exchange Rate Component");
    private JTextField baseField;
    private JTextField targetField;
    private JButton getButton;
    private JLabel baseLabel;
    private JLabel targetLabel;
    private JLabel priceLabel;
    private JLabel volumeLabel;
    private JLabel changeLabel;
    private JTable marketTable;

    public ExchangeRatesComponent () {

        // Panel title
        this.title.setBounds(35,10,200,40);

        // Panel layout
        this.setLayout(null);
        this.setBounds(0,0,1000,1000);

        // Panel Button
        this.baseField = new JTextField();
        this.targetField = new JTextField();
        this.getButton = new JButton("Get Exchange Rates");
        this.baseField.setBounds(35, 60, 200, 30);
        this.targetField.setBounds(245,60,200,30);
        this.getButton.setBounds(35,110,410,35);

        // Panel informations
        this.baseLabel = new JLabel("Base :");
        this.targetLabel = new JLabel("Target :");
        this.priceLabel = new JLabel("Price :");
        this.volumeLabel = new JLabel("Volume :");
        this.changeLabel = new JLabel("Change :");
        this.marketTable = new JTable();
        this.baseLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.targetLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.priceLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.volumeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.changeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.baseLabel.setBounds(35,140,200,200);
        this.targetLabel.setBounds(150,140,200,200);
        this.priceLabel.setBounds(35,180,200,200);
        this.volumeLabel.setBounds(35,220,200,200);
        this.changeLabel.setBounds(35,260,200,200);
        JScrollPane uneScroll = new JScrollPane(this.marketTable);
        uneScroll.setBounds(400,230,1400,150);

        // Panel visible?
        this.setVisible(true);

        // Key Listener
        this.getButton.addActionListener(this);

        // Test
        JLabel todo = new JLabel("Some analysis about the best marketplace to buy or sell cryptocurrency");
        todo.setBounds(550,400,1200,200);
        todo.setFont(new Font("Serif", Font.PLAIN, 25));

        // Panel components
        this.add(title);
        this.add(baseField);
        this.add(targetField);
        this.add(getButton);
        this.add(baseLabel);
        this.add(targetLabel);
        this.add(priceLabel);
        this.add(volumeLabel);
        this.add(changeLabel);
        this.add(uneScroll);
        this.add(todo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.getButton) {

            ExchangeRates exchangeRates = new ExchangeRates();
            exchangeRates.getFromJson(this.baseField.getText(), this.targetField.getText());
            Ticker ticker = exchangeRates.getTicker();

            this.baseLabel.setText("Base :  "+ticker.getBase());
            this.targetLabel.setText("Target :  "+ticker.getTarget());
            this.priceLabel.setText("Price :  "+ticker.getPrice()+" "+ticker.getTarget());
            if (ticker.getVolume().isEmpty()){ this.volumeLabel.setText("Volume :  0"); } else { this.volumeLabel.setText("Volume :  "+ticker.getVolume()+" "+ticker.getBase()); }
            this.changeLabel.setText("Change :  "+ticker.getChange());

            this.baseLabel.validate();
            this.targetLabel.validate();
            this.priceLabel.validate();
            this.volumeLabel.validate();
            this.changeLabel.validate();

            int i = 0;
            String[] titre = {"Market name", "Price", "Volume"};
            Object [][] donnees = new Object [ticker.getMarkets().size()][3];
            String nullText = "null";
            for (Market market : ticker.getMarkets()) {

                donnees[i][0] = market.getMarket();
                donnees[i][1] = market.getPrice()+" "+ticker.getTarget();
                donnees[i][2] = market.getVolume()+" "+ticker.getBase();

                i++;
            }

            marketTable.setModel(new DefaultTableModel(donnees, titre));

        }
    }


}

