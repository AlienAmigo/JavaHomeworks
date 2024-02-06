import java.util.Arrays;
import java.util.ArrayList;

class Answer {
  public static void removeEvenNumbers(Integer[] arr) {
    // Введите свое решение ниже
    ArrayList<Integer> list = new ArrayList<>();
    for (int el : arr) {
      if (el % 2 != 0) {
        list.add(el);
      }
    }
    System.out.println(list);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Main02 {
  public static void main(String[] args) {
    Integer[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .map(Integer::parseInt)
          .toArray(Integer[]::new);
    }
    // Answer ans = new Answer();
    Answer.removeEvenNumbers(arr);
  }
}
