package com.playtech.agaponov.shapes;

import java.util.HashMap;
import java.util.Map;

/**
В этом классе должны быть поля: 3 стороны треугольника
**/
public class TriangleShape extends AbstractShape {
    @Override
    public boolean isValid() {
        Double sideA = getParams().get("sideA");
        Double sideB = getParams().get("sideB");
        Double sideC = getParams().get("sideC");

        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    @Override
    public Double getSquare() {
        Double sideA = getParams().get("sideA");
        Double sideB = getParams().get("sideB");
        Double sideC = getParams().get("sideC");

        Double p = (sideA + sideB + sideC) / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public Map<String, Double> getDefaultParams() {
        return new HashMap<String, Double>() {{
            put("sideA", 0.0);
            put("sideB", 0.0);
            put("sideC", 0.0);
        }};
    }
}
