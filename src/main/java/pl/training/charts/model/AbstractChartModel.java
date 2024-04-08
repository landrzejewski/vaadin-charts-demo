package pl.training.charts.model;

public abstract class AbstractChartModel {

    private final String type;
    private ChartData data;
    private Options options = new Options();

    public AbstractChartModel(String type) {
        this.type = type;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public ChartData getData() {
        return data;
    }

    public void setData(ChartData data) {
        this.data = data;
    }

}
