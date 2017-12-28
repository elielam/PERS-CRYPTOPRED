package fr.ELBase.cryptopred.dashboard.Model;

import com.google.gson.Gson;
import fr.ELBase.cryptopred.dashboard.Model.Class.Result;

import javax.swing.border.Border;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MarketSummary {

    private Boolean success;
    private String message;
    private Result result;

    public MarketSummary () {

    }

    public void getFromJson (String base, String target) {

        try {
            URL formattedUrl = new URL("https://bittrex.com/api/v1.1/public/getmarketsummary?market="+base+"-"+target);
            InputStreamReader reader = new InputStreamReader(formattedUrl.openStream());
            MarketSummary marketSummary = new Gson().fromJson(reader, MarketSummary.class);
            this.success = marketSummary.getSuccess();
            this.message = marketSummary.getMessage();
            this.result = marketSummary.getResult();
        } catch (IOException mE) {}

    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
