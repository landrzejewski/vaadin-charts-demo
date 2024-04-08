package pl.training.charts.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SteppedLine {

    FALSE, BEFORE, AFTER, MIDDLE;

    @JsonValue
    public String forJson() {
        return this.name().toLowerCase();
    }

}
