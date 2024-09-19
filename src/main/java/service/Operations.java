package service;
import models.First_Number;
import models.Operator;
import models.Second_Number;

import java.util.Scanner;

public class Operations {

    public void operations(First_Number first_number, Operator operator, Second_Number second_number) {
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
