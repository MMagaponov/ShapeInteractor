package com.playtech.agaponov.shapes;

import java.util.HashMap;
import java.util.Map;

public class CircleShape extends AbstractShape {
    @Override
    public boolean isValid() {
        return getParams().get("radius") > 0;
    }

    @Override
    public Double getSquare() {
        return Math.PI * Math.pow(getParams().get("radius"), 2);
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public Map<String, Double> getDefaultParams() {
        return  new HashMap<String, Double>() {{
            put("radius", 0.0);
        }};
    }
}
