package pl.training;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import pl.training.charts.Chart;
import pl.training.charts.model.*;
import pl.training.charts.model.enums.PieChartDataset;
import pl.training.utils.DefaultColor;

import java.util.Arrays;

@Route("")
public class DemoUi extends VerticalLayout {

    public DemoUi() {
        BarChartModel barChartModel = prepareBarChartDemoModel();
        Chart barChart = new Chart(barChartModel);
        barChart.setWidth("800px");
        barChart.setHeight("600px");
        add(barChart);

        //add(getText(barChartModel));

        LineChartModel lineChartModel = prepareLineChartDemoModel();
        Chart lineChart = new Chart(lineChartModel);
        lineChart.setWidth("800px");
        lineChart.setHeight("600px");
        add(lineChart);

        PieChartModel pieChartModel = preparePieChartModel();
        Chart pieChart = new Chart(pieChartModel);
        pieChart.setWidth("800px");
        pieChart.setHeight("600px");
        add(pieChart);

        DoughnutChartModel doughnutChartModel = prepareDoughnutChartModel();
        Chart doughnutChart = new Chart(doughnutChartModel);
        doughnutChart.setWidth("800px");
        doughnutChart.setHeight("600px");
        add(doughnutChart);
        //add(getText(lineChartModel));
    }

    private Text getText(Object barChartModel) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return new Text(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(barChartModel));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private PieChartModel preparePieChartModel() {
        DefaultColor color = new DefaultColor();
        PieChartModel model = new PieChartModel();
        ChartData data = new ChartData();
        PieChartDataset dataset = new PieChartDataset();
        dataset.setData(Arrays.asList(2478d, 5267d, 734d, 784d, 433d));
        dataset.setBackgroundColor(color.listOfSize(5));
        dataset.setLabel("Population (millions)");
        data.setDatasets(Arrays.asList(dataset));
        model.setData(data);
        Options options = new Options();
        options.setTitle(new Title().setDisplay(true).setText("Predicted world population (millions) in 2050"));
        model.setOptions(options);
        return model;
    }

    private DoughnutChartModel prepareDoughnutChartModel() {
        DefaultColor color = new DefaultColor();
        DoughnutChartModel model = new DoughnutChartModel();
        ChartData data = new ChartData();
        PieChartDataset dataset = new PieChartDataset();
        dataset.setData(Arrays.asList(2478d, 5267d, 734d, 784d, 433d));
        dataset.setBackgroundColor(color.listOfSize(5));
        dataset.setLabel("Population (millions)");
        data.setDatasets(Arrays.asList(dataset));
        model.setData(data);
        Options options = new Options();
        options.setTitle(new Title().setDisplay(true).setText("Predicted world population (millions) in 2050"));
        model.setOptions(options);
        return model;
    }

    private LineChartModel prepareLineChartDemoModel() {
        DefaultColor color = new DefaultColor();
        ChartData data = new ChartData();
        data.setLabels(Arrays.asList("1500", "1600", "1700", "1750", "1800", "1850", "1900", "1950", "1999", "2050"));

        LineChartDataset dataset = new LineChartDataset()
                .setBorderColor(color.getNext())
                .setFill(false);
        dataset.setLabel("Africa");
        dataset.setData(Arrays.asList(86d, 114d, 106D, 106d, 107d, 111d, 133d, 221d, 783d, 2478d));
        data.getDatasets().add(dataset);

        dataset = new LineChartDataset()
                .setBorderColor(color.getNext())
                .setHoverBackgroundColor(color.getNext())
                .setFill(false);
        dataset.setLabel("Asia");
        dataset.setData(Arrays.asList(282d, 350d, 411d, 502d, 635d, 809d, 947d, 1402d, 3700d, 5267d));
        data.getDatasets().add(dataset);

        dataset = new LineChartDataset()
                .setBorderColor(color.getNext())
                .setFill(false);
        dataset.setLabel("Europe");
        dataset.setData(Arrays.asList(168d, 170d, 178d, 190d, 203d, 276d, 408d, 547d, 675d, 734d));
        data.getDatasets().add(dataset);

        dataset = new LineChartDataset()
                .setBorderColor(color.getNext())
                .setFill(false);
        dataset.setLabel("Latin America");
        dataset.setData(Arrays.asList(40d, 20d, 10d, 16d, 24d, 38d, 74d, 167d, 508d, 784d));
        data.getDatasets().add(dataset);

        dataset = new LineChartDataset()
                .setBorderColor(color.getNext())
                .setFill(false);
        dataset.setLabel("North America");
        dataset.setData(Arrays.asList(6d, 3d, 2d, 2d, 7d, 26d, 82d, 172d, 312d, 433d));
        data.getDatasets().add(dataset);

        Title title = new Title()
                .setDisplay(true)
                .setText("World population per region (in millions)");

        Options options = new Options()
                .setTitle(title);

        LineChartModel barChartModel = new LineChartModel();
        barChartModel.setData(data);
        barChartModel.setOptions(options);
        return barChartModel;
    }


    private BarChartModel prepareBarChartDemoModel() {
        DefaultColor color = new DefaultColor();

        BarChartDataset dataset = new BarChartDataset();
        dataset.setLabel("Population (millions)");
        dataset.getData().add(2478D);
        dataset.getData().add(5267D);
        dataset.getData().add(734D);
        dataset.getData().add(784D);
        dataset.getData().add(433D);
        dataset.getBackgroundColor().add(color.getNext());
        dataset.getBackgroundColor().add(color.getNext());
        dataset.getBackgroundColor().add(color.getNext());
        dataset.getBackgroundColor().add(color.getNext());
        dataset.getBackgroundColor().add(color.getNext());

        ChartData data = new ChartData();
        data.getLabels().add("Africa");
        data.getLabels().add("Asia");
        data.getLabels().add("Europe");
        data.getLabels().add("Latin America");
        data.getLabels().add("North America");
        data.getDatasets().add(dataset);

        Title title = new Title()
                .setDisplay(true)
                .setText("Predicted world population (millions) in 2050");

        Options options = new Options()
                .setTitle(title);

        BarChartModel barChartModel = new BarChartModel();
        barChartModel.setData(data);
        barChartModel.setOptions(options);
        return barChartModel;
    }

}
