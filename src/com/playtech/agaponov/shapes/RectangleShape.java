package com.playtech.agaponov.shapes;

import java.util.HashMap;
import java.util.Map;

/**
В этом классе должны быть поля: 2 стороны прямоугольника
**/
public class RectangleShape extends AbstractShape {
    public RectangleShape(Map<String, Double> params) {
        super(params);
    }

    public RectangleShape() {
        super();
    }

    @Override
    public boolean isValid() {
        return getParams().get("width") > 0 && getParams().get("height") > 0;
    }

    @Override
    public Double getSquare() {
        return getParams().get("width") * getParams().get("height");
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public Map<String, Double> getDefaultParams() {
        return new HashMap<String, Double>() {{
            put("width", 0.0);
            put("height", 0.0);
        }};
    }
}
