package pl.training.charts.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JoinStyle {

    BEVEL,ROUND,MITER;

    @JsonValue
    public String forJson(){
        return this.name().toLowerCase();
    }

}
