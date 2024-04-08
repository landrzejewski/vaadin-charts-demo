package pl.training.charts.model;

import pl.training.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class BarChartDataset extends AbstractChartDataset {

    private List<Color> borderColor;
    private String borderSkipped;
    private Integer borderWidth;
    private Integer hoverBorderWidth;
    private List<Color> hoverBackgroundColor;
    private List<Color> hoverBorderColor;
    private String xAxisID;
    private String yAxisID;
    private List<Color> backgroundColor = new ArrayList<>();

    public List<Color> getBackgroundColor() {
        return backgroundColor;
    }

    public BarChartDataset setBackgroundColor(List<Color> backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public List<Color> getBorderColor() {
        return borderColor;
    }

    public BarChartDataset setBorderColor(List<Color> borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public String getBorderSkipped() {
        return borderSkipped;
    }

    public BarChartDataset setBorderSkipped(String borderSkipped) {
        this.borderSkipped = borderSkipped;
        return this;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public BarChartDataset setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public BarChartDataset setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
        return this;
    }

    public List<Color> getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public BarChartDataset setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
        return this;
    }

    public List<Color> getHoverBorderColor() {
        return hoverBorderColor;
    }

    public BarChartDataset setHoverBorderColor(List<Color> hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
        return this;
    }

    public String getxAxisID() {
        return xAxisID;
    }

    public BarChartDataset setxAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
        return this;
    }

    public String getyAxisID() {
        return yAxisID;
    }

    public BarChartDataset setyAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
        return this;
    }

}
