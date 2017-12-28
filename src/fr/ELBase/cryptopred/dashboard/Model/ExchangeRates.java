package fr.ELBase.cryptopred.dashboard.Model;

import com.google.gson.Gson;
import fr.ELBase.cryptopred.dashboard.Model.Class.Ticker;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ExchangeRates {

    private Ticker ticker;
    private String timestamp;
    private Boolean success;
    private String error;

    public ExchangeRates () {
    }

    public void getFromJson (String base, String target) {

        try {
            URL formattedUrl = new URL("https://api.cryptonator.com/api/full/"+base+"-"+target);
            InputStreamReader reader = new InputStreamReader(formattedUrl.openStream());
            ExchangeRates exchangeRates = new Gson().fromJson(reader, ExchangeRates.class);

            this.ticker = exchangeRates.getTicker();
            this.timestamp = exchangeRates.getTimestamp();
            this.success = exchangeRates.getSuccess();
            this.error = exchangeRates.getError();

        } catch (IOException mE) {}

    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
