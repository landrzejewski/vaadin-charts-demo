package pl.training.charts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import pl.training.charts.model.AbstractChartModel;

import java.util.UUID;

@JavaScript("chart.js")
@Tag("canvas")
public class ChartJavaScriptComponent extends Component {


    public ChartJavaScriptComponent(AbstractChartModel model) {
        try {
            String id = UUID.randomUUID().toString() + "-chart";
            setId(id);
            UI.getCurrent().getPage().executeJs(initJs(model, id));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("error building chart", e);
        }
    }

    private String initJs(AbstractChartModel model, String id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return "new Chart(document.getElementById(\"" + id + "\"), " + objectMapper.writeValueAsString(model) + ");";
    }

}
