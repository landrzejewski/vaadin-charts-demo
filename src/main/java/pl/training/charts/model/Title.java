package pl.training.charts.model;

public class Title {

    private boolean display;
    private String text;

    public boolean isDisplay() {
        return display;
    }

    public Title setDisplay(boolean display) {
        this.display = display;
        return this;
    }

    public String getText() {
        return text;
    }

    public Title setText(String text) {
        this.text = text;
        return this;
    }

}
