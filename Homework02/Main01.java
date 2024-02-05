/*

*/

import java.util.Arrays;

public class Main01 {
  public static class Answer {
    public static String answer(String QUERY, String PARAMS) {
      StringBuilder whereClause = new StringBuilder();
      String[] params = PARAMS.substring(1, PARAMS.length() - 1).split(",\s?");

      for (int i = 0; i < params.length; i++) {
        String[] currentParam = params[i].split(":");
        if (!(currentParam[1].contains("null"))) {
          System.out.println(currentParam[0]);
          if (whereClause.length() > 0) {
            whereClause.append(" and ");
          }
          whereClause.append(currentParam[0].substring(1, currentParam[0].length() - 1)).append("=")
              .append(currentParam[1].replace("\"", "'"));
        }
      }

      return QUERY + whereClause.toString();
    }
  }

  public static void main(String[] args) {
    String QUERY = "select * from students where ";
    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    Answer ans = new Answer();
    System.out.println(Answer.answer(QUERY, PARAMS));
  }
}
