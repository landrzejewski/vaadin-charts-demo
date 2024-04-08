package pl.training.charts.model.enums;

import pl.training.charts.model.AbstractChartDataset;
import pl.training.utils.Color;

import java.util.ArrayList;
import java.util.List;

public class PieChartDataset extends AbstractChartDataset {

    private List<Color> backgroundColor = new ArrayList<>();
    private BorderAlign borderAlign;
    private Color borderColor;
    private Integer borderWidth;
    private List<Color> hoverBackgroundColor;
    private Color hoverBorderColor;
    private Integer hoverBorderWidth;
    private Integer weight;

    public List<Color> getBackgroundColor() {
        return backgroundColor;
    }

    public PieChartDataset setBackgroundColor(List<Color> backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public BorderAlign getBorderAlign() {
        return borderAlign;
    }

    public PieChartDataset setBorderAlign(BorderAlign borderAlign) {
        this.borderAlign = borderAlign;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public PieChartDataset setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public PieChartDataset setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public List<Color> getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public PieChartDataset setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
        return this;
    }

    public Color getHoverBorderColor() {
        return hoverBorderColor;
    }

    public PieChartDataset setHoverBorderColor(Color hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
        return this;
    }

    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public PieChartDataset setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public PieChartDataset setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

}
