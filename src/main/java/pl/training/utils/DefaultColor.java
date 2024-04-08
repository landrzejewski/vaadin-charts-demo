package pl.training.utils;

import java.util.ArrayList;
import java.util.List;

public class DefaultColor {


    public static final String[] DEFAULT_COLORS = new String[]{
            "#F93E58", "#FFD840", "#65EC3B", "#604BD8", "#FF9000",
            "#A101A6", "#0A64A4", "#A68400", "#9E0016", "#228D00",
            "#180773", "#FFCB00", "#F30021", "#34D800", "#2E16B1"};

    private int pointer = 0;

    public Color getNext(){
        if (DEFAULT_COLORS.length == ++pointer) {
            pointer = 0;
        }
        return new Color(DEFAULT_COLORS[pointer]);
    }

    public List<Color> listOfSize(int i) {
        List<Color> result = new ArrayList<>();
        for (int q = 0; q < i; q++) {
            result.add(getNext());
        }
        return result;
    }

}
