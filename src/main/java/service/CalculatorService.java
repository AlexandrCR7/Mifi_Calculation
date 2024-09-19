package service;

import models.FirstNumber;
import models.Operator;
import models.SecondNumber;

import java.util.Scanner;

public class CalculatorService {

    public void calculatorService(){
        //Получаем значения из консоли
        CalculatorScanner numberOne = new CalculatorScanner();
        CalculatorScanner mathOperator = new CalculatorScanner();
        CalculatorScanner numberTwo = new CalculatorScanner();

        //Создаем объекты, поля которых заполняют значения, полученные из консоли
        FirstNumber one = new FirstNumber();
        one.setNumberOne(numberOne.first_number());

        Operator operator = new Operator();
        operator.setMathOperator(mathOperator.getOperator());

        SecondNumber two = new SecondNumber();
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
