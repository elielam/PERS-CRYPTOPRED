package fr.ELBase.cryptopred.dashboard.Model.Class;

import java.util.ArrayList;

public class Ticker {

    private String base;
    private String target;
    private String price;
    private String volume;
    private String change;
    private ArrayList<Market> markets;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public ArrayList<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(ArrayList<Market> markets) {
        this.markets = markets;
    }

}
