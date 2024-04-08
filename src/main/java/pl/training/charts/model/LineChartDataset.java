package pl.training.charts.model;

import pl.training.charts.model.enums.*;
import pl.training.utils.Color;

import java.util.List;

public class LineChartDataset extends AbstractChartDataset{

    private Color backgroundColor;
    private CapStyle borderCapStyle;
    private Color borderColor;
    private List<Integer> borderDash;
    private Double borderDashOffset;
    private JoinStyle borderJoinStyle;
    private Integer borderWidth;
    private CubicInterpolaionMode cubicInterpolationMode;
    private Integer clip;
    private Boolean fill;
    private Color hoverBackgroundColor;
    private CapStyle hoverBorderCapStyle;
    private Integer hoverBorderDashOffset;
    private JoinStyle hoverBorderJoinStyle;
    private Integer hoverBorderWidth;
    private Double lineTension;
    private Integer order;
    private Color pointBackgroundColor;
    private Color pointBorderColor;
    private Integer pointBorderWidth;
    private Integer pointHitRadius;
    private Color pointHoverBackgroundColor;
    private Color pointHoverBorderColor;
    private Integer pointHoverBorderWidth;
    private Integer pointHoverRadius;
    private Integer pointRadius;
    private Integer pointRotation;
    private PointStyle pointStyle;
    private Boolean showLine;
    private Boolean spanGaps;
    private SteppedLine steppedLine;


    public CapStyle getBorderCapStyle() {
        return borderCapStyle;
    }

    public LineChartDataset setBorderCapStyle(CapStyle borderCapStyle) {
        this.borderCapStyle = borderCapStyle;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public LineChartDataset setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public List<Integer> getBorderDash() {
        return borderDash;
    }

    public LineChartDataset setBorderDash(List<Integer> borderDash) {
        this.borderDash = borderDash;
        return this;
    }

    public Double getBorderDashOffset() {
        return borderDashOffset;
    }

    public LineChartDataset setBorderDashOffset(Double borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
        return this;
    }

    public JoinStyle getBorderJoinStyle() {
        return borderJoinStyle;
    }

    public LineChartDataset setBorderJoinStyle(JoinStyle borderJoinStyle) {
        this.borderJoinStyle = borderJoinStyle;
        return this;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public LineChartDataset setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public CubicInterpolaionMode getCubicInterpolationMode() {
        return cubicInterpolationMode;
    }

    public LineChartDataset setCubicInterpolationMode(CubicInterpolaionMode cubicInterpolationMode) {
        this.cubicInterpolationMode = cubicInterpolationMode;
        return this;
    }

    public Integer getClip() {
        return clip;
    }

    public LineChartDataset setClip(Integer clip) {
        this.clip = clip;
        return this;
    }

    public Boolean getFill() {
        return fill;
    }

    public LineChartDataset setFill(Boolean fill) {
        this.fill = fill;
        return this;
    }

    public CapStyle getHoverBorderCapStyle() {
        return hoverBorderCapStyle;
    }

    public LineChartDataset setHoverBorderCapStyle(CapStyle hoverBorderCapStyle) {
        this.hoverBorderCapStyle = hoverBorderCapStyle;
        return this;
    }

    public Integer getHoverBorderDashOffset() {
        return hoverBorderDashOffset;
    }

    public LineChartDataset setHoverBorderDashOffset(Integer hoverBorderDashOffset) {
        this.hoverBorderDashOffset = hoverBorderDashOffset;
        return this;
    }

    public JoinStyle getHoverBorderJoinStyle() {
        return hoverBorderJoinStyle;
    }

    public LineChartDataset setHoverBorderJoinStyle(JoinStyle hoverBorderJoinStyle) {
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
        return this;
    }

    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public LineChartDataset setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
        return this;
    }

    public Double getLineTension() {
        return lineTension;
    }

    public LineChartDataset setLineTension(Double lineTension) {
        this.lineTension = lineTension;
        return this;
    }

    public Integer getOrder() {
        return order;
    }

    public LineChartDataset setOrder(Integer order) {
        this.order = order;
        return this;
    }

    public Integer getPointBorderWidth() {
        return pointBorderWidth;
    }

    public LineChartDataset setPointBorderWidth(Integer pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
        return this;
    }

    public Integer getPointHitRadius() {
        return pointHitRadius;
    }

    public LineChartDataset setPointHitRadius(Integer pointHitRadius) {
        this.pointHitRadius = pointHitRadius;
        return this;
    }

    public Integer getPointHoverBorderWidth() {
        return pointHoverBorderWidth;
    }

    public LineChartDataset setPointHoverBorderWidth(Integer pointHoverBorderWidth) {
        this.pointHoverBorderWidth = pointHoverBorderWidth;
        return this;
    }

    public Integer getPointHoverRadius() {
        return pointHoverRadius;
    }

    public LineChartDataset setPointHoverRadius(Integer pointHoverRadius) {
        this.pointHoverRadius = pointHoverRadius;
        return this;
    }

    public Integer getPointRadius() {
        return pointRadius;
    }

    public LineChartDataset setPointRadius(Integer pointRadius) {
        this.pointRadius = pointRadius;
        return this;
    }

    public Integer getPointRotation() {
        return pointRotation;
    }

    public LineChartDataset setPointRotation(Integer pointRotation) {
        this.pointRotation = pointRotation;
        return this;
    }

    public PointStyle getPointStyle() {
        return pointStyle;
    }

    public LineChartDataset setPointStyle(PointStyle pointStyle) {
        this.pointStyle = pointStyle;
        return this;
    }

    public Boolean getShowLine() {
        return showLine;
    }

    public LineChartDataset setShowLine(Boolean showLine) {
        this.showLine = showLine;
        return this;
    }

    public Boolean getSpanGaps() {
        return spanGaps;
    }

    public LineChartDataset setSpanGaps(Boolean spanGaps) {
        this.spanGaps = spanGaps;
        return this;
    }

    public SteppedLine getSteppedLine() {
        return steppedLine;
    }

    public LineChartDataset setSteppedLine(SteppedLine steppedLine) {
        this.steppedLine = steppedLine;
        return this;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public LineChartDataset setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Color getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public LineChartDataset setHoverBackgroundColor(Color hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
        return this;
    }

    public Color getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public LineChartDataset setPointBackgroundColor(Color pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
        return this;
    }

    public Color getPointBorderColor() {
        return pointBorderColor;
    }

    public LineChartDataset setPointBorderColor(Color pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
        return this;
    }

    public Color getPointHoverBackgroundColor() {
        return pointHoverBackgroundColor;
    }

    public LineChartDataset setPointHoverBackgroundColor(Color pointHoverBackgroundColor) {
        this.pointHoverBackgroundColor = pointHoverBackgroundColor;
        return this;
    }

    public Color getPointHoverBorderColor() {
        return pointHoverBorderColor;
    }

    public LineChartDataset setPointHoverBorderColor(Color pointHoverBorderColor) {
        this.pointHoverBorderColor = pointHoverBorderColor;
        return this;
    }

}
