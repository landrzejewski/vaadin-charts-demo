package pl.training.charts.model;

import java.util.ArrayList;
import java.util.List;

public class ChartData {

    private List<String> labels = new ArrayList<>();
    private List<AbstractChartDataset> datasets = new ArrayList<>();

    public List<String> getLabels() {
        return labels;
    }

    public ChartData setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public List<AbstractChartDataset> getDatasets() {
        return datasets;
    }

    public ChartData setDatasets(List<AbstractChartDataset> datasets) {
        this.datasets = datasets;
        return this;
    }

}
