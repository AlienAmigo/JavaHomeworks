import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
  private static File log;
  private static FileWriter fileWriter;

  public void sort(int[] mas) {
    try {
      log = new File("log.txt");
      fileWriter = new FileWriter(log);
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

      for (int i = 0; i < mas.length - 1; i++) {
        boolean swapped = false; // Добавляем флаг для оптимизации сортировки
        for (int j = 0; j < mas.length - i - 1; j++) {
          if (mas[j] > mas[j + 1]) {
            int temp = mas[j];
            mas[j] = mas[j + 1];
            mas[j + 1] = temp;
            swapped = true; // Устанавливаем флаг, если произошла перестановка
          }
        }
        if (!swapped) {
          break; // Если не было перестановок, то массив уже отсортирован
        }
        fileWriter.write(dateFormat.format(new Date()) + " " + Arrays.toString(mas) + "\n");
      }
      fileWriter.write(dateFormat.format(new Date()) + " " + Arrays.toString(mas) + "\n");
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Main02 {
  public static void main(String[] args) {
    int[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      // arr = new int[]{9, 4, 8, 3, 1};
      arr = new int[] { 9, 4, 8, 3, 1 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .mapToInt(Integer::parseInt)
          .toArray();
    }

    BubbleSort ans = new BubbleSort();
    ans.sort(arr);

    try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
