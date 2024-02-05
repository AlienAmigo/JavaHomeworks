;
          if (whereClause.length() > 0) {
            whereClause.append(" and ");
          }
          whereClause.append(currentParam[0].replace("\"",
              "")).append("=").append(currentParam[1].replace("\"", "'"));
        }