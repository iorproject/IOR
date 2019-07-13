package dbObjects;

import java.util.List;

public class ApproveIndicator {
    private List<String> indicators;
    private int score;

    public ApproveIndicator(List<String> indicators, int score) {
        this.indicators = indicators;
        this.score = score;
    }

    public List<String> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<String> indicators) {
        this.indicators = indicators;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
