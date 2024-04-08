package pl.training.charts.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CubicInterpolaionMode {

    DEFAULT,MONOTONE;

    @JsonValue
    public String forJson(){
        return this.name().toLowerCase();
    }

}
