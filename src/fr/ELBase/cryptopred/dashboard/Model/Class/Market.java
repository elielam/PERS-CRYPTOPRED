package fr.ELBase.cryptopred.dashboard.Model.Class;

public class Market {

    private String market;
    private String price;
    private String volume;

    public Market (String market, String price, String volume) {

        this.market = market;
        this.price = price;
        this.volume = volume;

    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
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
}
