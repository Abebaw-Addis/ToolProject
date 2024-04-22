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

  static void subtraction() {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter the first number to sub ");
    int c = input.nextInt();
    System.out.println(" Enter the second number to sub ");
    int d = input.nextInt();
    int dif = c - d;
    System.out.println(" Difference of numbers x= " + c + " and y= " + d + " is : " + dif);
  }

  static void multiplication() {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter the first number to mul ");
    int f = input.nextInt();
    System.out.println(" Enter the second number to mul ");
    int e = input.nextInt();
    int pro = f * e;
    System.out.println(" Product of numbers x= " + e + " and y= " + f + " is : " + pro);
  }

  static void division() {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter the first number to div ");
    int a = input.nextInt();
    System.out.println(" Enter the second number to div ");
    int b = input.nextInt();
    int q = a / b;
    System.out.println(" Qotient of numbers x= " + a + " and y= " + b + " is : " + q);
  }

}