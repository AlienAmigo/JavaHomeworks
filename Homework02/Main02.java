import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main02 {

  // public class BubbleSort {

  // private static final Logger logger =
  // Logger.getLogger(BubbleSort.class.getName());

  // public static void main(String[] args) {
  // int[] arr = { 9, 4, 8, 3, 1 };
  // sort(arr);
  // }

  // public static void sort(int[] arr) {
  // try {
  // FileHandler fileHandler = new FileHandler("log.txt");
  // fileHandler.setFormatter(new SimpleFormatter());
  // logger.addHandler(fileHandler);
  // } catch (IOException e) {
  // e.printStackTrace();
  // }

  // logger.setLevel(Level.INFO);

  // logger.info("POrigin Array: " + Arrays.toString(arr));

  // int n = arr.length;
  // for (int i = 0; i < n - 1; i++) {
  // for (int j = 0; j < n - i - 1; j++) {
  // if (arr[j] > arr[j + 1]) {
  // int temp = arr[j];
  // arr[j] = arr[j + 1];
  // arr[j + 1] = temp;
  // }
  // }
  // logArray(arr);
  // }
  // }

  // private static void logArray(int[] arr) {
  // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd
  // HH:mm");
  // String timestamp = LocalDateTime.now().format(formatter);
  // logger.info(timestamp + " " + Arrays.toString(arr));
  // }
  // }
  public class BubbleSort {
    // private static File log;
    // private static FileWriter fileWriter;

    public static int[] realsort(int[] mas) {
      for (int i = 0; i < mas.length; i++) {
       mas[i] = mas[i];
      }

      for (int i = 0; i < mas.length - 1; i++) {
        for (int j = 1; j < mas.length - i; j++) {
          if (mas[j] < mas[j - 1]) {
            System.out.println(j + mas[j]);
            int temp = mas[j];
            mas[j] = mas[j - 1];
            mas[j - 1] = temp;
            System.out.println(j + Arrays.toString(mas));
          }
        }
      }


      return mas;
    }

    public static void sort(int[] mas) {
      ;

      System.out.println(Arrays.toString(BubbleSort.realsort(mas)));
    }
  }

  public static void main(String[] args) {
    int[] arr = { 9, 4, 8, 3, 1 };
    BubbleSort.sort(arr);
  }
}
