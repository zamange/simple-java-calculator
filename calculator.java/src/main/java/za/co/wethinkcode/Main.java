package za.co.wethinkcode;

import java.util.Scanner;

class Main {
    Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        System.out.println("Enter first number: ");
        Double number1 = input.nextDouble();
    }}