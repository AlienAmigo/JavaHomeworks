// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.

// Пример

// 2
// 3
// 5
// 7
// 11
// ...

public class Main02 {
  public class Answer {
    public static void printPrimeNums() {
      // Напишите свое решение ниже
      for (int i = 2; i <= 1000; i++) {
        if (isPrime(i)) {
          System.out.println(i);
        }
      }
    }

    public static boolean isPrime(int num) {
      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          return false;
        }
      }
      return true;
    }
  }

  static public void main(String[] args) {
    Answer.printPrimeNums();
  }
}
