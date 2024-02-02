// Сформируйте SQL-запрос

// Инструкция по использованию платформы

// Дана строка sql-запроса:

// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.

// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

// Пример: Строка sql-запроса:

// select * from students where
// Параметры для фильтрации:

//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:

// select * from students where name='Ivanov' and country='Russia' and city='Moscow'

public class Main01 {
  public class Answer {
    public static String answer(String QUERY, String PARAMS) {
      StringBuilder whereClause = new StringBuilder();
      String[] params = PARAMS.split("[{},:\"]+");

      for (int i = 1; i < params.length; i += 2) {
        String key = params[i];
        String value = params[i + 1];
        if (!value.equals("null")) {
          if (whereClause.length() > 0) {
            whereClause.append(" and ");
          }
          whereClause.append(key).append("='").append(value).append("'");
        }
      }

      return QUERY + whereClause.toString();
    }
  }

  public static void main(String[] args) {
    Answer ans = new Answer();
    System.out.println(ans.answer(QUERY, PARAMS));
  }
}
