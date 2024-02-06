import java.util.Arrays;
import java.util.ArrayList;

class Answer {
  public static void analyzeNumbers(Integer[] arr) {
    // Введите свое решение ниже
    ArrayList<Integer> list = new ArrayList<>();
    for (Integer el : arr) {
      list.add(el);
    }
    for (int i = 0; i < list.size(); i++) {
      for (int j = 1; j < list.size(); j++) {
        if (list.get(j - 1) > list.get(j)) {
          int temp = list.get(j);
          list.set(j, list.get(j - 1));
          list.set(j - 1, temp);
        }
      }
    }

    System.out.println(list);

    // Min / Max
    Integer min = list.get(0);
    Integer max = list.get(0);

    for (Integer el : list) {
      if (el < min) {
        min = el;
      }
      if (el > max) {
        max = el;
      }
    }
    System.out.println("Minimum is " + min);
    System.out.println("Maximum is " + max);

    // Average
    double average = 0;
    for (int el : list) {
      average += el;
    }
    average /= list.size();
    System.out.println("Average is = " + average);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Main03 {
  public static void main(String[] args) {
    Integer[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .map(Integer::parseInt)
          .toArray(Integer[]::new);
    }

    Answer.analyzeNumbers(arr);
  }
}
