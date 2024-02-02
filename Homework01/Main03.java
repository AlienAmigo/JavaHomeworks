// Реализуйте простой калькулятор

// В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

// В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

// Аргументы, передаваемые в метод/функцию:

// '3'
// '+'
// '7'
// На выходе:

// 10.0

public class Main03 {

  public static class Calculator {

    static double addition(int a, int b) {
      return Double.valueOf(a + b);
    }

    static double exculsion(int a, int b) {
      return Double.valueOf(a - b);
    }

    static double multiplication(int a, int b) {
      return Double.valueOf(a * b);
    }

    static double division(int a, int b) {
      if (b == 0) {
        return -1;
      } else {
        return Double.valueOf(a / b);
      }
    }

    public double calculate(char op, int a, int b) {
      // Введите свое решение ниже
      switch (op) {
        case '+': {
          return addition(a, b);
        }
        case '-': {
          return exculsion(a, b);
        }
        case '*': {
          return multiplication(a, b);
        }
        case '/': {
          return division(a, b);
        }

        default: {
          System.out.println("Некорректный оператор: " + op);
        }
      }
      return 0;
    }
  }

  public static void main(String[] args) {
    Calculator cl = new Calculator();
    System.out.println(cl.calculate("+".charAt(0), 3, 7));
  }
}
