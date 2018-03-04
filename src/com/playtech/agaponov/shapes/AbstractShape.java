package com.playtech.agaponov.shapes;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractShape {
    /**
    Параметры конкретной фигуры должны определятся в ее реализации 
    как поля класса.
    Map использовать не нужно, тем более мы ее не проходили пока еще.
    **/
    private Map<String, Double> params = new HashMap<>();

    public AbstractShape(Map<String, Double> params) {
        this.params = params;
    }

    public AbstractShape() {
    }

    /**
    Должен быть метод перимметра.
    По условию задачи метода такого нет.
    **/
    public abstract boolean isValid();

    public abstract Double getSquare();

    /**
    Класс фигура не знает ни о каких параметрах 
    **/
    public Map<String, Double> getParams() {
        return params;
    }
    
    /**
    Класс фигура не знает ни о каких параметрах 
    **/
    public void setParams(Map<String, Double> params) {
        this.params = params;
    }

    public abstract String getName();

    public abstract Map<String, Double> getDefaultParams();
}
