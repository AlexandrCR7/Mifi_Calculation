package service;

import models.First_Number;
import models.Operator;
import models.Second_Number;

import java.util.Scanner;

public class CalculatorService {

    public void calculatorService(){
        //Получаем значения из консоли
        Calculator_Scanner numberOne = new Calculator_Scanner();
        Calculator_Scanner mathOperator = new Calculator_Scanner();
        Calculator_Scanner numberTwo = new Calculator_Scanner();

        //Создаем объекты, поля которых заполняют значения, полученные из консоли
        First_Number one = new First_Number();
        one.setNumberOne(numberOne.first_number());

        Operator operator = new Operator();
        operator.setMathOperator(mathOperator.getOperator());

        Second_Number two = new Second_Number();
        two.setNumberTwo(numberTwo.second_number());

        //Проверяем не является ли второе число нулем и знак операции делением
        while (operator.getMathOperator().equals("/") && two.getNumberTwo().equals(0.0)) {
            System.out.println("Делить на 0 нельзя, повторите ввод: ");
            Scanner scanner = new Scanner(System.in);
            two.setNumberTwo(scanner.nextDouble());
        }

        //Выполняем операции калькулятора
        Operations operations = new Operations();
        operations.operations(one, operator, two);
    }
}
