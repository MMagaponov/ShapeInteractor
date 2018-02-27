package com.playtech.agaponov.shapes;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractShape {
    private Map<String, Double> params = new HashMap<>();

    public AbstractShape(Map<String, Double> params) {
        this.params = params;
    }

    public AbstractShape() {
    }

    public abstract boolean isValid();

    public abstract Double getSquare();

    public Map<String, Double> getParams() {
        return params;
    }

    public void setParams(Map<String, Double> params) {
        this.params = params;
    }

    public abstract String getName();

    public abstract Map<String, Double> getDefaultParams();
}
