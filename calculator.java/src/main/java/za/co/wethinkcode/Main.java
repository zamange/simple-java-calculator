package za.co.wethinkcode;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char operator;
        Double number1;
        Double number2;
        Double result;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        number2 = input.nextDouble();


        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;


            case '-':
                result = number1 - number2;
                System.out.println( number1 + " - "+ number2 + " = " + result);
                break;

        }

    }
}
