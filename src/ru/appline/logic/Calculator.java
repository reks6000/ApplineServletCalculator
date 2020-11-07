package ru.appline.logic;

public class Calculator {
    public static double add(double a, double b) {
        return a+b;
    }

    public static double sub(double a, double b) {
        return a-b;
    }

    public static double mult(double a, double b) {
        return a*b;
    }

    public static double div(double a, double b) {
        return a/b;
    }

    public static String parse(double a, double b, String operation) {
        String res;
        switch (operation) {
            case "+":
                return String.valueOf(add(a,b));
            case "-":
                return String.valueOf(sub(a,b));
            case "*":
                return String.valueOf(mult(a,b));
            case "/":
                if (b != 0) {
                    res = String.valueOf(div(a, b));
                } else {
                    res = "Ошибка: невозможно делить на 0";
                }
                return res;
            default:
                return "Недопустимая операция. Список возможных операций: +, -, *, /";
        }
    }
}
