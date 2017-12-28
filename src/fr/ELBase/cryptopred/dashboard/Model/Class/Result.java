package fr.ELBase.cryptopred.dashboard.Model.Class;

public class Result {

    private String marketName;
    private Long high;
    private Long low;
    private Long volume;
    private Long last;
    private Long baseVolume;
    private String timestamp;
    private int bId;
    private int ask;
    private int openBuyOrders;
    private int openSellOrders;
    private int prevDay;
    private String createdTime;

    public Result () {

    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
        this.low = low;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getLast() {
        return last;
    }

    public void setLast(Long last) {
        this.last = last;
    }

    public Long getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(Long baseVolume) {
        this.baseVolume = baseVolume;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public int getOpenBuyOrders() {
        return openBuyOrders;
    }

    public void setOpenBuyOrders(int openBuyOrders) {
        this.openBuyOrders = openBuyOrders;
    }

    public int getOpenSellOrders() {
        return openSellOrders;
    }

    public void setOpenSellOrders(int openSellOrders) {
        this.openSellOrders = openSellOrders;
    }

    public int getPrevDay() {
        return prevDay;
    }

    public void setPrevDay(int prevDay) {
        this.prevDay = prevDay;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
}
