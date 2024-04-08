package pl.training.charts.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CapStyle {

    BUTT, ROUND, SQUARE;

    @JsonValue
    public String forJson() {
        return this.name().toLowerCase();
    }

}
