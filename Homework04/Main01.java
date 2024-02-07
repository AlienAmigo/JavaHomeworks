import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> rez = new LinkedList<>();
        for (Object el : ll) {
            rez.addFirst(el);
        }
        return rez;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Main01 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        // LinkedList<Object> reversedList = answer.revert(ll);
        LinkedList<Object> reversedList = LLTasks.revert(ll);
        System.out.println(reversedList);
    }
}
