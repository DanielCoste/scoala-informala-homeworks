/**
 * Implement a Number of Days in a Month calculator using a switch statement.
 * 1. Am vrut sa fac un while loop ca sa reia de la inceput programul in functie de input
 * 2. Nu am mai pus case pentru ani bisecti pentru ca m-am concetrat pe punctul 1.
 */
import java.util.Scanner;
import java.lang.String;
import java.util.*;
import java.text.*;


public class DaysInMonth {

    public static void main(String[] args) {
        boolean running = true; //boolean pentru while loop, running ar trebui sa se schimbe in functie de input
                int month;
        while (running) {
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter Month 1-12");
        month = scan.nextInt();

        if (month > 12 && month < 1) {
            System.out.println("Only numbers between 1 and 12 are accepted."); //nu stiu de ce acest if nu functioneaza
        } else {

                switch (month) {
                    case 2:
                        System.out.println("28");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30");
                        break;
                    default:
                        System.out.println("31");
                        break;

                }
                System.out.print("Try another Month? Y/N"); //in functie de Y sau alt raspuns, trebuie sa intre inapoi in while loop
                String answer;
                Scanner scan2 = new Scanner(System.in);
                answer = scan2.next();

                if (answer.equals("Y")) {
                    running = true;
                } else {
                    running = false;
                }
                // }while (running == true); //in functie de Y sau alt raspuns, trebuie sa intre inapoi in while loop

            }

        }
    }}


