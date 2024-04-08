package pl.training.charts.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PointStyle {

    circle, cross, crossRot, dash, line, rect, rectRounded, rectRot, star, triangle;

    @JsonValue
    public String forJson() {
        return this.name();
    }

}
