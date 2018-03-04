package com.playtech.agaponov;

import com.playtech.agaponov.interactors.ShapeInteractor;
import com.playtech.agaponov.shapes.CircleShape;
import com.playtech.agaponov.shapes.RectangleShape;
import com.playtech.agaponov.shapes.SquareShape;
import com.playtech.agaponov.shapes.TriangleShape;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void printMenu() {
        String[] menuItems = {
                "======Menu======",
                "1. Square",
                "2. Rectangle",
                "3. Circle",
                "4. Triangle",
                "5. Exit"
        };

        for (String item : menuItems) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        int MIN = 1;
        int MAX = 5;
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            userChoice = scanner.nextInt();
        } while (userChoice < MIN || userChoice > MAX);

        /**
        Это должен быть абстрактный класс с методом создания фигуры
        **/
        ShapeInteractor interactor = null;
        /**
        А уже в switch переменной interactor должен быть присвоен конкретный класс по созданию фигуры
        **/
        switch (userChoice) {
            case 1: {
                interactor = new ShapeInteractor(new SquareShape());
                break;
            }

            case 2: {
                interactor = new ShapeInteractor(new RectangleShape());
                break;
            }
            case 3: {
                interactor = new ShapeInteractor(new CircleShape());
                break;
            }
            case 4: {
                interactor = new ShapeInteractor(new TriangleShape());
                break;
            }
        }

        if (interactor != null) {
            interactor.printResult();
        }

    }
}
