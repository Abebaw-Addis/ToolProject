package calculator;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println(
        " + for Addition \n - for Subtraction \n * for Multimplication \n / for Division \n % for Remainder \n ");
    Scanner input = new Scanner(System.in);
    char x = input.nextLine().charAt(0);
    switch (x) {
      case '+':
        addition();
        System.out.println(" Addition is Ended ");
        break;
      case '-':
        subtraction();
        System.out.println(" Subtraction is Ended ");
        break;
      case '*':
        multiplication();
        System.out.println(" Multiplication is Ended ");
        break;
      case '/':
        division();
        System.out.println(" Division is Ended ");
        break;
      case '%':
        remainder();
        System.out.println(" Remainder is Ended ");
        break;
      default:
        System.out.println(" You Entered Unmatched Character");
        break;
    }
  }

  static void addition() {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter the first number to add ");
    int x = input.nextInt();
    System.out.println(" Enter the second number to add ");
    int y = input.nextInt();
    int sum = x + y;
    System.out.println(" Sum of numbers x= " + x + " and y= " + y + " is : " + sum);
  }
}