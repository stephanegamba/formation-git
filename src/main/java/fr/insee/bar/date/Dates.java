package fr.insee.bar.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dates {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);

  public static String today() {
    return formatter.format(LocalDate.now());
  }
}