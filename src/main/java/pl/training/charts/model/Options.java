package pl.training.charts.model;

public class Options {

    private Legend legend = new Legend();
    private Title title = new Title();

    public Title getTitle() {
        return title;
    }

    public Options setTitle(Title title) {
        this.title = title;
        return this;
    }

    public Legend getLegend() {
        return legend;
    }

    public Options setLegend(Legend legend) {
        this.legend = legend;
        return this;
    }

}
