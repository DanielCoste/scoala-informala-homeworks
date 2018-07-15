/**
 * Implement a basic arithmetic calculator in Java
*/
import java.util.Scanner;
import java.lang.String;

public class Calculator {



    public static void main(String[] args) {

        long number1, number2;
        String operator;
        boolean running = true;


        while (running) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter first number: ");
            number1 = scan.nextInt();
            System.out.println("Enter task: +, -, /, *");
            operator = scan.next();
            System.out.println("Enter second number: ");
            number2 = scan.nextInt();


            switch (operator) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    if (number2 == 0)
                        System.out.println("Cannot compute");
                    else
                        System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println(0);
                    break;


            }
            System.out.print("Try another calculation? Y/N"); //in functie de Y sau alt raspuns, trebuie sa intre inapoi in while loop
            String answer;
            Scanner scan2 = new Scanner(System.in);
            answer = scan2.next();

            if (answer.equals("Y")) {
                running = true;
            } else {
                running = false;
            }
        }
    }
}