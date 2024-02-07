import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
  private Deque<Double> stack;

  public Calculator() {
    stack = new ArrayDeque<>();
  }

  public double calculate(char op, int a, int b) {
    double result = 0.0;

    switch (op) {
      case '+':
        result = a + b;
        stack.push(result);
        break;
      case '-':
        result = a - b;
        stack.push(result);
        break;
      case '*':
        result = a * b;
        stack.push(result);
        break;
      case '/':
        if (b != 0) {
          result = a / b;
          stack.push(result);
        } else {
          System.out.println("Error: Division by zero");
        }
        break;
      case '<':
        if (stack.size() >= 2) {
          stack.pop();
          result = stack.peek();
        } else {
          System.out.println("Error: Not enough operations to undo");
        }
        break;
      default:
        System.out.println("Error: Invalid operator");
        break;
    }

    return result;
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Main03 {
  public static void main(String[] args) {
    int a, b, c, d;
    char op, op2, undo;

    if (args.length == 0) {
      a = 3;
      op = '+';
      b = 7;
      c = 4;
      op2 = '+';
      d = 7;
      undo = '<';
    } else {
      a = Integer.parseInt(args[0]);
      op = args[1].charAt(0);
      b = Integer.parseInt(args[2]);
      c = Integer.parseInt(args[3]);
      op2 = args[4].charAt(0);
      d = Integer.parseInt(args[5]);
      undo = args[6].charAt(0);
    }

    Calculator calculator = new Calculator();
    double result = calculator.calculate(op, a, b);
    System.out.println(result);
    double result2 = calculator.calculate(op2, c, d);
    System.out.println(result2);
    double prevResult = calculator.calculate(undo, 0, 0);
    System.out.println(prevResult);
  }
}
