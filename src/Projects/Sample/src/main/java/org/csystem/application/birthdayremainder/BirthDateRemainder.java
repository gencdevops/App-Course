package org.csystem.application.birthdayremainder;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthDateRemainder {

private Calendar m_birthDate;

public BirthDateRemainder(int day, int month , int year) {
    m_birthDate = new GregorianCalendar(day , month - 1, year);
}

}
