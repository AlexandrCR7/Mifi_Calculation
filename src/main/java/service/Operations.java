package service;

import java.util.Scanner;

public class Operations {

    public void calculation() {

        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        double number_one = scanner.nextDouble();

        System.out.println("Введите знак операции");
        Scanner scanner1 = new Scanner(System.in);
        String operator = scanner1.nextLine();

        System.out.println("Введите второе число");
        Scanner scanner2 = new Scanner(System.in);
        double number_two = scanner2.nextDouble();

        switch (operator) {
            case "-":
                Minus.minus(number_one, number_two);
                break;
            case "+":
                Plus.summation(number_one, number_two);
                break;
            case "/":
                Division.division(number_one, number_two);
                break;
            case "*":
                Multiplication.multiplication(number_one, number_two);
                break;
        }
    }
}
