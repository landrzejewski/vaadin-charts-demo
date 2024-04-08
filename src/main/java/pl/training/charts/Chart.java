package pl.training.charts;

import com.vaadin.flow.component.html.Div;
import pl.training.charts.model.AbstractChartModel;

public class Chart extends Div {

    public Chart(AbstractChartModel chartModel) {
        ChartJavaScriptComponent component = new ChartJavaScriptComponent(chartModel);
        add(component);
    }

}
