package service;

public class CalculatorScanner {
    public Double first_number() {
        System.out.println("Введите первое число:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextDouble();
    }

    public String getOperator() {
        System.out.println("Введите знак операции:");
        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
        return scanner1.nextLine();
    }

    public Double second_number() {
        System.out.println("Введите второе число:");
        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        return scanner2.nextDouble();
    }

}
