package com.playtech.agaponov.shapes;

/**
В этом классе должно быть поле: сторона квадрата
**/
public class SquareShape extends RectangleShape {
    @Override
    public boolean isValid() {
        return getParams().get("width").equals(getParams().get("height"));
    }

    @Override
    public String getName() {
        return "Square";
    }
}
