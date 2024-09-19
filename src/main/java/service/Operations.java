package service;
import models.FirstNumber;
import models.Operator;
import models.SecondNumber;

public class Operations {

    public void operations(FirstNumber first_number, Operator operator, SecondNumber second_number) {
        switch (operator.getMathOperator()) {
            case "-":
                System.out.println(first_number.getNumberOne() - second_number.getNumberTwo());
                break;
            case "+":
                System.out.println(first_number.getNumberOne() + second_number.getNumberTwo());
                break;
            case "/":
                System.out.println(first_number.getNumberOne() / second_number.getNumberTwo());
                break;
            case "*":
                System.out.println(first_number.getNumberOne() * second_number.getNumberTwo());
                break;
        }
    }


}
