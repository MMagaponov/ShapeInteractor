package com.playtech.agaponov.interactors;

import com.playtech.agaponov.shapes.AbstractShape;

import java.util.Map;
import java.util.Scanner;

public class ShapeInteractor {
    private Scanner scanner = new Scanner(System.in);
    private AbstractShape shape;
    private Map<String, Double> shapeParams;

    public ShapeInteractor(AbstractShape shape) {
        this.shapeParams = shape.getDefaultParams();
        this.shape = shape;
    }

    private void promptParams() {
        for (Map.Entry<String, Double> param : shapeParams.entrySet()) {
            System.out.format("Enter %s: ", param.getKey());
            param.setValue(scanner.nextDouble());
        }
    }

    public void printResult() {
        promptParams();
        shape.setParams(shapeParams);

        if (shape.isValid()) {
            System.out.format("Square of %s is %s \n", shape.getName(), shape.getSquare());
        } else {
            System.out.format("%s is not valid %s", shape.getName(), shapeParams.toString());
        }
    }
}
