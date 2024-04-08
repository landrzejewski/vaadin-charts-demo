package pl.training.charts.model;

import java.util.ArrayList;
import java.util.List;

public class AbstractChartDataset {

    private List<Double> data = new ArrayList<>();
    private String label;

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
