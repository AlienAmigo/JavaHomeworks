import java.util.Arrays;

class MergeSort {
  public static int[] mergeSort(int[] a) {
    if (a.length <= 1) {
      return a;
    }

    int mid = a.length / 2;
    int[] left = new int[mid];
    int[] right = new int[a.length - mid];

    System.arraycopy(a, 0, left, 0, left.length);
    System.arraycopy(a, mid, right, 0, right.length);

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
  }

  private static int[] merge(int[] left, int[] right) {
    int[] merged = new int[left.length + right.length];
    int i = 0; // Индекс для левой половины
    int j = 0; // Индекс для правой половины
    int k = 0; // Индекс для объединенного массива

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        merged[k++] = left[i++];
      } else {
        merged[k++] = right[j++];
      }
    }

    while (i < left.length) {
      merged[k++] = left[i++];
    }

    while (j < right.length) {
      merged[k++] = right[j++];
    }

    return merged;
  }

}

  private static void merge(int[] arr, int[] left, int[] right) {
    int i = 0; // Индекс для левой половины
    int j = 0; // Индекс для правой половины
    int k = 0; // Индекс для объединенного массива

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    while (i < left.length) {
      arr[k++] = left[i++];
    }

    while (j < right.length) {
      arr[k++] = right[j++];
    }
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Main01 {
  public static void main(String[] args) {
    int[] a;

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = new int[] { 5, 1, 6, 2, 3, 4 };
    } else {
      a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    // MergeSort answer = new MergeSort();
    String itresume_res = Arrays.toString(MergeSort.mergeSort(a));
    System.out.println(itresume_res);
  }
}
