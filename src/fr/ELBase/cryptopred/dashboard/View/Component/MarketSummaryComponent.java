package fr.ELBase.cryptopred.dashboard.View.Component;

import fr.ELBase.cryptopred.dashboard.Model.Class.Result;
import fr.ELBase.cryptopred.dashboard.Model.MarketSummary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarketSummaryComponent extends JPanel implements ActionListener {

    private JTextField baseField;
    private JTextField targetField;
    private JButton getButton;
    private JLabel marketName;
    private JLabel high;
    private JLabel low;
    private JLabel volume;
    private JLabel last;
    private JLabel baseVolume;
    private JLabel timestamp;
    private JLabel bId;
    private JLabel ask;
    private JLabel openBuyOrders;
    private JLabel openSellOrders;
    private JLabel prevDay;
    private JLabel createdTime;

    public MarketSummaryComponent () {

        // Panel title
        JLabel title = new JLabel("Market Summary Component");
        title.setBounds(35,10,200,40);

        // Panel JButton
        this.baseField = new JTextField();
        this.targetField = new JTextField();
        this.getButton = new JButton("Get Market Summary");
        this.baseField.setBounds(35, 60, 200, 30);
        this.targetField.setBounds(245,60,200,30);
        this.getButton.setBounds(35,110,410,35);

        // Panel Information
        this.marketName = new JLabel("Name : ");
        this.high = new JLabel("Base : ");
        this.low = new JLabel("Target : ");
        this.volume = new JLabel("Volume : ");
        this.last = new JLabel("Last : ");
        this.baseVolume = new JLabel("Base Volume : ");
        this.timestamp = new JLabel("Timestamp : ");
        this.bId = new JLabel("bID : ");
        this.ask = new JLabel("Ask : ");
        this.openBuyOrders = new JLabel("Open Buy Order : ");
        this.openSellOrders = new JLabel("Open Sell Order : ");
        this.prevDay = new JLabel("Previous Day : ");
        this.createdTime = new JLabel("Created DateTime : ");
        this.marketName.setBounds(35,140,200,200);
        this.high.setBounds(35,180,200,200);
        this.low.setBounds(300,180,200,200);
        this.volume.setBounds(35,220,200,200);
        this.baseVolume.setBounds(300,220,200,200);
        this.last.setBounds(35,260,200,200);
        this.bId.setBounds(300,260,200,200);
        this.openBuyOrders.setBounds(35,300,200,200);
        this.openSellOrders.setBounds(300,300,200,200);
        this.ask.setBounds(35,340,200,200);
        this.prevDay.setBounds(300,340,200,200);
        this.timestamp.setBounds(35,400,200,200);
        this.createdTime.setBounds(300,400,200,200);

        this.marketName.setFont(new Font("Serif", Font.PLAIN, 16));
        this.high.setFont(new Font("Serif", Font.PLAIN, 16));
        this.low.setFont(new Font("Serif", Font.PLAIN, 16));
        this.volume.setFont(new Font("Serif", Font.PLAIN, 16));
        this.baseVolume.setFont(new Font("Serif", Font.PLAIN, 16));
        this.last.setFont(new Font("Serif", Font.PLAIN, 16));
        this.bId.setFont(new Font("Serif", Font.PLAIN, 16));
        this.openBuyOrders.setFont(new Font("Serif", Font.PLAIN, 16));
        this.openSellOrders.setFont(new Font("Serif", Font.PLAIN, 16));
        this.ask.setFont(new Font("Serif", Font.PLAIN, 16));
        this.prevDay.setFont(new Font("Serif", Font.PLAIN, 16));
        this.timestamp.setFont(new Font("Serif", Font.PLAIN, 16));
        this.createdTime.setFont(new Font("Serif", Font.PLAIN, 16));

        // Panel Layout
        this.setLayout(null);
        this.setBounds(0,0,1000,1000);


        // Panel components
        this.add(title);
        this.add(baseField);
        this.add(targetField);
        this.add(getButton);
        this.add(this.marketName);
        this.add(this.high);
        this.add(this.low);
        this.add(this.volume);
        this.add(this.last);
        this.add(this.baseVolume);
        this.add(this.timestamp);
        this.add(this.bId);
        this.add(this.ask);
        this.add(this.openBuyOrders);
        this.add(this.openSellOrders);
        this.add(this.prevDay);
        this.add(this.createdTime);

        // Panel ActionListener
        this.getButton.addActionListener(this);

        // Panel visible?
        this.setVisible(true);

        // Test

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.getButton) {

            MarketSummary marketSummary = new MarketSummary();
            marketSummary.getFromJson(this.baseField.getText(), this.targetField.getText());
            Result result = marketSummary.getResult();

            this.marketName.setText("Name : "+result.getMarketName());
            this.high.setText("High : "+result.getHigh());
            this.low.setText("Low : "+result.getLow());
            this.volume.setText("Volume : "+result.getVolume());
            this.baseVolume.setText("Base Volume : "+result.getBaseVolume());
            this.last.setText("Last : "+result.getLast());
            this.bId.setText("bId : "+result.getbId());
            this.openBuyOrders.setText("Open Buy Order : "+result.getOpenBuyOrders());
            this.openSellOrders.setText("Open Sell Order : "+result.getOpenSellOrders());
            this.ask.setText("Ask : "+result.getAsk());
            this.prevDay.setText("Previous Day : "+result.getPrevDay());
            this.timestamp.setText("Timestamp : "+result.getTimestamp());
            this.createdTime.setText("Created DateTime : "+result.getCreatedTime());

            this.marketName.validate();
            this.high.validate();
            this.low.validate();
            this.volume.validate();
            this.baseVolume.validate();
            this.last.validate();
            this.bId.validate();
            this.openBuyOrders.validate();
            this.openSellOrders.validate();
            this.ask.validate();
            this.prevDay.validate();
            this.timestamp.validate();
            this.createdTime.validate();

        }
    }
}
