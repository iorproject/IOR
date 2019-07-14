package main.java.DB.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TotalIndicator implements Serializable {
    private Map<Integer,List<String>> indicators;

    public TotalIndicator(Map<Integer,List<String>> indicators) {
        this.indicators = indicators;
    }

    public Map<Integer,List<String>> getIndicator() {
        return indicators;
    }

    public void setIndicator(Map<Integer,List<String>> indicators) {
        this.indicators = indicators;
    }

}
