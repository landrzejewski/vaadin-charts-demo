package pl.training.utils;

import com.fasterxml.jackson.annotation.JsonValue;

public class Color {

    private int r;
    private int g;
    private int b;

    private String hex;

    public Color(int r, int g, int b) {
        if (validate(r) && validate(g) && validate(b)) {
            this.r = r;
            this.g = g;
            this.b = b;
        } else {
            throw new IllegalArgumentException("params must be between 0 and 255");
        }
    }

    private boolean validate(int color) {
        return color <= 255 && color >= 0;
    }

    public Color(String hex) {
        this.hex = hex;
    }

    @JsonValue
    public String getHex(){
        return hex != null ? hex : String.format("#%02x%02x%02x", r, g, b);
    }

}
